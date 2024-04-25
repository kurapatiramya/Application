package uk.ac.tees.mad.d3617913.presentation.common

import android.app.Activity
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CarRental
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.filled.Timelapse
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import uk.ac.tees.mad.d3617913.R
import uk.ac.tees.mad.d3617913.location.LocationUtils
import uk.ac.tees.mad.d3617913.presentation.screens.home.CustomSearchBar
import uk.ac.tees.mad.d3617913.presentation.screens.home.ParkingSpot

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeTopCard() {

    val context = LocalContext.current

    var location by remember { mutableStateOf<String?>(null) }

    LaunchedEffect(key1 = Unit) {
        location = LocationUtils().getCurrentLocation(context as Activity)
    }

    Card(
        colors = CardDefaults.cardColors(colorResource(id = R.color.top_card_background)),
        modifier = Modifier
//            .fillMaxWidth()
            .height(200.dp)
            .clip(RoundedCornerShape(bottomEnd = 24.dp, bottomStart = 24.dp))
            .background(colorResource(id = R.color.top_card_background))
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 16.dp, end = 16.dp, top = 30.dp, bottom = 16.dp)
        ) {
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column {
                    NormalTextComponent(
                        value = "Location",
                        textColor = Color.White,
                        textAlign = TextAlign.Start,
                        fontSize = 20.sp
                    )
                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            imageVector = Icons.Filled.LocationOn,
                            contentDescription = null,
                            tint = Color.White,
                            modifier = Modifier.size(33.dp)
                        )

                        HeadingTextComponent(
                            value = location ?: "Loading...",
                            textColor = Color.White,
                            textAlign = TextAlign.Start,
                            fontSize = 20.sp
                        )
                    }

                }
                Spacer(modifier = Modifier.weight(1f))
                Box(
                    modifier = Modifier
                        .clip(RoundedCornerShape(10.dp))
                        .background(colorResource(id = R.color.top_card_background_light))
                ) {


                    Icon(
                        imageVector = Icons.Default.Notifications,
                        contentDescription = null,
                        tint = Color.White,
                        modifier = Modifier.size(40.dp)
                    )
                }
            }

            Spacer(modifier = Modifier.height(19.dp))


            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                CustomSearchBar()

                Spacer(modifier = Modifier.weight(1f))

                Box(
                    modifier = Modifier
                        .clip(RoundedCornerShape(24.dp))
                        .height(50.dp)
                        .width(50.dp)
                        .background(colorResource(id = R.color.white)),
                    contentAlignment = Alignment.Center
                ) {
                    val gifPainter = painterResource(id = R.drawable.level_png)

                    Image(
                        painter = gifPainter,
                        contentDescription = null,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier.size(30.dp)
                    )

//                    Icon(
//                        imageVector = Icons.Default.Notifications,
//                        contentDescription = null,
//                        tint = colorResource(id = R.color.white),
//                        modifier = Modifier.size(40.dp)
//                    )
                }
            }
        }
    }
}

@Composable
fun ParkingSpotCard(parkingSpot: ParkingSpot, onClick: () -> Unit) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clickable(onClick = onClick),
        colors = CardDefaults.cardColors(colorResource(id = R.color.white)),
        elevation = CardDefaults.elevatedCardElevation(12.dp)
    ) {
        Column(
            modifier = Modifier
                .padding(8.dp)
        ) {
            Box(modifier = Modifier.height(200.dp)) {
                ImagePager(images = parkingSpot.images, parkingSpot)
            }

            Spacer(modifier = Modifier.height(2.dp))
            Row(verticalAlignment = Alignment.CenterVertically) {

                Text(
                    text = parkingSpot.name,
                    fontSize = 20.sp,
                    style = MaterialTheme.typography.headlineLarge,
                    fontWeight = FontWeight.Normal,
                )
                Spacer(modifier = Modifier.weight(1f))
                Text(
                    text = "$" + parkingSpot.pricePerHour.toString() + " /hr",
                    style = MaterialTheme.typography.headlineLarge,
                    fontWeight = FontWeight.Bold,
                    fontSize = 22.sp
                )
            }
            Spacer(modifier = Modifier.height(2.dp))

            HorizontalDivider(thickness = 2.dp, color = Color.LightGray)
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
                Spacer(modifier = Modifier.weight(1f))
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


@OptIn(ExperimentalFoundationApi::class)
@Composable
fun ImagePager(images: List<Int>, parkingSpot: ParkingSpot) {

    val pagerState = rememberPagerState(pageCount = { images.size })

    Box(modifier = Modifier.fillMaxWidth()) {
        HorizontalPager(state = pagerState) { page ->
            Image(
                painter = painterResource(id = images[page]),
                contentDescription = "Room Image $page",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxSize()
                    .clip(RoundedCornerShape(24.dp))
            )
        }

        val indicatorDots = Modifier.align(Alignment.BottomCenter)

        Row(
            modifier =
            indicatorDots
                .padding(bottom = 13.dp)
        ) {
            for (i in images.indices) {
                val isSelected = pagerState.currentPage == i
                val color =
                    if (isSelected) MaterialTheme.colorScheme.inverseSurface else Color.LightGray
                Spacer(modifier = Modifier.width(4.dp))
                Box(
                    modifier = Modifier
                        .size(10.dp)
                        .background(color, shape = CircleShape)
                )
            }
        }
        Box(
            modifier = Modifier
                .padding(top = 12.dp, start = 15.dp)
                .background(colorResource(id = R.color.white), shape = RoundedCornerShape(10.dp))
        ) {
            Row(
                modifier = Modifier
                    .padding(start = 4.dp, end = 6.dp, top = 0.dp, bottom = 0.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    Icons.Default.Star,
                    contentDescription = null,
                    tint = colorResource(id = R.color.start_color),
                    modifier = Modifier.size(20.dp)
                )

                Text(
                    text = parkingSpot.rating.toString(),
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(start = 4.dp)
                )
            }
        }
    }
}

@Preview
@Composable
fun HomeTopCardPreview() {
    HomeTopCard()
}

//@Preview
//@Composable
//fun ParkingSpotCardPreview() {
//    ParkingSpotCard(
//        parkingSpot = ParkingSpot(
//            name = "Parking Spot 1",
//            location = "Location 1",
//            description = "This is a parking garage located in the heart of Manhattan. It is a multi-level parking garage with a total of 100 parking spots. The garage is open 24/7 and is monitored by security cameras. The garage is well-lit and has a clean and safe environment. The garage is conveniently located near many popular attractions and is within walking distance of many restaurants, shops, and theaters.",
//            rating = 4.5,
//            pricePerHour = 5.0,
//            numSpotsAvailable = 10,
//            distance = 5,
//            images = listOf(R.drawable.icon2, R.drawable.icon2)
//        )
//    )
//}

//@Preview()
//@Composable
//fun SearchTopCardPreview() {
//    SearchText()
//}