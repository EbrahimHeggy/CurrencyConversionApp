package com.example.concurrency.presentation.common

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.concurrency.R
import com.example.concurrency.ui.theme.FiledBackground


@Composable
fun HeaderScreen(
    onConvertPressed: () -> Unit,
    onComparePressed: () -> Unit,
    isCompareSelected: Boolean,
    isConvertSelected: Boolean,
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(0.4f)
    ) {
        // Background Image
        Image(
            painter = painterResource(id = R.drawable.currency_background),
            contentDescription = "Background",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.9f)
        )

        // App Name Image
        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = "App Name",
            modifier = Modifier
                .padding(16.dp)
                .width(150.dp)
                .height(40.dp)
                .align(Alignment.TopStart)
        )

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 40.dp)
                .align(Alignment.Center),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Currency Converter",
                style = TextStyle(
                    fontSize = 22.sp,
                    fontWeight = FontWeight(600),
                    color = Color(0xFFFFFFFF),
                ),
                modifier = Modifier.padding(bottom = 8.dp)
            )

            Text(
                text = "Check live foreign currency exchange rates",
                color = Color.White,
                style = TextStyle(
                    fontSize = 16.sp
                )
            )
        }
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .clip(shape = RoundedCornerShape(30.dp))
                .background(color = Color(0xfff8f8f8))
                .align(Alignment.BottomCenter)
        )
        {
            Button(
                onClick = { onConvertPressed() },
                shape = RoundedCornerShape(20.dp),
                colors = if (isConvertSelected)
                    ButtonDefaults.buttonColors(containerColor = Color.White)
                else
                    ButtonDefaults.buttonColors(containerColor = FiledBackground),
                contentPadding = PaddingValues(all = 9.dp),
                modifier = Modifier
                    .requiredWidth(width = 136.dp)
                    .requiredHeight(height = 46.dp)

            )
            {
                Text(
                    text = "Convert",
                    color = Color(0xff141414),
                    style = TextStyle(
                        fontSize = 13.sp
                    )
                )
            }

            Button(
                onClick = { onComparePressed() },
                shape = RoundedCornerShape(20.dp),
                colors = if (isCompareSelected)
                    ButtonDefaults.buttonColors(containerColor = Color.White)
                else
                    ButtonDefaults.buttonColors(containerColor = FiledBackground),
                contentPadding = PaddingValues(all = 9.dp),
                modifier = Modifier
                    .requiredWidth(width = 136.dp)
                    .requiredHeight(height = 46.dp)
            ) {
                Text(
                    text = "Compare",
                    color = Color(0xff141414),
                    style = TextStyle(
                        fontSize = 13.sp
                    )
                )
            }

        }
    }

}