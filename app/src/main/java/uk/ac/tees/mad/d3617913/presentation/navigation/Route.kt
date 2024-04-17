package uk.ac.tees.mad.d3617913.presentation.navigation

sealed class Route(
    val route: String
) {
    object AppStartNavigation : Route(route = "AppStartNavigation")
    object ParkNavigation : Route(route = "ParkNavigation")

}
