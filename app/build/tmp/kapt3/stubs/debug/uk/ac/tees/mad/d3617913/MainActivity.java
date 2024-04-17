package uk.ac.tees.mad.d3617913;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import androidx.activity.ComponentActivity;
import androidx.compose.ui.Modifier;
import androidx.core.view.WindowCompat;
import androidx.lifecycle.ViewModelProvider;
import com.google.firebase.auth.FirebaseAuth;
import dagger.hilt.android.AndroidEntryPoint;
import uk.ac.tees.mad.d3617913.data.LoginViewModel;

@dagger.hilt.android.AndroidEntryPoint
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014J\b\u0010\u0014\u001a\u00020\u0011H\u0014R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0015"}, d2 = {"Luk/ac/tees/mad/d3617913/MainActivity;", "Landroidx/activity/ComponentActivity;", "()V", "currentUser", "Lcom/google/firebase/auth/FirebaseUser;", "loginViewModel", "Luk/ac/tees/mad/d3617913/data/LoginViewModel;", "getLoginViewModel", "()Luk/ac/tees/mad/d3617913/data/LoginViewModel;", "loginViewModel$delegate", "Lkotlin/Lazy;", "viewModel", "Luk/ac/tees/mad/d3617913/MainViewModel;", "getViewModel", "()Luk/ac/tees/mad/d3617913/MainViewModel;", "viewModel$delegate", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "app_debug"})
public final class MainActivity extends androidx.activity.ComponentActivity {
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy loginViewModel$delegate = null;
    @org.jetbrains.annotations.Nullable
    private final com.google.firebase.auth.FirebaseUser currentUser = null;
    
    public MainActivity() {
        super();
    }
    
    private final uk.ac.tees.mad.d3617913.MainViewModel getViewModel() {
        return null;
    }
    
    private final uk.ac.tees.mad.d3617913.data.LoginViewModel getLoginViewModel() {
        return null;
    }
    
    @java.lang.Override
    protected void onStart() {
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
}