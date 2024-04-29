package uk.ac.tees.mad.d3617913.presentation.navigation

import android.app.Activity
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Explore
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.outlined.Explore
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.outlined.Person2
import androidx.compose.material.icons.outlined.Person3
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import uk.ac.tees.mad.d3617913.R
import uk.ac.tees.mad.d3617913.presentation.auth.LoginScreen
import uk.ac.tees.mad.d3617913.presentation.screens.booking.BookingScreen
import uk.ac.tees.mad.d3617913.presentation.screens.explore.ExploreScreen
import uk.ac.tees.mad.d3617913.presentation.screens.home.HomeScreen
import uk.ac.tees.mad.d3617913.presentation.screens.home.ParkingSpot
import uk.ac.tees.mad.d3617913.presentation.screens.home.parkingSpots
import uk.ac.tees.mad.d3617913.presentation.screens.profile.ProfileData
import uk.ac.tees.mad.d3617913.presentation.screens.profile.ProfileScreen
import uk.ac.tees.mad.d3617913.ui.theme.ParkEaseTheme

@Composable
fun BottomNavigation() {

    ParkEaseTheme(
        darkTheme = false, dynamicColor = false
    ) {
        Surface(
            color = MaterialTheme.colorScheme.background,
            modifier = Modifier.fillMaxSize()
        ) {
            val navController = rememberNavController()

            Scaffold(
                bottomBar = {
                    //Item in bottom bar
                    val bottomBarItems = listOf(
                        BottomNavigationItem(
                            title = "Home",
                            route = "Home_Screen",
                            selectedIcon = Icons.Filled.Home,
                            unselectedIcon = Icons.Outlined.Home,
                        ),
                        BottomNavigationItem(
                            title = "Explore",
                            route = "Explore_Screen",
                            selectedIcon = Icons.Filled.Explore,
                            unselectedIcon = Icons.Outlined.Explore,
                        ),
                        BottomNavigationItem(
                            title = "Profile",
                            route = "Profile_Screen",
                            selectedIcon = Icons.Filled.Person,
                            unselectedIcon = Icons.Outlined.Person,
                        )
                    )

                    BottomNav(items = bottomBarItems, navController = navController,
                        onItemClicked = { item ->
                            navController.navigate(item.route)
                        }
                    )
                }

            ) { innerPadding ->
                Surface(
                    modifier = Modifier
                        .padding(innerPadding)
                        .fillMaxSize()
                ) {
                    NavigationForHome(navHostController = navController)
                }
            }
            // Call the HandleBackButton function here
//            HandleBackButton(navController = navController)
        }
    }
}


//Bottom Navigation Bar for Home Screen
@Composable
fun BottomNav(
    items: List<BottomNavigationItem>,
    navController: NavController,
    onItemClicked: (BottomNavigationItem) -> Unit
) {
    NavigationBar(
        modifier = Modifier
            .shadow(2.dp)
            .height(70.dp),
        containerColor = colorResource(id = R.color.card_background)
    ) {
        //to remember back state
        val backStackEntry = navController.currentBackStackEntryAsState()

        items.forEachIndexed { index, bottomNavigationItem ->
            NavigationBarItem(
                selected = bottomNavigationItem.route == backStackEntry.value?.destination?.route,
                onClick = {
                    onItemClicked(bottomNavigationItem)
                },
                label = {
                    if (bottomNavigationItem.route == backStackEntry.value?.destination?.route) {
                        Text(
                            text = bottomNavigationItem.title,
                            fontWeight = FontWeight(600),
                            color = MaterialTheme.colorScheme.primary
                        )
                    } else {
                        Text(
                            text = bottomNavigationItem.title,
                            fontWeight = FontWeight(500),
                            color = Color.Gray
                        )
                    }
                },
                alwaysShowLabel = true,
                icon = {
                    if (bottomNavigationItem.route == backStackEntry.value?.destination?.route) {
                        Icon(
                            bottomNavigationItem.selectedIcon,
                            contentDescription = bottomNavigationItem.title,
                            tint = MaterialTheme.colorScheme.primary
                        )
                    } else {
                        Icon(
                            bottomNavigationItem.unselectedIcon,
                            contentDescription = bottomNavigationItem.title,
                            tint = MaterialTheme.colorScheme.secondary
                        )
                    }
                }
            )
        }
    }
}

@Composable
fun NavigationForHome(
    navHostController: NavHostController
) {

    NavHost(navController = navHostController, startDestination = "Home_Screen") {
        composable("Home_Screen") {
            HomeScreen(
                navController = navHostController
            )
        }

        composable("Explore_Screen") {
            ExploreScreen()

        }

        composable("Profile_Screen") {
            ProfileScreen(
                userProfile = ProfileData(
                    name = "John Doe",
                    profileImage = painterResource(id = R.drawable.profile_pic_2),
                    gender = "F"
                ),
                navController = navHostController
            )
        }

        composable("login") {
            LoginScreen()
        }

        composable("booking/{parkingSpotId}") { backStackEntry ->
            val parkingSpotId = backStackEntry.arguments?.getString("parkingSpotId")
            val parkingSpot = parkingSpots.find { it.id == parkingSpotId }
            if (parkingSpot != null) {
                BookingScreen(parkingSpot = parkingSpot)
            } else {
                // Handle the case where the parkingSpot is not found
            }
        }

    }
}

//@Composable
//fun HandleBackButton(navController: NavHostController) {
//    val currentDestination = navController.currentBackStackEntryAsState().value?.destination
//    val context = LocalContext.current
//
//    SystemBackButtonHandler {
//        if (currentDestination?.route == "Home_Screen") {
//            // Exit the application
//            (context as Activity).finish()
//        } else {
//            // Navigate back
//            navController.popBackStack()
//        }
//    }
//}
