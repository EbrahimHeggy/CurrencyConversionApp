package dev.currency_conversion_app.presentation.screens.convert

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import dev.currency_conversion_app.R

@Composable
fun Home() {

    var isConvertScreen by remember { mutableStateOf(true) }

    val appNameImage: Painter = painterResource(id = R.drawable.appname)
    val backgroundImage: Painter = painterResource(id = R.drawable.background)

    // Initialize selected button state
    var isConvertSelected by remember { mutableStateOf(true) }
    var isCompareSelected by remember { mutableStateOf(false) }


    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        // Background
        Image(
            painter = backgroundImage,
            contentDescription = "Background",
            contentScale = ContentScale.FillWidth,
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.25f)
        )

        // App Name
        Image(
            painter = appNameImage,
            contentDescription = "App Name",
            modifier = Modifier
                .fillMaxWidth(.4f)
                .fillMaxHeight(.1f)
                .padding(start = 10.dp)
                .align(Alignment.TopStart)
        )

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(20.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        )
        {

            // Nested Column for Text elements
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 70.dp), Arrangement.SpaceBetween,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Currency Converter",
                    style = TextStyle(
                        fontSize = 22.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFFFFFFFF),
                    ),
                )

                Text(
                    text = "Check live foreign currency exchange rates",
                    color = Color.White,
                    style = TextStyle(
                        fontWeight = FontWeight.Normal,
                        fontSize = 16.sp
                    )


                )
            }

            Spacer(modifier = Modifier.height(20.dp))
            // Row for Button elements
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .clip(shape = RoundedCornerShape(30.dp))
                    .background(color = Color(0xfff8f8f8))
                    .padding(vertical = 5.dp)
            ) {
                Button(
                    onClick = {
                        isConvertSelected = true
                        isCompareSelected = false
                        isConvertScreen=true
                    },
                    shape = RoundedCornerShape(20.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color(if (isConvertSelected) 0xFFFFFFFF else 0xfff8f8f8)),

                    contentPadding = PaddingValues(all = 9.dp),
                    modifier = Modifier.weight(1f)
                ) {
                    Text(
                        text = "Convert",
                        color = Color(0xff141414),
                        style = TextStyle(
                            fontSize = 13.sp
                        )
                    )
                }

                Button(
                    onClick = {
                        isConvertSelected = false
                        isCompareSelected = true
                        isConvertScreen = false
                    },
                    colors = ButtonDefaults.buttonColors(containerColor = Color(if (isCompareSelected) 0xFFFFFFFF else 0xfff8f8f8)),
                    shape = RoundedCornerShape(20.dp),
                    contentPadding = PaddingValues(all = 9.dp),
                    modifier = Modifier.weight(1f)
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

            if (isConvertScreen) {
                CompareScreen3()
            } else {
                CompareScreen2()
            }

        }
    }
}