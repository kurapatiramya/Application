package uk.ac.tees.mad.d3617913

import android.util.Log
import androidx.compose.animation.Crossfade
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import uk.ac.tees.mad.d3617913.presentation.auth.LoginScreen
import uk.ac.tees.mad.d3617913.presentation.auth.SignUpScreen
import uk.ac.tees.mad.d3617913.presentation.navigation.BottomNavigation
import uk.ac.tees.mad.d3617913.presentation.navigation.Screen
import uk.ac.tees.mad.d3617913.presentation.navigation.ScreenRouter
import uk.ac.tees.mad.d3617913.presentation.screens.booking.BookingScreen
import uk.ac.tees.mad.d3617913.presentation.screens.explore.ExploreScreen
import uk.ac.tees.mad.d3617913.presentation.screens.home.HomeScreen
import uk.ac.tees.mad.d3617913.presentation.screens.profile.ProfileData
import uk.ac.tees.mad.d3617913.presentation.screens.profile.ProfileScreen

@Composable
fun ParkEaseApp() {

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color.White
    ) {
        Crossfade(targetState = ScreenRouter.currentScreen, label = "") { currentState ->
            Log.d("ParkEaseApp", "Current screen: $currentState")
            when (currentState.value) {
                is Screen.SignUpScreen -> {
                    SignUpScreen()
                }

                is Screen.LoginScreen -> {
                    LoginScreen()

                }

                is Screen.Navigator -> {
                    BottomNavigation()
                }

                is Screen.BookingScreen -> {
                    BookingScreen(parkingSpot = (currentState.value as Screen.BookingScreen).parkingSpot)
                }
            }
        }
    }
}
