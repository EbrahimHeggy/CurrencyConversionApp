package com.example.concurrency.presentation.favorite_screen
import android.content.Context
import android.content.SharedPreferences
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.concurrency.R

@Composable
fun FavoriteItem(itemId: Int, context: Context) {
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
            Image(
                painter = painterResource(id = R.drawable.united_kingdom_1),
                contentDescription = ""
            )

            Column(
                modifier = Modifier
                    .padding(start = 8.dp)
            ) {
                Text(
                    text = "USD",
                    style = TextStyle(
                        fontSize = 14.sp,
                        lineHeight = 23.12.sp,
                        fontWeight = FontWeight(400),
                        color = Color.Black,
                    )
                )

                Text(
                    text = "Currency",
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
            onCheckedChange = {
                isChecked = it
                // Save the state in SharedPreferences
                sharedPreferences.edit().putBoolean(itemKey, it).apply()
            }
        )
    }
}
