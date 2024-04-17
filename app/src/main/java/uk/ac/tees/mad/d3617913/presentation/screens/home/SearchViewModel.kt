package uk.ac.tees.mad.d3617913.presentation.screens.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.stateIn

class SearchViewModel : ViewModel() {

    //first state whether the search is happening or not
    private val _isSearching = MutableStateFlow(false)
    val isSearching = _isSearching.asStateFlow()

    //second state to store the search results
    private val _searchText = MutableStateFlow("")
    val searchText = _searchText.asStateFlow()

    //third state the list to be filtered
    private val _citiesList = MutableStateFlow(cities)
    val citiesList = searchText
        .combine(_citiesList) { text, cities ->//combine searchText with _cityList
            if (text.isBlank()) { //return the entery list of countries if not is typed
                cities
            }
            cities.filter { cities ->// filter and return a list of countries based on the text the user typed
                cities.uppercase().contains(text.trim().uppercase())
            }
        }.stateIn(//basically convert the Flow returned from combine operator to StateFlow
            scope = viewModelScope,
            started = SharingStarted.WhileSubscribed(5000),//it will allow the StateFlow survive 5 seconds before it been canceled
            initialValue = _citiesList.value
        )

    fun onSearchTextChange(text: String) {
        _searchText.value = text
    }

    fun onToggleSearch() {
        _isSearching.value = !_isSearching.value
        if (!_isSearching.value) {
            onSearchTextChange("")
        }
    }
}

private val cities = listOf(
    "New York",
    "Los Angeles",
    "Chicago",
    "Houston",
    "Phoenix",
    "Philadelphia",
    "San Antonio",
    "San Diego",
    "Dallas",
    "San Jose",
    "Austin",
    "Jacksonville",
    "Fort Worth",
    "Columbus",
    "Charlotte",
    "Indianapolis",
    "San Francisco",
    "Seattle",
    "Denver",
    "Washington",
    "Boston",
    "El Paso",
    "Nashville",
    "Detroit",
    "Oklahoma City",
    "Portland",
    "Las Vegas",
    "Memphis",
    "Louisville",
    "Baltimore",
    "Milwaukee",
    "Albuquerque",
    "Tucson",
    "Fresno",
    "Mesa",
    "Sacramento",
    "Atlanta",
    "Kansas City",
    "Colorado Springs",
    "Miami",
    "Raleigh",
    "Omaha",
    "Long Beach",
    "Virginia Beach",
    "Oakland",
    "Minneapolis",
    "Tulsa",
    "Arlington",
    "Tampa",
    "New Orleans",
    "Wichita",
    "Cleveland",
    "Bakersfield",
    "Aurora",
    "Anaheim",
    "Honolulu",
    "Santa Ana",
    "Riverside",
    "Corpus Christi",
    "Lexington",
    "Stockton",
    "Henderson",
    "Saint Paul",
    "St. Louis",
    "Cincinnati",
    "Pittsburgh",
    "Greensboro",
    "Anchorage",
    "Plano",
    "Lincoln",
    "Orlando",
    "Irvine",
    "Newark",
    "Toledo",
    "Durham",
    "Chula Vista",
    "Fort Wayne",
    "Jersey City",
    "St. Petersburg",
    "Laredo",
    "Madison",
    "Chandler",
    "Buffalo",
    "Lubbock",
    "Scottsdale",
    "Reno",
    "Glendale",
    "Gilbert",
    "Winston–Salem",
    "North Las Vegas",
    "Norfolk",
    "Chesapeake",
    "Garland",
    "Irving",
    "Hialeah",
    "Fremont",
    "Boise",
    "Richmond",
    "York, UK",
    "Derby, UK",
    "Hull, UK",
    "Preston, UK",
    "Peterborough, UK",
    "Bournemouth, UK",
    "Portsmouth, UK",
    "Reading, UK",
    "Blackpool, UK",
    "Middlesbrough, UK",
    "Bolton, UK",
    "Stockport, UK",
    "Doncaster, UK",
    "Leicester, UK",
    "Luton, UK",
    "Wakefield, UK",
    "Chester, UK",
    "Carlisle, UK",
    "St Albans, UK",
    "Swindon, UK",
    "Gloucester, UK",
    "Watford, UK",
    "Crawley, UK",
    "Basildon, UK",
    "Southend-on-Sea, UK",
    "Chelmsford, UK",
    "Dundee, UK",
    "Perth, UK",
    "Stirling, UK",
    "Inverness, UK",
    "Swansea, UK",
    "Newport, UK",
    "Wrexham, UK",
    "Aberystwyth, UK",
    "Bangor, UK",
    "Derry, UK (Londonderry)",
    "Lisburn, UK",
)