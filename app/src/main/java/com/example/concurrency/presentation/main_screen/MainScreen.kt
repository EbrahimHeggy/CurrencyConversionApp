package com.example.concurrency.presentation.main_screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import com.example.concurrency.presentation.common.HeaderScreen
import com.example.concurrency.presentation.compare_screen.CompareScreen
import com.example.concurrency.presentation.convert_screen.ConvertEvent
import com.example.concurrency.presentation.convert_screen.ConvertScreen
import com.example.concurrency.presentation.convert_screen.CurrencyState


@Composable
fun MainScreen(
    state: CurrencyState,
    onEvent: (ConvertEvent) -> Unit
) {

    var isConvert by remember {
        mutableStateOf(true)
    }
    val scrollableState = rememberScrollState()

    Column(modifier = Modifier
        .verticalScroll(scrollableState)
        .fillMaxSize()) {
        HeaderScreen(
            onConvertPressed = { isConvert = true },
            onComparePressed = { isConvert = false },
            isConvertSelected = isConvert,
            isCompareSelected = !isConvert
        )

        HandleScreens(isConvert = isConvert, state, onEvent)
    }


}


@Composable
fun HandleScreens(
    isConvert: Boolean,
    state: CurrencyState,
    onEvent: (ConvertEvent) -> Unit
) {
    if (isConvert) {
        ConvertScreen(state, onEvent)
    } else {
        CompareScreen()
    }
}







