package uk.ac.tees.mad.d3617913.lottie

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.LottieConstants
import com.airbnb.lottie.compose.rememberLottieComposition
import uk.ac.tees.mad.d3617913.R

@Composable
fun LoadingScreen() {
    //Using lottie animation to show loading screen
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            LoaderAnimation(
                modifier = Modifier.size(700.dp),
                anim = R.raw.loading_plane
            )
            Text(text = "Loading...", color = Color.Black, fontSize = 20.sp)
        }
    }
}

@Composable
fun LoaderAnimation(modifier: Modifier, anim: Int) {
    val composition by rememberLottieComposition(spec = LottieCompositionSpec.RawRes(anim))

    LottieAnimation(
        composition = composition,
        modifier = modifier,
        iterations = LottieConstants.IterateForever
    )
}