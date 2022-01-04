package com.miguellugo.narutoapp.navigation

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.google.accompanist.pager.ExperimentalPagerApi
import com.miguellugo.narutoapp.presentation.screens.home.HomeScreen
import com.miguellugo.narutoapp.presentation.screens.splash.SplashScreen
import com.miguellugo.narutoapp.presentation.screens.welcome.WelcomeScreen
import com.miguellugo.narutoapp.util.Constants.DETAILS_ARGUMENT_KEY

@ExperimentalAnimationApi
@ExperimentalPagerApi
@Composable
fun SetupNavGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = Screen.Splash.route) {
        composable(route = Screen.Splash.route) {
            SplashScreen(navController = navController)
        }
        composable(route = Screen.Welcome.route) {
            WelcomeScreen(navController = navController)
        }
        composable(route = Screen.Home.route) {
            HomeScreen()
        }
        composable(route = Screen.Details.route, arguments = listOf(navArgument(DETAILS_ARGUMENT_KEY){
            type = NavType.IntType
        })) {

        }
        composable(route = Screen.Search.route) {

        }
    }
}