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
import com.example.concurrency.presentation.convert_screen.ConvertScreen


@Composable
fun MainScreen() {

    var isConvert by remember {
        mutableStateOf(true)
    }
    val scrollableState = rememberScrollState()

    Column(modifier = Modifier.verticalScroll(scrollableState).fillMaxSize()) {
        HeaderScreen(
            onConvertPressed = { isConvert = true },
            onComparePressed = { isConvert = false },
            isConvertSelected = isConvert,
            isCompareSelected = !isConvert
        )

        HandleScreens(isConvert = isConvert)
    }


}


@Composable
fun HandleScreens(
    isConvert: Boolean,
) {
    if (isConvert) {
        ConvertScreen()
    } else {
        CompareScreen()
    }
}







