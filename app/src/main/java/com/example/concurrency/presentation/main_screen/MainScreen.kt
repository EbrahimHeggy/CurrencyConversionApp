package com.example.concurrency.presentation.main_screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.concurrency.presentation.common.HeaderScreen
import com.example.concurrency.presentation.compare_screen.CompareScreen
import com.example.concurrency.presentation.compare_screen.CompareViewModel
import com.example.concurrency.presentation.convert_screen.ConvertScreen
import com.example.concurrency.presentation.convert_screen.ConvertViewModel


@Composable
fun MainScreen() {

    var isConvert by remember {
        mutableStateOf(true)
    }
    val scrollableState = rememberScrollState()

    Column(
        modifier = Modifier
            .verticalScroll(scrollableState)
            .fillMaxSize()
    ) {
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

    val convertViewModel: ConvertViewModel = hiltViewModel()
    val convertState by convertViewModel.currencyState.collectAsState()

    val compareViewModel: CompareViewModel = hiltViewModel()
    val compareState by compareViewModel.compareState.collectAsState()

    if (isConvert) {
        ConvertScreen(
            convertState,
            convertViewModel::onEvent,
        )
    } else {
        CompareScreen(compareState, compareViewModel::onEvent)
    }
}







