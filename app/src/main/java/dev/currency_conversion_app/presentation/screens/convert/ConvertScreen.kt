package dev.currency_conversion_app.presentation.screens.convert

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
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
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import dev.currency_conversion_app.R

@Composable
fun ConvertScreen() {
    val appNameImage: Painter = painterResource(id = R.drawable.appname)
    val backgroundImage: Painter = painterResource(id = R.drawable.background)

    Column ( modifier = Modifier.fillMaxSize()){
        Box(
            modifier = Modifier.fillMaxWidth().fillMaxHeight(.5f)
        ) {
            // Background Image
            Image(
                painter = backgroundImage,
                contentDescription = "Background",
                contentScale = ContentScale.FillBounds,
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(.9f)
                    .align(Alignment.TopStart)
            )

            // App Name Image
            Image(
                painter = appNameImage,
                contentDescription = "App Name",
                modifier = Modifier
                    .padding(top = 16.dp)
                    .width(144.dp)
                    .height(32.dp)
                    .align(Alignment.TopStart)
            )

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 70.dp),
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
                horizontalArrangement = Arrangement.spacedBy(10.dp),
                modifier = Modifier
                    .clip(shape = RoundedCornerShape(22.dp))
                    .background(color = Color(0xfff8f8f8))
                    .padding(all = 10.dp)
                    .align(Alignment.BottomCenter)
            )
            {
                Button(
                    onClick = { },
                    shape = RoundedCornerShape(20.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color.White),
                    contentPadding = PaddingValues(all = 9.dp),
                    modifier = Modifier
                        .requiredWidth(width = 136.dp)
                        .requiredHeight(height = 46.dp)
                )
                {
                    Text(text ="Convert",
                        color = Color(0xff141414),
                        style = TextStyle(
                            fontSize = 13.sp
                        )
                    )
                }

                Button(
                    onClick = { },
                    shape = RoundedCornerShape(20.604267120361328.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xfff8f8f8)),
                    contentPadding = PaddingValues(all = 9.dp),
                    modifier = Modifier
                        .requiredWidth(width = 108.dp)
                        .requiredHeight(height = 46.dp)
                ) {
                    Text(
                        text = "Compare",
                        color = Color(0xff141414),
                        style = TextStyle(
                            fontSize = 13.sp))
                }

            }
        }
    }

}