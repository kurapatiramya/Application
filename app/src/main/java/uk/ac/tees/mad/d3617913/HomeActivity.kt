package uk.ac.tees.mad.d3617913

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import uk.ac.tees.mad.d3617913.presentation.navigation.BottomNavigation
import uk.ac.tees.mad.d3617913.presentation.screens.home.HomeScreen
import uk.ac.tees.mad.d3617913.ui.theme.ParkEaseTheme

class HomeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            ParkEaseTheme(darkTheme = false, dynamicColor = false) {
                BottomNavigation()
            }
        }
    }

}