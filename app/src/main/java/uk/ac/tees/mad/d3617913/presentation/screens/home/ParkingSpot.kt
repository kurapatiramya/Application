package uk.ac.tees.mad.d3617913.presentation.screens.home

import uk.ac.tees.mad.d3617913.R

data class ParkingSpot(
    val name: String,
    val location: String,
    val description: String,
    val rating: Double,
    val pricePerHour: Double,
    val numSpotsAvailable: Int,
    val distance: Int,
    val images: List<Int>
)

val parkingSpots = listOf(
    ParkingSpot(
        name = "Central Parking Garage",
        location = "Midtown Manhattan",
        description = "This is a parking garage located in the heart of Manhattan. It is a multi-level parking garage with a total of 100 parking spots. The garage is open 24/7 and is monitored by security cameras. The garage is well-lit and has a clean and safe environment. The garage is conveniently located near many popular attractions and is within walking distance of many restaurants, shops, and theaters.",
        rating = 4.5,
        pricePerHour = 15.00,
        numSpotsAvailable = 10,
        distance = 5,
        images = listOf(R.drawable.parking_1, R.drawable.parking_2, R.drawable.parking_3)
    ),
    ParkingSpot(
        name = "Public Lot on 2nd",
        location = "Lower East Side",
        description = "This is a parking garage located in the heart of Manhattan. It is a multi-level parking garage with a total of 100 parking spots. The garage is open 24/7 and is monitored by security cameras. The garage is well-lit and has a clean and safe environment. The garage is conveniently located near many popular attractions and is within walking distance of many restaurants, shops, and theaters.",
        rating = 4.0,
        pricePerHour = 10.00,
        numSpotsAvailable = 5,
        distance = 12,
        images = listOf(R.drawable.parking_3, R.drawable.parking_1, R.drawable.parking_3)

    ),
    ParkingSpot(
        name = "Street Parking (Permit)",
        location = "Soho",
        description = "This is a parking garage located in the heart of Manhattan. It is a multi-level parking garage with a total of 100 parking spots. The garage is open 24/7 and is monitored by security cameras. The garage is well-lit and has a clean and safe environment. The garage is conveniently located near many popular attractions and is within walking distance of many restaurants, shops, and theaters.",
        rating = 3.0,
        pricePerHour = 5.00,
        numSpotsAvailable = 2,
        distance = 18,
        images = listOf(R.drawable.parking_2, R.drawable.parking_3, R.drawable.parking_1)
    )
)

