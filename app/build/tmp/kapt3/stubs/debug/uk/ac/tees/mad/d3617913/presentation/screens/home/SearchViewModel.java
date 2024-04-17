package uk.ac.tees.mad.d3617913.presentation.screens.home;

import androidx.lifecycle.ViewModel;
import kotlinx.coroutines.flow.SharingStarted;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0006J\u0006\u0010\u0014\u001a\u00020\u0012R\u001a\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r\u00a8\u0006\u0015"}, d2 = {"Luk/ac/tees/mad/d3617913/presentation/screens/home/SearchViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_citiesList", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "", "_isSearching", "", "_searchText", "citiesList", "Lkotlinx/coroutines/flow/StateFlow;", "getCitiesList", "()Lkotlinx/coroutines/flow/StateFlow;", "isSearching", "searchText", "getSearchText", "onSearchTextChange", "", "text", "onToggleSearch", "app_debug"})
public final class SearchViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> _isSearching = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isSearching = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> _searchText = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<java.lang.String> searchText = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<java.lang.String>> _citiesList = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<java.util.List<java.lang.String>> citiesList = null;
    
    public SearchViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isSearching() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<java.lang.String> getSearchText() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<java.util.List<java.lang.String>> getCitiesList() {
        return null;
    }
    
    public final void onSearchTextChange(@org.jetbrains.annotations.NotNull
    java.lang.String text) {
    }
    
    public final void onToggleSearch() {
    }
}