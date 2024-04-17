package uk.ac.tees.mad.d3617913.data

import android.util.Log
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.google.firebase.auth.FirebaseAuth
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.tasks.await
import kotlinx.coroutines.withContext
import uk.ac.tees.mad.d3617913.data.rules.Validator
import uk.ac.tees.mad.d3617913.presentation.navigation.Screen
import uk.ac.tees.mad.d3617913.presentation.navigation.ScreenRouter

class LoginViewModel : ViewModel() {
    private val TAG = SignupViewModel::class.simpleName

    private var _logInSuccess = MutableStateFlow(false)
    val logInSuccess get() = _logInSuccess

    private val viewModelScope = CoroutineScope(Dispatchers.Main)

    var loginUiState = mutableStateOf(LoginUiState())

    var allResultPassed = mutableStateOf(false)

    var loginInProgress = mutableStateOf(false)

    var errorMessage = mutableStateOf<String?>(null)

    fun onEvent(event: LoginUIEvents) {
        when (event) {
            is LoginUIEvents.EmailChange -> {
                loginUiState.value = loginUiState.value.copy(email = event.email)
            }

            is LoginUIEvents.PasswordChange -> {
                loginUiState.value = loginUiState.value.copy(password = event.password)
            }

            is LoginUIEvents.LoginButtonClicked -> {
                login()
            }
        }
        validateLoginWithRule()
    }

    private fun validateLoginWithRule() {
        val emailResult = Validator.validateEmail(
            email = loginUiState.value.email
        )

        val passwordResult = Validator.validatePassword(
            password = loginUiState.value.password
        )

        loginUiState.value = loginUiState.value.copy(
            emailError = emailResult.status, passwordError = passwordResult.status
        )

        allResultPassed.value = emailResult.status && passwordResult.status
    }

    private fun login() {
        viewModelScope.launch {

            loginInProgress.value = true

            val email = loginUiState.value.email
            val password = loginUiState.value.password

            try {
                withContext(Dispatchers.IO) {
                    FirebaseAuth.getInstance().signInWithEmailAndPassword(email, password).await()
                }
                Log.d(TAG, "Inside_login_success")
                errorMessage.value = "Login Successful"
                loginInProgress.value = false
                _logInSuccess.value = true
                ScreenRouter.navigateTo(Screen.Navigator)
            } catch (e: Exception) {
                Log.d(TAG, "Inside_login_failure")
                e.localizedMessage?.let { it1 -> Log.d(TAG, it1) }
                errorMessage.value = e.localizedMessage
                loginInProgress.value = false
            }
        }
    }
}