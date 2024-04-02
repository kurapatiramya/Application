package uk.ac.tees.mad.d3617913.presentation.auth

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import uk.ac.tees.mad.d3617913.presentation.common.HeadingTextComponent
import uk.ac.tees.mad.d3617913.presentation.common.MyTextFieldComponent
import uk.ac.tees.mad.d3617913.presentation.common.NormalTextComponent
import uk.ac.tees.mad.d3617913.R
import uk.ac.tees.mad.d3617913.presentation.common.ButtonComponent
import uk.ac.tees.mad.d3617913.presentation.common.CheckboxComponent
import uk.ac.tees.mad.d3617913.presentation.common.ClickableLoginTextComponent
import uk.ac.tees.mad.d3617913.presentation.common.DividerTextComponent
import uk.ac.tees.mad.d3617913.presentation.common.PasswordTextFieldComponent


@Composable
fun SignUpScreen(

) {
    Surface(
        modifier = Modifier
            .background(MaterialTheme.colorScheme.background)
            .padding(16.dp)
    ) {
        Column(modifier = Modifier.fillMaxSize()) {

//            NormalTextComponent(value = stringResource(id = R.string.hello))
            HeadingTextComponent(value = stringResource(id = R.string.create_account))
            Spacer(modifier = Modifier.height(20.dp))

            MyTextFieldComponent(
                labelValue = stringResource(id = R.string.first_name),
                painterResource(id = R.drawable.profile),
                onTextChanged = {
//                    signupViewModel.onEvent(SignupUIEvent.FirstNameChanged(it))
                },
//                errorStatus = signupViewModel.registrationUIState.value.firstNameError
            )

            MyTextFieldComponent(
                labelValue = stringResource(id = R.string.last_name),
                painterResource = painterResource(id = R.drawable.profile),
                onTextChanged = {
//                    signupViewModel.onEvent(SignupUIEvent.LastNameChanged(it))
                },
//                errorStatus = signupViewModel.registrationUIState.value.lastNameError
            )

            MyTextFieldComponent(
                labelValue = stringResource(id = R.string.email),
                painterResource = painterResource(id = R.drawable.message),
                onTextChanged = {
//                    signupViewModel.onEvent(SignupUIEvent.EmailChanged(it))
                },
//                errorStatus = signupViewModel.registrationUIState.value.emailError
            )

            PasswordTextFieldComponent(
                labelValue = stringResource(id = R.string.password),
                painterResource = painterResource(id = R.drawable.ic_lock),
                onTextSelected = {
//                    signupViewModel.onEvent(SignupUIEvent.PasswordChanged(it))
                },
//                errorStatus = signupViewModel.registrationUIState.value.passwordError
            )

            CheckboxComponent(value = stringResource(id = R.string.terms_and_conditions),
                onTextSelected = {
//                    PostOfficeAppRouter.navigateTo(Screen.TermsAndConditionsScreen)
                },
                onCheckedChange = {
//                    signupViewModel.onEvent(SignupUIEvent.PrivacyPolicyCheckBoxClicked(it))
                }
            )

            Spacer(modifier = Modifier.height(40.dp))

            ButtonComponent(
                value = stringResource(id = R.string.register),
                onButtonClicked = {
//                    signupViewModel.onEvent(SignupUIEvent.RegisterButtonClicked)
                },
//                isEnabled = signupViewModel.allValidationsPassed.value
            )

            Spacer(modifier = Modifier.height(20.dp))

            DividerTextComponent()

            ClickableLoginTextComponent(tryingToLogin = true, onTextSelected = {
//                PostOfficeAppRouter.navigateTo(Screen.LoginScreen)
            })
        }

    }

//    if(signupViewModel.signUpInProgress.value) {
//        CircularProgressIndicator()
    }
//}


//}

@Preview
@Composable
fun DefaultPreviewOfSignUpScreen() {
    SignUpScreen()
}