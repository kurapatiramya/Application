package uk.ac.tees.mad.d3617913.presentation.navigation

import android.util.Log
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import uk.ac.tees.mad.d3617913.presentation.screens.home.ParkingSpot

sealed class Screen {

    data object LoginScreen : Screen()
    data object SignUpScreen : Screen()
    data object Navigator : Screen()
    data class BookingScreen(val parkingSpot: ParkingSpot) : Screen()

}

object ScreenRouter {

    var currentScreen: MutableState<Screen> = mutableStateOf(Screen.LoginScreen)
    fun navigateTo(destination: Screen) {
        Log.d("ScreenRouter", "Navigating to $destination")
        currentScreen.value = destination
    }

}
