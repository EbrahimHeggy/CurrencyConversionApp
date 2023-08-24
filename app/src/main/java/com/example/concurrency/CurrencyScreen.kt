package com.example.concurrency


import android.content.Context
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.ExposedDropdownMenuDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.concurrency.ui.theme.ButtonColors
import com.example.concurrency.ui.theme.FiledBackground

@Composable
fun CompareScreen() {
    val appNameImage: Painter = painterResource(id = R.drawable.logo)
    val backgroundImage: Painter = painterResource(id = R.drawable.currency_background)

    Column(modifier = Modifier.fillMaxSize()) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.4f)
        ) {
            // Background Image
            Image(
                painter = backgroundImage,
                contentDescription = "Background",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(0.9f)
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
                    .padding(top = 30.dp)
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
                horizontalArrangement = Arrangement.spacedBy(10.dp),
                modifier = Modifier
                    .clip(shape = RoundedCornerShape(22.dp))
                    .background(color = Color(0xfff8f8f8))
                    .padding(start = 20.dp, end = 20.dp, top = 5.dp, bottom = 5.dp)
                    .align(Alignment.BottomCenter)
            )
            {
                Button(
                    onClick = { },
                    shape = RoundedCornerShape(20.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = FiledBackground),
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
                    onClick = { },
                    shape = RoundedCornerShape(20.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color.White),
                    contentPadding = PaddingValues(all = 9.dp),
                    modifier = Modifier
                        .requiredWidth(width = 108.dp)
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

        CompareItem()

        Spacer(modifier = Modifier.height(16.dp))


        Button(
            onClick = { },
            shape = CircleShape,
            colors = ButtonDefaults.buttonColors(ButtonColors),
            modifier = Modifier
                .fillMaxWidth()
                .height(90.dp)
                .padding(16.dp)
        ) {
            Text(
                text = "Compare",
                style = TextStyle(
                    fontSize = 16.sp,
                    fontWeight = FontWeight(700),
                    color = Color.White
                )
            )
        }

    }

}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CompareItem() {

    var expanded by remember {
        mutableStateOf(false)
    }

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {

        Column(
            modifier = Modifier
                .padding(6.dp)
                .weight(1f),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {

            Text(
                text = "Amount",
                style = TextStyle(
                    fontSize = 14.sp,
                    fontWeight = FontWeight(600),
                    color = Color(0xFF000000),
                )
            )

            OutlinedTextField(
                value = "1",
                onValueChange = {},
                shape = CircleShape,
                maxLines = 1,
                modifier = Modifier.background(FiledBackground)
            )



            Text(
                text = "Target Currency",
                style = TextStyle(
                    fontSize = 16.sp,
                    fontWeight = FontWeight(600),
                    color = Color(0xFF000000),
                )
            )

            ExposedDropdownMenuBox(
                expanded = expanded,
                onExpandedChange = { expanded = !expanded },
            ) {


                OutlinedTextField(
                    value = "EGP",
                    onValueChange = {},
                    readOnly = true,
                    shape = CircleShape,
                    maxLines = 1,
                    trailingIcon = {
                        ExposedDropdownMenuDefaults.TrailingIcon(
                            expanded = expanded
                        )
                    },
                    leadingIcon = {
                        Image(
                            painter = painterResource(id = R.drawable.egypt_flag),
                            contentDescription = ""
                        )
                    },
                    modifier = Modifier.background(FiledBackground).menuAnchor()

                )

                ExposedDropdownMenu(
                    expanded = expanded,
                    onDismissRequest = { expanded = false }
                ) {

                    DropdownMenuItem(text = { Text(text = "USD") }, onClick = { expanded = false })
                    DropdownMenuItem(text = { Text(text = "USD") }, onClick = { expanded = false })
                    DropdownMenuItem(text = { Text(text = "USD") }, onClick = { expanded = false })


                }

            }

            OutlinedTextField(
                value = "1",
                onValueChange = {},
                shape = CircleShape,
                maxLines = 1,
                modifier = Modifier.background(FiledBackground)
            )


        }


        Column(
            modifier = Modifier
                .padding(6.dp)
                .weight(1f),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {

            Text(
                text = "From",
                style = TextStyle(
                    fontSize = 14.sp,
                    fontWeight = FontWeight(600),
                    color = Color(0xFF000000),
                )
            )

            OutlinedTextField(
                value = "1",
                onValueChange = {},
                shape = CircleShape,
                maxLines = 1,
                modifier = Modifier.background(FiledBackground)
            )

            Text(
                text = "Target Currency",
                style = TextStyle(
                    fontSize = 16.sp,
                    fontWeight = FontWeight(600),
                    color = Color(0xFF000000),
                )
            )

            ExposedDropdownMenuBox(
                expanded = expanded,
                onExpandedChange = { expanded = !expanded },
            ) {


                OutlinedTextField(
                    value = "EGP",
                    onValueChange = {},
                    readOnly = true,
                    shape = CircleShape,
                    maxLines = 1,
                    trailingIcon = {
                        ExposedDropdownMenuDefaults.TrailingIcon(
                            expanded = expanded
                        )
                    },
                    leadingIcon = {
                        Image(
                            painter = painterResource(id = R.drawable.egypt_flag),
                            contentDescription = ""
                        )
                    },
                    modifier = Modifier.background(FiledBackground).menuAnchor()

                )

                ExposedDropdownMenu(
                    expanded = expanded,
                    onDismissRequest = { expanded = false }
                ) {

                    DropdownMenuItem(text = { Text(text = "USD") }, onClick = { expanded = false })
                    DropdownMenuItem(text = { Text(text = "USD") }, onClick = { expanded = false })
                    DropdownMenuItem(text = { Text(text = "USD") }, onClick = { expanded = false })


                }

            }

            OutlinedTextField(
                value = "1",
                onValueChange = {},
                shape = CircleShape,
                maxLines = 1,
                modifier = Modifier.background(FiledBackground)
            )


        }


    }


}








