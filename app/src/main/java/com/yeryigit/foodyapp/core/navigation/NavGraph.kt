package com.yeryigit.foodyapp.core.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.yeryigit.foodyapp.onboarding.presentation.onboarding.OnboardingScreen
import com.yeryigit.foodyapp.onboarding.presentation.register.RegisterScreen

@Composable
fun SetupNavGraph(
    startDestination: Screen,
    modifier: Modifier,
    navController: NavHostController
) {
    NavHost(startDestination = startDestination, navController = navController) {
        splashRoute(
            modifier = modifier,
            onClickCreateAccount = {
                navController.navigate(Screen.Register)
            },
            onClickLogin = {
                navController.navigate(Screen.Login)
            }
        )
        registerRoute()
        loginRoute()
    }
}

fun NavGraphBuilder.splashRoute(
    modifier: Modifier,
    onClickCreateAccount: () -> Unit,
    onClickLogin: () -> Unit
) {
    composable<Screen.Onboarding> {
        OnboardingScreen(
            modifier = modifier,
            onClickCreateAccount = onClickCreateAccount,
            onClickLogin = onClickLogin
        )
    }
}

fun NavGraphBuilder.registerRoute() {
    composable<Screen.Register> {
        RegisterScreen()
    }
}

fun NavGraphBuilder.loginRoute(){
    composable<Screen.Login> {}
}