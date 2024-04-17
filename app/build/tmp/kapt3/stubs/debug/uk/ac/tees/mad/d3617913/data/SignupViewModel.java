package uk.ac.tees.mad.d3617913.data;

import android.util.Log;
import androidx.lifecycle.ViewModel;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuth.AuthStateListener;
import uk.ac.tees.mad.d3617913.data.rules.Validator;
import uk.ac.tees.mad.d3617913.presentation.navigation.Screen;
import uk.ac.tees.mad.d3617913.presentation.navigation.ScreenRouter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0017J\b\u0010\u0018\u001a\u00020\u0014H\u0002J\b\u0010\u0019\u001a\u00020\u0014H\u0002J\u0018\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u0004H\u0002J\b\u0010\u001d\u001a\u00020\u0014H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR \u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000bR \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\t\"\u0004\b\u0012\u0010\u000b\u00a8\u0006\u001e"}, d2 = {"Luk/ac/tees/mad/d3617913/data/SignupViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "TAG", "", "allResultPassed", "Landroidx/compose/runtime/MutableState;", "", "getAllResultPassed", "()Landroidx/compose/runtime/MutableState;", "setAllResultPassed", "(Landroidx/compose/runtime/MutableState;)V", "registrationUiState", "Luk/ac/tees/mad/d3617913/data/SignupUiState;", "getRegistrationUiState", "setRegistrationUiState", "signUpInProgress", "getSignUpInProgress", "setSignUpInProgress", "logout", "", "onEvent", "event", "Luk/ac/tees/mad/d3617913/data/SignupUIEvents;", "printButtonState", "printState", "storeUserInFirebase", "email", "password", "validateDataWithRules", "app_debug"})
public final class SignupViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.Nullable
    private final java.lang.String TAG = null;
    @org.jetbrains.annotations.NotNull
    private androidx.compose.runtime.MutableState<uk.ac.tees.mad.d3617913.data.SignupUiState> registrationUiState;
    @org.jetbrains.annotations.NotNull
    private androidx.compose.runtime.MutableState<java.lang.Boolean> allResultPassed;
    @org.jetbrains.annotations.NotNull
    private androidx.compose.runtime.MutableState<java.lang.Boolean> signUpInProgress;
    
    public SignupViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.MutableState<uk.ac.tees.mad.d3617913.data.SignupUiState> getRegistrationUiState() {
        return null;
    }
    
    public final void setRegistrationUiState(@org.jetbrains.annotations.NotNull
    androidx.compose.runtime.MutableState<uk.ac.tees.mad.d3617913.data.SignupUiState> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.MutableState<java.lang.Boolean> getAllResultPassed() {
        return null;
    }
    
    public final void setAllResultPassed(@org.jetbrains.annotations.NotNull
    androidx.compose.runtime.MutableState<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.MutableState<java.lang.Boolean> getSignUpInProgress() {
        return null;
    }
    
    public final void setSignUpInProgress(@org.jetbrains.annotations.NotNull
    androidx.compose.runtime.MutableState<java.lang.Boolean> p0) {
    }
    
    public final void onEvent(@org.jetbrains.annotations.NotNull
    uk.ac.tees.mad.d3617913.data.SignupUIEvents event) {
    }
    
    private final void validateDataWithRules() {
    }
    
    private final void printButtonState() {
    }
    
    private final void printState() {
    }
    
    private final void storeUserInFirebase(java.lang.String email, java.lang.String password) {
    }
    
    public final void logout() {
    }
}