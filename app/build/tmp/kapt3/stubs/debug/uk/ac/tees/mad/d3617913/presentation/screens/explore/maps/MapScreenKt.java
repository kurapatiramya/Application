package uk.ac.tees.mad.d3617913.presentation.screens.explore.maps;

import android.annotation.SuppressLint;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.material.icons.Icons;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.runtime.Composable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.tooling.preview.Preview;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.maps.android.compose.MapType;
import com.google.maps.android.compose.MapUiSettings;
import uk.ac.tees.mad.d3617913.R;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0007\u001a\b\u0010\u0004\u001a\u00020\u0001H\u0007\u001a\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u001a\"\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\u0006\u0010\f\u001a\u00020\r\u00a8\u0006\u000e"}, d2 = {"MapScreen", "", "mapsViewModel", "Luk/ac/tees/mad/d3617913/presentation/screens/explore/maps/MapsViewModel;", "MapScreenPreview", "addAllPositions", "", "Luk/ac/tees/mad/d3617913/presentation/screens/explore/maps/AllPositions;", "createMarkers", "Lcom/google/android/gms/maps/model/Marker;", "locations", "Luk/ac/tees/mad/d3617913/presentation/screens/explore/maps/PredefinedParkingLocations;", "map", "Lcom/google/android/gms/maps/GoogleMap;", "app_debug"})
public final class MapScreenKt {
    
    @android.annotation.SuppressLint(value = {"UnusedMaterial3ScaffoldPaddingParameter"})
    @androidx.compose.runtime.Composable
    public static final void MapScreen(@org.jetbrains.annotations.NotNull
    uk.ac.tees.mad.d3617913.presentation.screens.explore.maps.MapsViewModel mapsViewModel) {
    }
    
    @org.jetbrains.annotations.NotNull
    public static final java.util.List<com.google.android.gms.maps.model.Marker> createMarkers(@org.jetbrains.annotations.NotNull
    java.util.List<uk.ac.tees.mad.d3617913.presentation.screens.explore.maps.PredefinedParkingLocations> locations, @org.jetbrains.annotations.NotNull
    com.google.android.gms.maps.GoogleMap map) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final java.util.List<uk.ac.tees.mad.d3617913.presentation.screens.explore.maps.AllPositions> addAllPositions() {
        return null;
    }
    
    @androidx.compose.ui.tooling.preview.Preview(showSystemUi = true)
    @androidx.compose.runtime.Composable
    public static final void MapScreenPreview() {
    }
}