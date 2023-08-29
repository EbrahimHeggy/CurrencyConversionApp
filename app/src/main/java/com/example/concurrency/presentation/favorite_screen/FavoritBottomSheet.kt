package com.example.concurrency.presentation.favorite_screen

import android.annotation.SuppressLint
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.*
import androidx.compose.ui.platform.LocalContext
import com.example.concurrency.data.remote.model.DataX
import com.example.concurrency.presentation.convert_screen.ConvertEvent


@SuppressLint("SuspiciousIndentation")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FavoriteBottomSheet(
    onSheetDismissed: () -> Unit,
    currencies: List<DataX>,
    onEvent: (ConvertEvent) -> Unit
) {
    val context = LocalContext.current
    val favoriteSheetState = rememberModalBottomSheetState()


    ModalBottomSheet(
        sheetState = favoriteSheetState,
        onDismissRequest = { onSheetDismissed() }
    ) {
        LazyColumn() {
            items(currencies.size) {
                FavoriteItem(it, context = context, currencies[it], onEvent)
            }
        }

    }


}