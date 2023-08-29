package com.example.concurrency.presentation.favorite_screen

import android.content.Context
import android.content.SharedPreferences
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
import com.example.concurrency.data.remote.model.Currencies
import com.example.concurrency.data.remote.model.Currency
import com.example.concurrency.data.remote.model.DataX

@Composable
fun FavoriteList(currency: DataX, rate: String) {

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp),
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

        Text(text = rate, fontSize = 16.sp, color = Color.Black)

    }
}
