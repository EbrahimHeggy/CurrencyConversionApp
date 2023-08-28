package com.example.concurrency

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.concurrency.presentation.convert_screen.ConvertViewModel
import com.example.concurrency.presentation.main_screen.MainScreen
import com.example.concurrency.ui.theme.ConCurrencyTheme
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ConCurrencyTheme {
                val viewModel: ConvertViewModel = hiltViewModel()
                val convertState by viewModel.currencyState.collectAsState()
                MainScreen(convertState, viewModel::onEvent)

            }
        }
    }
}


