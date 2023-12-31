package com.example.concurrency.utils

sealed class Screen(val route: String) {

    object SplashScreen: Screen("splash_screen")
    object MainScreen: Screen("main_screen")


}
