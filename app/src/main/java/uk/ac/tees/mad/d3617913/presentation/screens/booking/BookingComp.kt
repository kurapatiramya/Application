package uk.ac.tees.mad.d3617913.presentation.screens.booking

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import uk.ac.tees.mad.d3617913.presentation.screens.home.ParkingSpot

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun BookingImagePager(images: List<Int>, parkingSpot: ParkingSpot) {

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
//        Box(
//            modifier = Modifier
//                .padding(top = 12.dp, start = 15.dp)
//                .background(colorResource(id = R.color.white), shape = RoundedCornerShape(10.dp))
//        ) {
//            Row(
//                modifier = Modifier
//                    .padding(start = 4.dp, end = 6.dp, top = 0.dp, bottom = 0.dp),
//                verticalAlignment = Alignment.CenterVertically
//            ) {
//                Icon(
//                    Icons.Default.Star,
//                    contentDescription = null,
//                    tint = colorResource(id = R.color.start_color),
//                    modifier = Modifier.size(20.dp)
//                )
//
//                Text(
//                    text = parkingSpot.rating.toString(),
//                    fontSize = 15.sp,
//                    fontWeight = FontWeight.Bold,
//                    modifier = Modifier.padding(start = 4.dp)
//                )
//            }
//        }
    }
}