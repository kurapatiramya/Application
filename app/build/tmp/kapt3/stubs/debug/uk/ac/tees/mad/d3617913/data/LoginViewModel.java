package uk.ac.tees.mad.d3617913.data;

import android.util.Log;
import androidx.lifecycle.ViewModel;
import com.google.firebase.auth.FirebaseAuth;
import kotlinx.coroutines.Dispatchers;
import uk.ac.tees.mad.d3617913.data.rules.Validator;
import uk.ac.tees.mad.d3617913.presentation.navigation.Screen;
import uk.ac.tees.mad.d3617913.presentation.navigation.ScreenRouter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0002J\u000e\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020!J\b\u0010\"\u001a\u00020\u001eH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000b\"\u0004\b\u0016\u0010\rR \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000b\"\u0004\b\u001a\u0010\rR\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006#"}, d2 = {"Luk/ac/tees/mad/d3617913/data/LoginViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "TAG", "", "_logInSuccess", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "allResultPassed", "Landroidx/compose/runtime/MutableState;", "getAllResultPassed", "()Landroidx/compose/runtime/MutableState;", "setAllResultPassed", "(Landroidx/compose/runtime/MutableState;)V", "errorMessage", "getErrorMessage", "setErrorMessage", "logInSuccess", "getLogInSuccess", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "loginInProgress", "getLoginInProgress", "setLoginInProgress", "loginUiState", "Luk/ac/tees/mad/d3617913/data/LoginUiState;", "getLoginUiState", "setLoginUiState", "viewModelScope", "Lkotlinx/coroutines/CoroutineScope;", "login", "", "onEvent", "event", "Luk/ac/tees/mad/d3617913/data/LoginUIEvents;", "validateLoginWithRule", "app_debug"})
public final class LoginViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.Nullable
    private final java.lang.String TAG = null;
    @org.jetbrains.annotations.NotNull
    private kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> _logInSuccess;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.CoroutineScope viewModelScope = null;
    @org.jetbrains.annotations.NotNull
    private androidx.compose.runtime.MutableState<uk.ac.tees.mad.d3617913.data.LoginUiState> loginUiState;
    @org.jetbrains.annotations.NotNull
    private androidx.compose.runtime.MutableState<java.lang.Boolean> allResultPassed;
    @org.jetbrains.annotations.NotNull
    private androidx.compose.runtime.MutableState<java.lang.Boolean> loginInProgress;
    @org.jetbrains.annotations.NotNull
    private androidx.compose.runtime.MutableState<java.lang.String> errorMessage;
    
    public LoginViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> getLogInSuccess() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.MutableState<uk.ac.tees.mad.d3617913.data.LoginUiState> getLoginUiState() {
        return null;
    }
    
    public final void setLoginUiState(@org.jetbrains.annotations.NotNull
    androidx.compose.runtime.MutableState<uk.ac.tees.mad.d3617913.data.LoginUiState> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.MutableState<java.lang.Boolean> getAllResultPassed() {
        return null;
    }
    
    public final void setAllResultPassed(@org.jetbrains.annotations.NotNull
    androidx.compose.runtime.MutableState<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.MutableState<java.lang.Boolean> getLoginInProgress() {
        return null;
    }
    
    public final void setLoginInProgress(@org.jetbrains.annotations.NotNull
    androidx.compose.runtime.MutableState<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.MutableState<java.lang.String> getErrorMessage() {
        return null;
    }
    
    public final void setErrorMessage(@org.jetbrains.annotations.NotNull
    androidx.compose.runtime.MutableState<java.lang.String> p0) {
    }
    
    public final void onEvent(@org.jetbrains.annotations.NotNull
    uk.ac.tees.mad.d3617913.data.LoginUIEvents event) {
    }
    
    private final void validateLoginWithRule() {
    }
    
    private final void login() {
    }
}