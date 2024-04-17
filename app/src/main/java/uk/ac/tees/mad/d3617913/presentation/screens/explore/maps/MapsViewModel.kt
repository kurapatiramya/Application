package uk.ac.tees.mad.d3617913.presentation.screens.explore.maps

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class MapsViewModel: ViewModel(){

    var state by mutableStateOf(MapState())


}