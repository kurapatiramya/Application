package uk.ac.tees.mad.d3617913.presentation.screens.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import uk.ac.tees.mad.d3617913.R
import uk.ac.tees.mad.d3617913.presentation.common.HomeTopCard
import uk.ac.tees.mad.d3617913.presentation.common.ParkingSpotCard
import uk.ac.tees.mad.d3617913.presentation.navigation.Screen
import uk.ac.tees.mad.d3617913.presentation.navigation.ScreenRouter

@Composable
fun HomeScreen() {

    Surface(
        color = colorResource(id = R.color.card_background)
    ) {
        Column {
            HomeTopCard()

            Spacer(modifier = Modifier.height(4.dp))
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(start = 8.dp, end = 8.dp)
            ) {
                Text(
                    text = "Nearby Parking",
                    fontSize = 23.sp,
                    style = MaterialTheme.typography.headlineLarge,
                    fontWeight = FontWeight.SemiBold,
                )
                Spacer(modifier = Modifier.weight(1f))
                Text(
                    text = "View All",
                    fontSize = 18.sp,
                    style = MaterialTheme.typography.bodyMedium,
                    color = colorResource(id = R.color.top_card_background),
                )
            }

            LazyColumn(modifier = Modifier.padding(8.dp)) {
                items(parkingSpots.size) { index ->
                    ParkingSpotCard(parkingSpot = parkingSpots[index], onClick = { ScreenRouter.navigateTo(Screen.BookingScreen(parkingSpots[index])) })
                    Spacer(modifier = Modifier.height(16.dp))
                }
            }
        }
    }

//    SystemBackButtonHandler {
//        ScreenRouter.navigateTo(Screen.HomeScreen)
//        exitProcess(0)
//    }
}

@Preview(showSystemUi = true)
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}