package com.example.concurrency

import android.annotation.SuppressLint
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*


@SuppressLint("SuspiciousIndentation")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FavoriteBottomSheet(onSheetDismissed: () -> Unit) {

    val favoriteSheetState = rememberModalBottomSheetState()


        ModalBottomSheet(
            sheetState = favoriteSheetState,
            onDismissRequest = { onSheetDismissed() }
        ) {
            LazyColumn() {
                items(10) {
                    FavoriteItem()
                }
            }

        }


}