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
import coil.compose.rememberImagePainter
import com.example.concurrency.R
import com.example.concurrency.data.remote.model.DataX

@Composable
fun FavoriteItem(currencyData: DataX, context: Context) {
    var isChecked by remember { mutableStateOf(false) }

    // Use the currency code as a unique key
    val itemKey = "item_${currencyData.code}"

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
            // Use the currency's image URL to load the image
            Image(
                painter = rememberImagePainter(
                    data = currencyData.imageUrl,
                    builder = {
                        placeholder(R.drawable.egypt_flag) // You can set a placeholder image
                        error(R.drawable.united_kingdom_1) // You can set an error image
                    }
                ),
                contentDescription = ""
            )

            Column(
                modifier = Modifier
                    .padding(start = 8.dp)
            ) {
                Text(
                    text = currencyData.name,
                    style = TextStyle(
                        fontSize = 14.sp,
                        lineHeight = 23.12.sp,
                        fontWeight = FontWeight(400),
                        color = Color.Black,
                    )
                )

                Text(
                    text = currencyData.code,
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
