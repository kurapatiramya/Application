package uk.ac.tees.mad.d3617913.presentation.common;

import android.graphics.drawable.shapes.Shape;
import android.util.Log;
import androidx.compose.foundation.layout.*;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material.*;
import androidx.compose.material.icons.Icons;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ExperimentalMaterial3Api;
import androidx.compose.material3.OutlinedTextFieldDefaults;
import androidx.compose.material3.TextFieldDefaults;
import androidx.compose.material3.TopAppBarDefaults;
import androidx.compose.runtime.Composable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.PasswordVisualTransformation;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import uk.ac.tees.mad.d3617913.R;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000<\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a,\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0007\u001a(\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007\u001a8\u0010\f\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00032\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u000e2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\u000eH\u0007\u001a&\u0010\u0010\u001a\u00020\u00012\b\b\u0002\u0010\u0011\u001a\u00020\u000b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u000eH\u0007\u001a$\u0010\u0012\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00032\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u000eH\u0007\u001a\b\u0010\u0013\u001a\u00020\u0001H\u0007\u001a\u0010\u0010\u0014\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0003H\u0007\u001a6\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00182\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u000e2\b\b\u0002\u0010\u001a\u001a\u00020\u000bH\u0007\u001a\u0012\u0010\u001b\u001a\u00020\u00012\b\u0010\b\u001a\u0004\u0018\u00010\u0003H\u0007\u001a-\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0007\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b\"\u0010#\u001a\u0010\u0010$\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0003H\u0007\u001a6\u0010%\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00182\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u000e2\b\b\u0002\u0010\u001a\u001a\u00020\u000bH\u0007\u001a\u0010\u0010&\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0003H\u0007\u0082\u0002\u000b\n\u0005\b\u00a1\u001e0\u0001\n\u0002\b\u0019\u00a8\u0006\'"}, d2 = {"AppToolbar", "", "toolbarTitle", "", "logoutButtonClicked", "Lkotlin/Function0;", "navigationIconClicked", "ButtonComponent", "value", "onButtonClicked", "isEnabled", "", "CheckboxComponent", "onTextSelected", "Lkotlin/Function1;", "onCheckedChange", "ClickableLoginTextComponent", "tryingToLogin", "ClickableTextComponent", "DividerTextComponent", "HeadingTextComponent", "MyTextFieldComponent", "labelValue", "painterResource", "Landroidx/compose/ui/graphics/painter/Painter;", "onTextChanged", "errorStatus", "NavigationDrawerHeader", "NavigationDrawerText", "title", "textUnit", "Landroidx/compose/ui/unit/TextUnit;", "color", "Landroidx/compose/ui/graphics/Color;", "NavigationDrawerText-PDAApAk", "(Ljava/lang/String;JJ)V", "NormalTextComponent", "PasswordTextFieldComponent", "UnderLinedTextComponent", "app_debug"})
public final class AuthComponentsKt {
    
    @androidx.compose.runtime.Composable
    public static final void NormalTextComponent(@org.jetbrains.annotations.NotNull
    java.lang.String value) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void HeadingTextComponent(@org.jetbrains.annotations.NotNull
    java.lang.String value) {
    }
    
    @kotlin.OptIn(markerClass = {androidx.compose.material3.ExperimentalMaterial3Api.class})
    @androidx.compose.runtime.Composable
    public static final void MyTextFieldComponent(@org.jetbrains.annotations.NotNull
    java.lang.String labelValue, @org.jetbrains.annotations.NotNull
    androidx.compose.ui.graphics.painter.Painter painterResource, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onTextChanged, boolean errorStatus) {
    }
    
    @kotlin.OptIn(markerClass = {androidx.compose.material3.ExperimentalMaterial3Api.class})
    @androidx.compose.runtime.Composable
    public static final void PasswordTextFieldComponent(@org.jetbrains.annotations.NotNull
    java.lang.String labelValue, @org.jetbrains.annotations.NotNull
    androidx.compose.ui.graphics.painter.Painter painterResource, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onTextSelected, boolean errorStatus) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void CheckboxComponent(@org.jetbrains.annotations.NotNull
    java.lang.String value, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onTextSelected, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> onCheckedChange) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void ClickableTextComponent(@org.jetbrains.annotations.NotNull
    java.lang.String value, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onTextSelected) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void ButtonComponent(@org.jetbrains.annotations.NotNull
    java.lang.String value, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onButtonClicked, boolean isEnabled) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void DividerTextComponent() {
    }
    
    @androidx.compose.runtime.Composable
    public static final void ClickableLoginTextComponent(boolean tryingToLogin, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onTextSelected) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void UnderLinedTextComponent(@org.jetbrains.annotations.NotNull
    java.lang.String value) {
    }
    
    @kotlin.OptIn(markerClass = {androidx.compose.material3.ExperimentalMaterial3Api.class})
    @androidx.compose.runtime.Composable
    public static final void AppToolbar(@org.jetbrains.annotations.NotNull
    java.lang.String toolbarTitle, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> logoutButtonClicked, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> navigationIconClicked) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void NavigationDrawerHeader(@org.jetbrains.annotations.Nullable
    java.lang.String value) {
    }
}