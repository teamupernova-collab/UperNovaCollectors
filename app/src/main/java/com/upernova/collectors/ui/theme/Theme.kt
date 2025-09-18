package com.upernova.collectors.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.Color
import com.google.accompanist.systemuicontroller.rememberSystemUiController


private val LightColorScheme = lightColorScheme(
    primary = PrimaryRed,
    onPrimary = Color.White,

    background = CardGray,

    secondary = CardGray,
    onSecondary = Color.White
)

@Composable
fun UperNovaCollectorsTheme(
    content: @Composable () -> Unit,
) {
    val systemUiController = rememberSystemUiController()

    SideEffect {
        systemUiController.setStatusBarColor(
            color = LightColorScheme.background,
            darkIcons = true
        )
    }

    MaterialTheme(
        colorScheme = LightColorScheme,
        typography = Typography,
        content = content
    )
}