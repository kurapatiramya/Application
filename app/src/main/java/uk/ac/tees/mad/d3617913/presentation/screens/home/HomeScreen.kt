package uk.ac.tees.mad.d3617913.presentation.screens.home

import android.app.Activity
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
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
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import uk.ac.tees.mad.d3617913.R
import uk.ac.tees.mad.d3617913.location.LocationUtils
import uk.ac.tees.mad.d3617913.presentation.common.HeadingTextComponent
import uk.ac.tees.mad.d3617913.presentation.common.HomeTopCard
import uk.ac.tees.mad.d3617913.presentation.common.NormalTextComponent
import uk.ac.tees.mad.d3617913.presentation.common.ParkingSpotCard
import uk.ac.tees.mad.d3617913.presentation.navigation.Screen
import uk.ac.tees.mad.d3617913.presentation.navigation.ScreenRouter

@Composable
fun HomeScreen2(
    navController: NavHostController
) {

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
//                Spacer(modifier = Modifier.weight(1f))
//                Text(
//                    text = "View All",
//                    fontSize = 18.sp,
//                    style = MaterialTheme.typography.bodyMedium,
//                    color = colorResource(id = R.color.top_card_background),
//                )
            }

            LazyColumn(modifier = Modifier.padding(8.dp)) {
                items(parkingSpots) { items ->
                    ParkingSpotCard(
                        parkingSpot = items,
                        navController = navController                    )
                    Spacer(modifier = Modifier.height(16.dp))
                }
            }

        }
    }

}


@Composable
fun HomeScreen(
    navController: NavHostController
) {

    Surface(
        color = colorResource(id = R.color.card_background)
    ) {
        Column {
            val context = LocalContext.current

            var searchQuery by remember {
                mutableStateOf("")
            }
            val focusManager = LocalFocusManager.current

            var filteredParkingSpots by remember { mutableStateOf(parkingSpots) }

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
                        OutlinedTextField(
                            value = searchQuery,
                            onValueChange = {
                                searchQuery = it
                                filteredParkingSpots = parkingSpots.filter { spot ->
                                    spot.name.lowercase().contains(searchQuery.lowercase())
                                            || spot.location.lowercase()
                                        .contains(searchQuery.lowercase())
                                            || spot.pricePerHour.toString().contains(searchQuery)
                                }
                            },
                            modifier = Modifier.fillMaxWidth(),
                            leadingIcon = {
                                Icon(
                                    imageVector = Icons.Outlined.Search,
                                    contentDescription = ""
                                )
                            },
                            placeholder = {
                                Text(text = "Search..", color = Color.White)
                            },
                            colors = OutlinedTextFieldDefaults.colors(
                                disabledContainerColor = Color.White,
                                focusedBorderColor = Color.White,
                                unfocusedBorderColor = Color.White,
                                cursorColor = Color.White,
                                focusedLeadingIconColor = Color.White,
                                unfocusedLeadingIconColor = Color.White,
                                unfocusedLabelColor = Color.White,
                                focusedLabelColor = Color.White,
                                focusedTextColor = Color.White,
                                unfocusedTextColor = Color.White,
                            ),
                            shape = RoundedCornerShape(16.dp),
                            keyboardOptions = KeyboardOptions(imeAction = ImeAction.Done),
                            keyboardActions = KeyboardActions(
                                onDone = {
                                    focusManager.clearFocus()
                                }
                            )
                        )


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
//                Spacer(modifier = Modifier.weight(1f))
//                Text(
//                    text = "View All",
//                    fontSize = 18.sp,
//                    style = MaterialTheme.typography.bodyMedium,
//                    color = colorResource(id = R.color.top_card_background),
//                )
            }

            LazyColumn(modifier = Modifier.padding(8.dp)) {
                items(filteredParkingSpots.size) { index ->
                    ParkingSpotCard(
                        parkingSpot = filteredParkingSpots[index],
                        navController = navController
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                }
            }

        }
    }

}


//@Preview(showSystemUi = true)
//@Composable
//fun HomeScreenPreview() {
//    HomeScreen2()
//}