package uk.ac.tees.mad.d3617913.presentation.screens.explore.maps

import com.google.maps.android.compose.MapProperties
import com.google.maps.android.compose.MapType

data class MapState(

    val mapProperties: MapProperties = MapProperties(
        isMyLocationEnabled = true,
        isTrafficEnabled = true,
        isBuildingEnabled = true,
        mapType = MapType.NORMAL
    ),
)