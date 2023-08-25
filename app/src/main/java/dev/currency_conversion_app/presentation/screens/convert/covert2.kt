package dev.currency_conversion_app.presentation.screens.convert


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.ExposedDropdownMenuDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import dev.currency_conversion_app.R
import dev.currency_conversion_app.ui.theme.ButtonCol
import dev.currency_conversion_app.ui.theme.FiledBackground

@Composable
fun CompareScreen2() {

        CompareItem2()
        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = { },
            shape = CircleShape,
            colors = ButtonDefaults.buttonColors(ButtonCol),
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



@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CompareItem2() {

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
                            painter = painterResource(id = R.drawable.uaa),
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
                            painter = painterResource(id = R.drawable.uaa),
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