package com.yeryigit.foodyapp.core.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.yeryigit.foodyapp.home.presentation.HomeScreen
import com.yeryigit.foodyapp.onboarding.presentation.forgotpassword.ForgetPasswordScreen
import com.yeryigit.foodyapp.onboarding.presentation.login.LoginScreen
import com.yeryigit.foodyapp.onboarding.presentation.onboarding.OnboardingScreen
import com.yeryigit.foodyapp.onboarding.presentation.register.RegisterScreen

@Composable
fun SetupNavGraph(
    startDestination: Screen,
    navController: NavHostController
) {
    NavHost(startDestination = startDestination, navController = navController) {
        onboardingRoute(
            onClickCreateAccount = {
                navController.navigate(Screen.Register)
            },
            onClickLogin = {
                navController.navigate(Screen.Login)
            }
        )
        registerRoute(
            onClickSignInWithGoogle = { },
            onClickCreateAnAccount = { navController.navigate(Screen.Register) },
            onClickLogin = { navController.navigate(Screen.Home) }
        )
        loginRoute(
            onClickSignInWithGoogle = { },
            onClickLogin = { navController.navigate(Screen.Home) },
            onClickForgotMyPassword = { navController.navigate(Screen.ForgotPassword) }
        )
        forgotPasswordRoute()
        homeRoute()
    }
}

fun NavGraphBuilder.onboardingRoute(
    onClickCreateAccount: () -> Unit,
    onClickLogin: () -> Unit
) {
    composable<Screen.Onboarding> {
        OnboardingScreen(
            onClickCreateAccount = onClickCreateAccount,
            onClickLogin = onClickLogin
        )
    }
}

fun NavGraphBuilder.registerRoute(
    onClickSignInWithGoogle: () -> Unit,
    onClickCreateAnAccount: () -> Unit,
    onClickLogin: () -> Unit
) {
    composable<Screen.Register> {
        RegisterScreen(
            onClickSignInWithGoogle = onClickSignInWithGoogle,
            onClickCreateAnAccount = onClickCreateAnAccount,
            onClickLogin = onClickLogin
        )
    }
}

fun NavGraphBuilder.loginRoute(
    onClickSignInWithGoogle: () -> Unit,
    onClickLogin: () -> Unit,
    onClickForgotMyPassword: () -> Unit
) {
    composable<Screen.Login> {
        LoginScreen(
            onClickSignInWithGoogle = onClickSignInWithGoogle,
            onClickLogin = onClickLogin,
            onClickForgotMyPassword = onClickForgotMyPassword
        )
    }
}

fun NavGraphBuilder.forgotPasswordRoute() {
    composable<Screen.ForgotPassword> {
        ForgetPasswordScreen()
    }
}

fun NavGraphBuilder.homeRoute() {
    composable<Screen.Home> {
        HomeScreen()
    }
}