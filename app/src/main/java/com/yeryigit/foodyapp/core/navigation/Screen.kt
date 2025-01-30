package com.yeryigit.foodyapp.core.navigation

import kotlinx.serialization.Serializable

@Serializable
sealed class Screen {
    @Serializable
    data object Onboarding : Screen()
    @Serializable
    data object Register : Screen()
    @Serializable
    data object Login : Screen()
}