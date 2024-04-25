package uk.ac.tees.mad.d3617913.presentation.screens.booking

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CarRental
import androidx.compose.material.icons.filled.Navigation
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.filled.Timelapse
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import uk.ac.tees.mad.d3617913.R
import uk.ac.tees.mad.d3617913.presentation.common.ImagePager
import uk.ac.tees.mad.d3617913.presentation.screens.home.ParkingSpot

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun BookingScreen(parkingSpot: ParkingSpot) {
    Scaffold(
        bottomBar = {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(colorResource(id = R.color.white))
                    .border(
                        width = 1.dp,
                        color = colorResource(id = R.color.colorGrey),
                        shape = RoundedCornerShape(10.dp)
                    )
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Column {
                        Text(
                            text = "Total Price",
                            fontSize = 20.sp,
                            style = MaterialTheme.typography.bodyMedium,
                            fontWeight = FontWeight.Thin
                        )
                        Text(
                            text = "$ ${parkingSpot.pricePerHour} /hr",
                            fontSize = 20.sp,
                            style = MaterialTheme.typography.bodyMedium,
                            fontWeight = FontWeight.Bold
                        )
                    }

                    Spacer(modifier = Modifier.weight(1f))

                    Button(
                        onClick = { /*TODO*/ }, colors = ButtonDefaults.buttonColors(
                            colorResource(id = R.color.top_card_background)
                        ), modifier = Modifier.size(150.dp, 50.dp)
                    ) {
                        Text(text = "Book Now", fontSize = 20.sp)
                    }
                }
            }
        }
    ) {

        Column(
            modifier = Modifier
                .padding(16.dp)
                .verticalScroll(rememberScrollState())
        ) {

            Box(modifier = Modifier.height(200.dp)) {
                BookingImagePager(images = parkingSpot.images, parkingSpot)
            }

            Spacer(modifier = Modifier.height(16.dp))


            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.End
            ) {
                Box(
                    modifier = Modifier
                        .background(
                            colorResource(id = R.color.colorGrey),
                            shape = RoundedCornerShape(10.dp)
                        )
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.padding(4.dp)
                    ) {

                        Icon(
                            Icons.Default.Star,
                            contentDescription = null,
                            tint = colorResource(id = R.color.start_color),
                            modifier = Modifier
                                .size(25.dp)

                        )

                        Text(
                            text = parkingSpot.rating.toString(),
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.padding(start = 4.dp)
                        )
                    }
                }
            }
            Spacer(modifier = Modifier.height(16.dp))


            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column {
                    Text(
                        text = parkingSpot.name, fontSize = 25.sp,
                        style = MaterialTheme.typography.headlineLarge,
                        fontWeight = FontWeight.Bold
                    )

                    Text(
                        text = parkingSpot.location,
                        fontSize = 20.sp,
                        style = MaterialTheme.typography.displayMedium,
                        fontWeight = FontWeight.Thin
                    )
                }
                Box(
                    modifier = Modifier
                        .background(
                            colorResource(id = R.color.top_card_background),
                            shape = CircleShape
                        )
                        .padding(8.dp)
                )
                {
                    Icon(
                        imageVector = Icons.Default.Navigation,
                        contentDescription = null,
                        tint = colorResource(id = R.color.white),
                        modifier = Modifier
                            .size(35.dp)
                            .rotate(30f)
                    )
                }

            }

            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    imageVector = Icons.Default.CarRental,
                    contentDescription = null,
                    tint = colorResource(id = R.color.top_card_background),
                    modifier = Modifier.size(29.dp)
                )
                Text(
//                text = " ${parkingSpot.numSpotsAvailable} Spots Available",
                    text = buildAnnotatedString {
                        withStyle(style = SpanStyle(fontWeight = FontWeight.Bold)) {
                            append("${parkingSpot.numSpotsAvailable} ")
                        }
                        append("Spots Available")
                    },
                    fontSize = 18.sp,
                    style = MaterialTheme.typography.bodyLarge,
                    fontWeight = FontWeight.Normal
                )
                Spacer(modifier = Modifier.weight(1f))
                Icon(
                    imageVector = Icons.Default.Timelapse,
                    contentDescription = null,
                    tint = colorResource(id = R.color.top_card_background),
                    modifier = Modifier.size(29.dp)
                )
                Text(
                    text = buildAnnotatedString {
                        withStyle(style = SpanStyle(fontWeight = FontWeight.Bold)) {
                            append(" ${parkingSpot.distance} ")
                        }
                        append("mins away")
                    },
                    fontSize = 18.sp,
                    style = MaterialTheme.typography.bodyLarge,
                    fontWeight = FontWeight.Normal
                )
            }
            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = "Description",
                fontSize = 19.sp,
                style = MaterialTheme.typography.titleLarge,
                fontWeight = FontWeight.W600
            )
            Spacer(modifier = Modifier.height(16.dp))

            ExpandableText(
                text = parkingSpot.description,
                fontSize = 20.sp,
                maxLines = 6,
                style = MaterialTheme.typography.bodyMedium,
                fontWeight = FontWeight.Light
            )
        }
    }
}

@Composable
fun ExpandableText(
    text: String,
    maxLines: Int,
    style: TextStyle,
    fontSize: TextUnit,
    fontWeight: FontWeight
) {
    var expanded by remember { mutableStateOf(false) }

    Column {
        Text(
            text = text,
            maxLines = if (expanded) Int.MAX_VALUE else maxLines,
            style = style,
            fontSize = fontSize,
            fontWeight = fontWeight,
            overflow = TextOverflow.Ellipsis
        )

        if (!expanded) {
            TextButton(onClick = { expanded = true }) {
                Text("Read More", color = colorResource(id = R.color.top_card_background))

            }
        } else {
            TextButton(onClick = { expanded = false }) {
                Text("Read Less", color = colorResource(id = R.color.top_card_background))
            }
        }
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun BookingScreenPreview() {
    BookingScreen(
        parkingSpot = ParkingSpot(
            name = "Parking Spot 1",
            location = "Location 1",
            description = "This is a parking garage located in the heart of Manhattan. It is a multi-level parking garage with a total of 100 parking spots. The garage is open 24/7 and is monitored by security cameras. The garage is well-lit and has a clean and safe environment. The garage is conveniently located near many popular attractions and is within walking distance of many restaurants, shops, and theaters.",
            rating = 4.5,
            pricePerHour = 5.0,
            numSpotsAvailable = 10,
            distance = 5,
            images = listOf(R.drawable.icon2, R.drawable.icon2)
        )
    )
}