package uk.ac.tees.mad.d3617913.presentation.screens.home

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.SearchBar
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import uk.ac.tees.mad.d3617913.R


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomSearchBar() {

    val viewModel = SearchViewModel()

    val searchText by viewModel.searchText.collectAsState()
    val isSearching by viewModel.isSearching.collectAsState()
    val citiesList by viewModel.citiesList.collectAsState()

    // Get the keyboard controller
    val keyboardController = LocalSoftwareKeyboardController.current


    SearchBar(
        query = searchText, //text showed on SearchBar

        //update the value of searchText
        onQueryChange = viewModel::onSearchTextChange,

        //the callback to be invoked
        // when the input service triggers the ImeAction.Search action
        onSearch = viewModel::onSearchTextChange,

        //weather user is searching or not
        active = isSearching,

        //the callback to be invoked when this search bar's
        // active state is changed
        onActiveChange = { isActive ->
            viewModel.onToggleSearch()
            if (isActive) {
                keyboardController?.show()
            } else {
                keyboardController?.hide()
            }
        },

        placeholder = { Text(text = "Search") },
        leadingIcon = {
            Box(
                contentAlignment = Alignment.TopStart,
            ) {
                Icon(
                    imageVector = Icons.Filled.Search,
                    contentDescription = null,
                    tint = colorResource(id = R.color.top_card_background),
                    modifier = Modifier.size(40.dp)
                )
            }
        },
        modifier = Modifier
            .height(60.dp)
            .width(290.dp)
            .clip(RoundedCornerShape(10.dp))
    ) {
        LazyColumn {
            items(citiesList) { cities ->
                Text(
                    text = cities,

                )
            }
        }
    }
}