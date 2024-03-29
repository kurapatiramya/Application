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
        title = "Welcome to NewsApp",
        description = "Your go-to source for breaking news, personalized content, and in-depth stories",
        image = R.drawable.onboarding1
    ),
    Page(
        title = "Your News, Your Way",
        description = " Select your favorite topics and sources to create a personalized news " +
                "feed that reflects your interests and preferences.",
        image = R.drawable.onboarding2
    ),
    Page(
        title = "Stay Ahead with Instant Updates",
        description = "Enable push notifications to receive breaking news alerts in real-time.",
        image = R.drawable.onboarding3
    )
)