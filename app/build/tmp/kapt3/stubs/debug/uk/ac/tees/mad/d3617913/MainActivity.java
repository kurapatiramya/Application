package uk.ac.tees.mad.d3617913;

import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.compose.runtime.Composable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.tooling.preview.Preview;
import androidx.core.view.WindowCompat;
import dagger.hilt.android.AndroidEntryPoint;
import dagger.hilt.android.lifecycle.HiltViewModel;
import uk.ac.tees.mad.d3617913.domain.usecases.app_entry.AppEntryUseCases;
import uk.ac.tees.mad.d3617913.presentation.onboarding.OnBoardingViewModel;
import javax.inject.Inject;

@dagger.hilt.android.AndroidEntryPoint
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\r"}, d2 = {"Luk/ac/tees/mad/d3617913/MainActivity;", "Landroidx/activity/ComponentActivity;", "()V", "viewModel", "Luk/ac/tees/mad/d3617913/MainViewModel;", "getViewModel", "()Luk/ac/tees/mad/d3617913/MainViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public final class MainActivity extends androidx.activity.ComponentActivity {
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy viewModel$delegate = null;
    
    public MainActivity() {
        super();
    }
    
    private final uk.ac.tees.mad.d3617913.MainViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
}