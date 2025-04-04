package com.yeryigit.foodyapp.core.navigation

import kotlinx.serialization.Serializable

@Serializable
sealed interface Screen {
    @Serializable
    data object Onboarding : Screen
    @Serializable
    data object Register : Screen
    @Serializable
    data object Login : Screen
    @Serializable
    data object ForgotPassword : Screen
    @Serializable
    data object Home : Screen
}