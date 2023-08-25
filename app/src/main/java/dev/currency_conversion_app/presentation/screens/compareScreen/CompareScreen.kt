package dev.currency_conversion_app.presentation.screens.compareScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.KeyboardOptions
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
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import dev.currency_conversion_app.R
import dev.currency_conversion_app.ui.theme.ButtonCol
import dev.currency_conversion_app.ui.theme.FiledBackground

@Composable
fun CompareScreen() {

        CompareItem()
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
fun CompareItem() {
    var selectedCurrencyFrom by remember { mutableStateOf("EGP") } // Initial value
    var selectedCurrencyToTarget1 by remember { mutableStateOf("EGP") } // Initial value
    var selectedCurrencyToTarget2 by remember { mutableStateOf("EGP") } // Initial value

    var amountFrom by remember { mutableStateOf("") }
    var amountToTarget1 by remember { mutableStateOf("") }
    var amountToTarget2 by remember { mutableStateOf("") }

    var expandedFrom by remember {
        mutableStateOf(false)
    }
    var expandedToTarget1 by remember {
        mutableStateOf(false)
    }
    var expandedToTarget2 by remember {
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

            // AMOUNT FROM
            Text(
                text = "Amount",
                style = TextStyle(
                    fontSize = 14.sp,
                    fontWeight = FontWeight(600),
                    color = Color(0xFF000000),
                )
            )

            OutlinedTextField(
                value = amountFrom,
                onValueChange = {amountFrom=it},
                shape = CircleShape,
                maxLines = 1,
                keyboardOptions = KeyboardOptions.Default.copy(
                    keyboardType = KeyboardType.Number
                ),
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

            // TARGET 1 Currency DropMenu
            ExposedDropdownMenuBox(
                expanded = expandedToTarget1,
                onExpandedChange = { expandedToTarget1 = it },
            ) {

                OutlinedTextField(
                    value = selectedCurrencyToTarget1, // Use the selected currency as the value
                    onValueChange = {},
                    readOnly = true,
                    shape = CircleShape,
                    maxLines = 1,
                    trailingIcon = {
                        ExposedDropdownMenuDefaults.TrailingIcon(
                            expanded = expandedToTarget1
                        )
                    },
                    leadingIcon = {
                        Image(
                            painter = painterResource(id = R.drawable.u),
                            contentDescription = ""
                        )
                    },
                    modifier = Modifier
                        .background(FiledBackground)
                        .menuAnchor()

                )

                ExposedDropdownMenu(
                    expanded = expandedToTarget1,
                    onDismissRequest = { expandedToTarget1 = false }
                ) {

                    DropdownMenuItem(
                        text = { Text(text = "USD") },
                        onClick = {
                            selectedCurrencyToTarget1 = "USD" // Update the selected currency when clicked
                            expandedToTarget1 = false
                        }
                    )
                    DropdownMenuItem(
                        text = { Text(text = "EGP") },
                        onClick = {
                            selectedCurrencyToTarget1 = "EGP" // Update the selected currency when clicked
                            expandedToTarget1 = false
                        }
                    )
                    DropdownMenuItem(
                        text = { Text(text = "UKA") },
                        onClick = {
                            selectedCurrencyToTarget1 = "UKA" // Update the selected currency when clicked
                            expandedToTarget1 = false
                        }
                    )

                }

            }

            OutlinedTextField(
                value = amountToTarget1,
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


            // BASE CURRENCY DROPDOWN
            ExposedDropdownMenuBox(
                expanded = expandedFrom,
                onExpandedChange = { expandedFrom = !expandedFrom },
            ) {

                OutlinedTextField(
                    value = selectedCurrencyFrom,
                    onValueChange = {},
                    readOnly = true,
                    shape = CircleShape,
                    maxLines = 1,
                    trailingIcon = {
                        ExposedDropdownMenuDefaults.TrailingIcon(
                            expanded = expandedFrom
                        )
                    },
                    leadingIcon = {
                        Image(
                            painter = painterResource(id = R.drawable.u),
                            contentDescription = ""
                        )
                    },
                    modifier = Modifier
                        .background(FiledBackground)
                        .menuAnchor()

                )

                ExposedDropdownMenu(
                    expanded = expandedFrom,
                    onDismissRequest = { expandedFrom = false }
                ) {

                    DropdownMenuItem(text = { Text(text = "USD") }, onClick = {
                        selectedCurrencyFrom = "USD"
                        expandedFrom = false
                    })
                    DropdownMenuItem(text = { Text(text = "EGP") }, onClick = {selectedCurrencyFrom = "EGP"
                        expandedFrom = false })
                    DropdownMenuItem(text = { Text(text = "UKA") }, onClick = { selectedCurrencyFrom = "UKA"
                        expandedFrom = false })


                }

            }

            Text(
                text = "Target Currency",
                style = TextStyle(
                    fontSize = 16.sp,
                    fontWeight = FontWeight(600),
                    color = Color(0xFF000000),
                )
            )

            // TARGET 2 Currency DropMenu
            ExposedDropdownMenuBox(
                expanded = expandedToTarget2,
                onExpandedChange = { expandedToTarget2 = it },
            ) {

                OutlinedTextField(
                    value = selectedCurrencyToTarget2, // Use the selected currency as the value
                    onValueChange = {},
                    readOnly = true,
                    shape = CircleShape,
                    maxLines = 1,
                    trailingIcon = {
                        ExposedDropdownMenuDefaults.TrailingIcon(
                            expanded = expandedToTarget2
                        )
                    },
                    leadingIcon = {
                        Image(
                            painter = painterResource(id = R.drawable.u),
                            contentDescription = ""
                        )
                    },
                    modifier = Modifier
                        .background(FiledBackground)
                        .menuAnchor()

                )

                ExposedDropdownMenu(
                    expanded = expandedToTarget2,
                    onDismissRequest = { expandedToTarget2 = false }
                ) {

                    DropdownMenuItem(
                        text = { Text(text = "USD") },
                        onClick = {
                            selectedCurrencyToTarget2 = "USD" // Update the selected currency when clicked
                            expandedToTarget2 = false
                        }
                    )
                    DropdownMenuItem(
                        text = { Text(text = "EGP") },
                        onClick = {
                            selectedCurrencyToTarget2 = "EGP" // Update the selected currency when clicked
                            expandedToTarget2 = false
                        }
                    )
                    DropdownMenuItem(
                        text = { Text(text = "UKA") },
                        onClick = {
                            selectedCurrencyToTarget2 = "UKA" // Update the selected currency when clicked
                            expandedToTarget2 = false
                        }
                    )

                }

            }

            OutlinedTextField(
                value = amountToTarget2,
                onValueChange = {},
                shape = CircleShape,
                maxLines = 1,
                modifier = Modifier.background(FiledBackground)
            )
        }
    }
}