package com.example.concurrency

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp
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
                val convertState = viewModel.currencyState.collectAsState().value
                Box(modifier = Modifier.fillMaxSize()) {
                    if (convertState.error.isNotEmpty()) {
                        Text(
                            text = convertState.error,
                            fontSize = 16.sp,
                            color = Color.Red,
                            modifier = Modifier.align(Alignment.Center)
                        )
                    } else {
                        MainScreen(convertState, viewModel::onEvent)
                    }
                }
            }
        }
    }
}

