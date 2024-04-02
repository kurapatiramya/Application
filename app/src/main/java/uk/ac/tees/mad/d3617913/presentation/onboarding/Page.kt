package uk.ac.tees.mad.d3617913.presentation.onboarding

import androidx.annotation.DrawableRes
import uk.ac.tees.mad.d3617913.R

data class Page (
    val title: String,
    val description: String,
    @DrawableRes val image: Int
)

val pages = listOf(
    Page(
        title = "Welcome to ParkEase App",
        description = "Description of First Page",
        image = R.drawable.onboarding1
    ),
    Page(
        title = "Your App, Your Way",
        description = "Description of Second Page",
        image = R.drawable.onboarding2
    ),
    Page(
        title = "Stay Ahead with Instant Updates",
        description = "Description of Third Page",
        image = R.drawable.onboarding3
    )
)