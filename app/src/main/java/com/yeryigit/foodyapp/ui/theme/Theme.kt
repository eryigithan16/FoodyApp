package com.yeryigit.foodyapp.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import com.google.accompanist.systemuicontroller.rememberSystemUiController

@Composable
fun FoodyAppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val systemUiController = rememberSystemUiController()
    val useDarkIcons = !darkTheme

    SideEffect {
        systemUiController.setStatusBarColor(
            color = white,
            darkIcons = useDarkIcons
        )
        systemUiController.setNavigationBarColor(
            color = white,
            darkIcons = useDarkIcons
        )
    }

    MaterialTheme(
        typography = Typography,
        content = content
    )
}