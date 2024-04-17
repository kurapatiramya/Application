package uk.ac.tees.mad.d3617913.presentation.screens.explore.maps

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Layers
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.google.maps.android.compose.GoogleMap
import com.google.maps.android.compose.MapType
import com.google.maps.android.compose.MapUiSettings
import uk.ac.tees.mad.d3617913.R

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun MapScreen(
    mapsViewModel: MapsViewModel = viewModel()
) {
    //this will not be recreated on recomposition everytime
    val uiSettings = remember {
        mutableStateOf(
            MapUiSettings(
                zoomControlsEnabled = false
            )
        )
    }

    val mapTypes =
        listOf(
            MapType.NORMAL,
            MapType.SATELLITE,
            MapType.HYBRID,
            MapType.TERRAIN
        )
    val expanded = remember { mutableStateOf(false) }
    val selectedMapType = remember { mutableStateOf(MapType.NORMAL) }

    val searchText = remember { mutableStateOf("") }


    Scaffold {

        Box(modifier = Modifier.fillMaxSize()) {


            GoogleMap(
                modifier = Modifier,
//                    .padding(top = 22.dp)
//                    .background(Color.White),
                properties = mapsViewModel.state.mapProperties,
                uiSettings = uiSettings.value,
                onMapLongClick = {

                }
            )
            Row(
                horizontalArrangement = Arrangement.Center
            ) {
                TextField(
                    value = searchText.value,
                    onValueChange = { searchText.value = it },
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Default.Search,
                            contentDescription = null
                        )
                    },
                    maxLines = 1,
                    modifier = Modifier
//                        .align(Alignment.TopCenter)
                        .padding(top = 50.dp, start = 24.dp)
                        .clip(CircleShape)
                        .background(Color.Transparent),
                    placeholder = { Text("Search") }
                )

//            Box(
//                modifier = Modifier
//                    .size(50.dp)
//                    .fillMaxSize()
//                    .padding(bottom = 54.dp)
//                    .horizontalScroll(rememberScrollState())
//            ) {
//                LazyRow(
//                    modifier = Modifier
//                        .fillMaxWidth() // This line is added
//                        .align(Alignment.BottomCenter)
//                        .padding(bottom = 16.dp)
//                ) {
//                    items(parkingSpots.size) { index ->
//                        ParkingSpotCard(parkingSpot = parkingSpots[index])
//                        Spacer(modifier = Modifier.width(16.dp))
//                    }
//                }
//            }

                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(start = 8.dp, top = 50.dp)
                ) {
                    Column {
                        Button(
                            onClick = { expanded.value = true },
                            colors = ButtonDefaults.buttonColors(
                                colorResource(id = R.color.colorPrimary).copy(
                                    alpha = 0.4F
                                )
                            ),
//                    modifier = Modifier.align(Alignment.BottomStart)
                        ) {
                            Icon(
                                imageVector = Icons.Default.Layers,
                                contentDescription = null,
                                tint = when (selectedMapType.value) {
                                    MapType.NORMAL -> Color.Black
                                    MapType.TERRAIN -> Color.Black
                                    else -> Color.White
                                },
                                modifier = Modifier
                                    .size(30.dp)
                            )
                        }

                        DropdownMenu(
                            expanded = expanded.value,
                            onDismissRequest = { expanded.value = false },
//                modifier = Modifier.align(Alignment.CenterStart)
                        ) {
                            mapTypes.forEach { mapType ->
                                DropdownMenuItem(
                                    { Text(text = mapType.name) },
                                    onClick = {
                                        selectedMapType.value = mapType
                                        mapsViewModel.state = mapsViewModel.state.copy(
                                            mapProperties = mapsViewModel.state.mapProperties.copy(
                                                mapType = mapType
                                            )
                                        )
                                        expanded.value = false
                                    })
                            }
                        }
                    }
                }
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun MapScreenPreview() {
    MapScreen()
}