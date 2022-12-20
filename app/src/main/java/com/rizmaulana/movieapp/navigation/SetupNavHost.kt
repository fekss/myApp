package com.rizmaulana.movieapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.rizmaulana.movieapp.screens.MainScreen
import com.rizmaulana.movieapp.screens.SplashScreen
import com.rizmaulana.movieapp.utils.Constants


sealed class Screens(val route: String) {
    object Splash: Screens(route = Constants.Screens.SPLASH_SCREEN)
    object Main: Screens(route = Constants.Screens.MAIN_SCREEN)
    object Detail: Screens(route = Constants.Screens.DETAIL_SCREEN)
}

@Composable
fun SetupNavHost(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Screens.Splash.route
    ) {
        composable(route = Screens.Splash.route) {
            SplashScreen(navController)
        }
        composable(route = Screens.Main.route) {
            MainScreen()
        }
        composable(route = Screens.Detail.route) {

        }

    }
}