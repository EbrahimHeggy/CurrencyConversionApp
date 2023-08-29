package com.example.concurrency.presentation.favorite_screen

import android.content.Context
import android.content.SharedPreferences
import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.example.concurrency.data.local.CurrencyEntity
import com.example.concurrency.data.local.FavoriteDatabase
import com.example.concurrency.data.remote.model.DataX
import com.example.concurrency.presentation.convert_screen.ConvertEvent
import kotlinx.coroutines.launch

@Composable
fun FavoriteItem(itemId: Int, context: Context, currency: DataX, onEvent: (ConvertEvent) -> Unit) {
    var isChecked by remember { mutableStateOf(false) }


    // Use a unique key for each item
    val itemKey = "item_$itemId"

    // Retrieve the checked state from SharedPreferences with a unique file name
    val sharedPreferences: SharedPreferences = remember {
        context.getSharedPreferences("MyPrefs_", Context.MODE_PRIVATE)
    }
    isChecked = sharedPreferences.getBoolean(itemKey, false)


    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {

        Row {
            AsyncImage(
                model = currency.imageUrl,
                contentDescription = "",
                modifier = Modifier.size(24.dp)
            )

            Column(
                modifier = Modifier
                    .padding(start = 8.dp)
            ) {
                Text(
                    text = currency.code,
                    style = TextStyle(
                        fontSize = 14.sp,
                        lineHeight = 23.12.sp,
                        fontWeight = FontWeight(400),
                        color = Color.Black,
                    )
                )

                Text(
                    text = currency.name,
                    style = TextStyle(
                        fontSize = 14.sp,
                        lineHeight = 23.12.sp,
                        fontWeight = FontWeight(400),
                        color = Color.Gray,
                    )
                )
            }
        }

        Checkbox(
            checked = isChecked,
            onCheckedChange = { newCheckedState ->
                isChecked = newCheckedState
                // Save the state in SharedPreferences
                sharedPreferences.edit().putBoolean(itemKey, newCheckedState).apply()

                if (newCheckedState) {
                    onEvent(ConvertEvent.InsertCurrency(currency))
                } else {
                    onEvent(ConvertEvent.DeleteCurrency(currency))
                }

            }
        )
    }
}

