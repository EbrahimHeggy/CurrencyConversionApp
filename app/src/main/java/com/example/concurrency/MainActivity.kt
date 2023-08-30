package com.example.concurrency

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import androidx.navigation.compose.rememberNavController
import com.example.concurrency.presentation.main_screen.MainScreen
import com.example.concurrency.presentation.splash_screen.SplashScreen
import com.example.concurrency.ui.theme.ConCurrencyTheme
import com.example.concurrency.utils.Screen
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ConCurrencyTheme {
                val navController = rememberNavController()

                NavHost(
                    navController = navController,
                    startDestination = Screen.SplashScreen.route
                ) {

                    composable(route = Screen.SplashScreen.route){
                        SplashScreen(navController = navController)
                    }

                    composable(route = Screen.MainScreen.route){
                        MainScreen()
                    }

                }

            }
        }
    }
}


