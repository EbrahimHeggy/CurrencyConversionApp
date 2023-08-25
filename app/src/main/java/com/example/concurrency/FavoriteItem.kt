package com.example.concurrency

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Preview
@Composable
fun FavoriteItem() {

    var isChecked by remember {
        mutableStateOf(true)
    }

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

        Box {
           Checkbox(
               checked = isChecked ,
               onCheckedChange = {
                   isChecked = it
               }
           )
        }

    }

}










