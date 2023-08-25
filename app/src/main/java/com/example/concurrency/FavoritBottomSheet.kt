package com.example.concurrency

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FavoriteBottomSheet() {

    val favoriteSheetState = rememberModalBottomSheetState()
    var isSheetEnabled by remember {
        mutableStateOf(false)
    }

    if (isSheetEnabled){
        ModalBottomSheet(
            sheetState = favoriteSheetState,
            onDismissRequest = { isSheetEnabled = false }
        ) {
            LazyColumn() {
                items(10) {
                    FavoriteItem()
                }
            }

        }
    }

}