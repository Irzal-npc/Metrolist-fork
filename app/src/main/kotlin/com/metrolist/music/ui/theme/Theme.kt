/**
 * Pure Black Monochrome Theme
 */
package com.metrolist.music.ui.theme

import androidx.compose.material3.ColorScheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

val PureBlackColorScheme = darkColorScheme(
    primary = Color.Black,
    onPrimary = Color.White,
    primaryContainer = Color.Black,
    onPrimaryContainer = Color.White,
    secondary = Color.Black,
    onSecondary = Color.White,
    secondaryContainer = Color.Black,
    onSecondaryContainer = Color.White,
    tertiary = Color.Black,
    onTertiary = Color.White,
    tertiaryContainer = Color.Black,
    onTertiaryContainer = Color.White,
    background = Color.Black,
    onBackground = Color.White,
    surface = Color.Black,
    onSurface = Color.White,
    surfaceVariant = Color.Black,
    onSurfaceVariant = Color.White,
    outline = Color.DarkGray,
    outlineVariant = Color.DarkGray,
    scrim = Color.Black,
    inverseSurface = Color.White,
    inverseOnSurface = Color.Black,
    inversePrimary = Color.Black,
    surfaceTint = Color.Black,
    error = Color.Red,
    onError = Color.White,
    errorContainer = Color.Black,
    onErrorContainer = Color.White,
)

@Composable
fun MetrolistTheme(
    content: @Composable () -> Unit,
) {
    MaterialTheme(
        colorScheme = PureBlackColorScheme,
        typography = androidx.compose.material3.Typography(),
        content = content,
    )
}
