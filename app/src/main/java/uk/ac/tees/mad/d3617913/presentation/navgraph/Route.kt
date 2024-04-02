package uk.ac.tees.mad.d3617913.presentation.navgraph

sealed class Route(
    val route: String
) {
    object OnBoardingScreen : Route(route = "onBoardingScreen")
    object HomeScreen : Route(route = "homeScreen")
    object HistoryScreen : Route(route = "HistoryScreen")
    object ProfileScreen : Route(route = "ProfileScreen")
    object AppStartNavigation : Route(route = "AppStartNavigation")
    object ParkNavigation : Route(route = "ParkNavigation")
    object ParkNavigatorScreen : Route(route = "ParkNavigatorScreen")


}