package uk.ac.tees.mad.d3617913.presentation.screens.explore

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CarRental
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Timelapse
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import uk.ac.tees.mad.d3617913.R
import uk.ac.tees.mad.d3617913.presentation.navigation.Screen
import uk.ac.tees.mad.d3617913.presentation.navigation.ScreenRouter
import uk.ac.tees.mad.d3617913.presentation.navigation.SystemBackButtonHandler
import uk.ac.tees.mad.d3617913.presentation.screens.explore.maps.MapScreen
import uk.ac.tees.mad.d3617913.presentation.screens.home.ParkingSpot
import uk.ac.tees.mad.d3617913.presentation.screens.home.parkingSpots

@Composable
fun ExploreScreen() {

    Box(modifier = Modifier.fillMaxSize()) {
        MapScreen()
        Spacer(modifier = Modifier.height(16.dp))
//        LazyRow(modifier = Modifier
//            .padding(bottom = 30.dp)
//            .align(Alignment.BottomCenter)) {
//            items(parkingSpots.size) { index ->
//                ParkingSpotCardModifiedForRow(parkingSpot = parkingSpots[index])
//                Spacer(modifier = Modifier.width(16.dp))
//            }
//        }
    }

//    SystemBackButtonHandler {
//        ScreenRouter.navigateTo(Screen.HomeScreen)
//           }

}

@Composable
fun ParkingSpotCardModifiedForRow(parkingSpot: ParkingSpot) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        colors = CardDefaults.cardColors(colorResource(id = R.color.white)),
        elevation = CardDefaults.elevatedCardElevation(8.dp)
    ) {
        Column(
            modifier = Modifier.padding(8.dp)
        ) {
            Image(
                painter = painterResource(id = parkingSpot.images[0]),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .width(300.dp)
                    .aspectRatio(1.5f)
                    .clip(RoundedCornerShape(24.dp))
            )

            Spacer(modifier = Modifier.height(2.dp))
            Row(verticalAlignment = Alignment.CenterVertically) {

                Text(
                    text = parkingSpot.name,
//                    text = "parkingSpot.name",
                    fontSize = 18.sp,
                    style = MaterialTheme.typography.headlineLarge,
                    fontWeight = FontWeight.Normal,
                )
                Spacer(modifier = Modifier.width(30.dp))
                Text(
                    text = "$" + parkingSpot.pricePerHour.toString() + " /hr",
//                    text = "$ /hr",
                    style = MaterialTheme.typography.headlineLarge,
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp
                )
            }
            Spacer(modifier = Modifier.height(2.dp))

            HorizontalDivider(thickness = 3.dp, color = Color.Black)
            Spacer(modifier = Modifier.height(8.dp))

            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(imageVector = Icons.Default.CarRental, contentDescription = null)
                Text(
                    text = " ${parkingSpot.numSpotsAvailable} Spots",
                    fontSize = 18.sp,
                    style = MaterialTheme.typography.bodyLarge,
                    fontWeight = FontWeight.Normal
                )
                Spacer(modifier = Modifier.width(100.dp))
                Icon(imageVector = Icons.Default.Timelapse, contentDescription = null)
                Text(
                    text = " ${parkingSpot.distance} Mins",
                    fontSize = 18.sp,
                    style = MaterialTheme.typography.bodyLarge,
                    fontWeight = FontWeight.Normal
                )
            }
        }
    }
}


@Composable
fun AppScreen() { // Provide a default value for parkingSpot

    Box(modifier = Modifier.fillMaxSize()) {
        // Background map
        Image(
            modifier = Modifier.fillMaxSize(),
            painter = painterResource(id = R.drawable.profile_pic_2), // Replace with your map image resource
            contentDescription = "Background Map"
        )

        // Search bar
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp, start = 16.dp, end = 16.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            TextField(value = "",
                onValueChange = {},
                modifier = Modifier.fillMaxWidth(0.8f),
                placeholder = { Text(text = "Search Parking") },
                trailingIcon = {
                    IconButton(onClick = { /* Search Icon Clicked */ }) {
                        Icon(Icons.Default.Search, contentDescription = "Search")
                    }
                })
            IconButton(onClick = { /* Search Settings Icon Clicked */ }) {
                Icon(Icons.Default.Settings, contentDescription = "Search Settings")
            }
        }

        // Parking spot card (assuming your card composable is named ParkingSpotCard)
//        ParkingSpotCard(parkingSpot = parkingSpot)
//            .align(Alignment.BottomCenter)
//            .padding(bottom = 16.dp)
    }
}

// Dummy parking spot data
fun getDummyParkingSpot(): ParkingSpot {
    return ParkingSpot(
        id = "1",
        name = "Central Parking Garage",
        location = "Midtown Manhattan",
        description = "This is a parking garage located in the heart of Manhattan. It is a multi-level parking garage with a total of 100 parking spots. The garage is open 24/7 and is monitored by security cameras. The garage is well-lit and has a clean and safe environment. The garage is conveniently located near many popular attractions and is within walking distance of many restaurants, shops, and theaters.",
        rating = 4.5,
        pricePerHour = 15.00,
        numSpotsAvailable = 10,
        distance = 5,
        images = listOf(0, 0)
    )
}

@Preview(showSystemUi = true)
@Composable
fun AppScreenPreview() {
    ExploreScreen()
}
