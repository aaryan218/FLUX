package com.example.android.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val FluxDarkColorScheme = darkColorScheme(
    primary = FluxPrimary,
    onPrimary = Color.White,
    primaryContainer = FluxPrimaryDark,
    onPrimaryContainer = Color.White,
    secondary = FluxSecondary,
    onSecondary = Color.Black,
    secondaryContainer = FluxSecondaryDark,
    onSecondaryContainer = Color.Black,
    background = FluxBackground,
    onBackground = FluxTextPrimary,
    surface = FluxSurface,
    onSurface = FluxTextPrimary,
    surfaceVariant = FluxSurfaceElevated,
    onSurfaceVariant = FluxTextSecondary,
    outline = FluxSurfaceBorder,
    error = FluxError,
    onError = Color.White
)

@Composable
fun FluxTheme(
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = FluxDarkColorScheme,
        typography = Typography,
        content = content
    )
}

@Composable
fun AndroidTheme(
    content: @Composable () -> Unit
) {
    FluxTheme(content = content)
}
