package dev.currency_conversion_app.presentation.screens.convertScreen


import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FavoriteBottomSheet(isSheetEnabled: Boolean, onDismissRequest: () -> Unit) {
    val favoriteSheetState = rememberModalBottomSheetState()

    ModalBottomSheet(
        sheetState = favoriteSheetState,
        onDismissRequest = onDismissRequest
    ) {
        LazyColumn() {
            items(10) {
                FavoriteItem()
            }
        }
    }
}