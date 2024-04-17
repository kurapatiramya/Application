package uk.ac.tees.mad.d3617913.presentation.navigation;

import android.util.Log;
import androidx.compose.runtime.MutableState;
import uk.ac.tees.mad.d3617913.presentation.screens.home.ParkingSpot;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n\u00a8\u0006\u000b"}, d2 = {"Luk/ac/tees/mad/d3617913/presentation/navigation/Screen;", "", "()V", "BookingScreen", "LoginScreen", "Navigator", "SignUpScreen", "Luk/ac/tees/mad/d3617913/presentation/navigation/Screen$BookingScreen;", "Luk/ac/tees/mad/d3617913/presentation/navigation/Screen$LoginScreen;", "Luk/ac/tees/mad/d3617913/presentation/navigation/Screen$Navigator;", "Luk/ac/tees/mad/d3617913/presentation/navigation/Screen$SignUpScreen;", "app_debug"})
public abstract class Screen {
    
    private Screen() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Luk/ac/tees/mad/d3617913/presentation/navigation/Screen$BookingScreen;", "Luk/ac/tees/mad/d3617913/presentation/navigation/Screen;", "parkingSpot", "Luk/ac/tees/mad/d3617913/presentation/screens/home/ParkingSpot;", "(Luk/ac/tees/mad/d3617913/presentation/screens/home/ParkingSpot;)V", "getParkingSpot", "()Luk/ac/tees/mad/d3617913/presentation/screens/home/ParkingSpot;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class BookingScreen extends uk.ac.tees.mad.d3617913.presentation.navigation.Screen {
        @org.jetbrains.annotations.NotNull
        private final uk.ac.tees.mad.d3617913.presentation.screens.home.ParkingSpot parkingSpot = null;
        
        public BookingScreen(@org.jetbrains.annotations.NotNull
        uk.ac.tees.mad.d3617913.presentation.screens.home.ParkingSpot parkingSpot) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final uk.ac.tees.mad.d3617913.presentation.screens.home.ParkingSpot getParkingSpot() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final uk.ac.tees.mad.d3617913.presentation.screens.home.ParkingSpot component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final uk.ac.tees.mad.d3617913.presentation.navigation.Screen.BookingScreen copy(@org.jetbrains.annotations.NotNull
        uk.ac.tees.mad.d3617913.presentation.screens.home.ParkingSpot parkingSpot) {
            return null;
        }
        
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override
        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u00c6\n\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u00d6\u0003J\t\u0010\u0007\u001a\u00020\bH\u00d6\u0001J\t\u0010\t\u001a\u00020\nH\u00d6\u0001\u00a8\u0006\u000b"}, d2 = {"Luk/ac/tees/mad/d3617913/presentation/navigation/Screen$LoginScreen;", "Luk/ac/tees/mad/d3617913/presentation/navigation/Screen;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class LoginScreen extends uk.ac.tees.mad.d3617913.presentation.navigation.Screen {
        @org.jetbrains.annotations.NotNull
        public static final uk.ac.tees.mad.d3617913.presentation.navigation.Screen.LoginScreen INSTANCE = null;
        
        private LoginScreen() {
        }
        
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override
        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u00c6\n\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u00d6\u0003J\t\u0010\u0007\u001a\u00020\bH\u00d6\u0001J\t\u0010\t\u001a\u00020\nH\u00d6\u0001\u00a8\u0006\u000b"}, d2 = {"Luk/ac/tees/mad/d3617913/presentation/navigation/Screen$Navigator;", "Luk/ac/tees/mad/d3617913/presentation/navigation/Screen;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class Navigator extends uk.ac.tees.mad.d3617913.presentation.navigation.Screen {
        @org.jetbrains.annotations.NotNull
        public static final uk.ac.tees.mad.d3617913.presentation.navigation.Screen.Navigator INSTANCE = null;
        
        private Navigator() {
        }
        
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override
        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u00c6\n\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u00d6\u0003J\t\u0010\u0007\u001a\u00020\bH\u00d6\u0001J\t\u0010\t\u001a\u00020\nH\u00d6\u0001\u00a8\u0006\u000b"}, d2 = {"Luk/ac/tees/mad/d3617913/presentation/navigation/Screen$SignUpScreen;", "Luk/ac/tees/mad/d3617913/presentation/navigation/Screen;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class SignUpScreen extends uk.ac.tees.mad.d3617913.presentation.navigation.Screen {
        @org.jetbrains.annotations.NotNull
        public static final uk.ac.tees.mad.d3617913.presentation.navigation.Screen.SignUpScreen INSTANCE = null;
        
        private SignUpScreen() {
        }
        
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override
        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
            return null;
        }
    }
}