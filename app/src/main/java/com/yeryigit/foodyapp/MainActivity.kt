@file:OptIn(ExperimentalFoundationApi::class)

package com.yeryigit.foodyapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.navigation.compose.rememberNavController
import com.yeryigit.foodyapp.core.navigation.Screen
import com.yeryigit.foodyapp.core.navigation.SetupNavGraph
import com.yeryigit.foodyapp.onboarding.presentation.onboarding.OnboardingScreen
import com.yeryigit.foodyapp.ui.theme.FoodyAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //enableEdgeToEdge() // Bottom ve status bar rengini değiştir, çünkü bunu yorum satırına aldık, almasak o kısımları da kullanabilir oluyodum
        installSplashScreen()
        setContent {
            FoodyAppTheme {
                val navController = rememberNavController()
                Column (modifier = Modifier.fillMaxSize()) {
                    SetupNavGraph(
                        startDestination = Screen.Onboarding,
                        navController = navController
                    )
                }
            }
        }
    }
}