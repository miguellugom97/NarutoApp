package com.miguellugo.narutoapp.navigation

import com.miguellugo.narutoapp.util.Constants.DETAILS_ARGUMENT_KEY

sealed class Screen(val route: String) {
    object Splash: Screen("splash_screen")
    object Welcome: Screen("welcome_screen")
    object Home: Screen("home_screen")
    object Details: Screen("details_screen/{$DETAILS_ARGUMENT_KEY}") {
        fun passNinjaId(ninjaId: Int): String {
            return "details_screen/$ninjaId"
        }
    }
    object Search: Screen("search_screen")
}
