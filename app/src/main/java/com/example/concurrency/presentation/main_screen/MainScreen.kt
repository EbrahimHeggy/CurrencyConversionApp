package com.example.concurrency.presentation.main_screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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

    if (convertState.error.isNotEmpty()){
        Box(modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
            contentAlignment = Alignment.Center
        ) {

            Text(text = "No Internet Connection...", fontSize = 16.sp, color = Color.Red)
        }
    } else {
        if (isConvert) {
            ConvertScreen(
                convertState,
                convertViewModel::onEvent,
            )
        } else {
            CompareScreen(compareState, compareViewModel::onEvent)
        }
    }


}







