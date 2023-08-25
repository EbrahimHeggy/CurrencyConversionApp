package dev.currency_conversion_app.presentation.screens.convertScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
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
fun ConvertScreen() {

    var isSheetEnabled by remember {
        mutableStateOf(false)
    }

            ConvertItem()

            Button(
                onClick = { },
                shape = CircleShape,
                colors = ButtonDefaults.buttonColors(ButtonCol),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(80.dp)
                    .padding(16.dp)
            ) {
                Text(
                    text = "Convert",
                    style = TextStyle(
                        fontSize = 16.sp,
                        fontWeight = FontWeight(700),
                        color = Color.White
                    )
                )
            }

            Spacer(modifier = Modifier.height(10.dp))


            Divider(
                color = Color.LightGray, modifier = Modifier
            )

            Spacer(modifier = Modifier.height(20.dp))

            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween, // This will align the text to the start and the button to the end
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "live exchange rates",
                    modifier= Modifier,
                    style = TextStyle(
                        fontSize = 16.sp,
                        fontWeight = FontWeight(600),
                        color = Color(0xFF202020),
                    )
                )

                Button(
                    onClick = { isSheetEnabled=true },
                    colors = ButtonDefaults.buttonColors(Color.White),
                    shape = RoundedCornerShape(20.dp),
                    modifier = Modifier.border(
                        width = 1.dp,
                        color = Color(0xFF000000),
                        shape = RoundedCornerShape(size = 25.dp)
                    )
                ) {
                    Icon(
                        imageVector = Icons.Default.Add,
                        contentDescription = null,
                        modifier = Modifier
                            .size(24.dp)
                            .border(
                                width = 1.dp,
                                color = Color(0xFF000000),
                                shape = RoundedCornerShape(size = 18.dp)
                            ),
                        tint = Color.Black
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(
                        text = "Add to Favorites",
                        fontSize = 10.sp,
                        fontWeight = FontWeight(600),
                        color = Color(0xFF363636),
                    )
                }
            }
    // Show the bottom sheet when isSheetEnabled is true
    if (isSheetEnabled) {
        FavoriteBottomSheet(
            isSheetEnabled = isSheetEnabled,
            onDismissRequest = { isSheetEnabled = false }
        )
    }


            Column (modifier = Modifier
                .fillMaxWidth(),
            horizontalAlignment = Alignment.Start
            ){
                // Text "My Portfolio"
                Box {
                    Text(
                        text = "My Portfolio",
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp,
                        modifier = Modifier.align(Alignment.TopStart)
                    )
                }

                // Lazy Column with portfolio items
                LazyColumn(
                    modifier = Modifier.padding(start=16.dp)
                ) {
                    items(3) { index ->
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(vertical = 8.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            // Leading Icon
                            Icon(
                                imageVector = Icons.Default.AccountCircle,
                                contentDescription = null,
                                modifier = Modifier.size(24.dp),
                                tint = Color(0xFF000000),
                            )

                            Spacer(modifier = Modifier.width(8.dp))

                            // Two Text Elements Stacked Vertically
                            Column {
                                Text(
                                    text = "USD",
                                    fontSize = 16.sp
                                )
                                Text(

                                    text = "CURRENCY",
                                    fontSize = 16.sp,
                                    fontWeight = FontWeight(50)
                                )
                            }

                            Spacer(modifier = Modifier.weight(1f))

                            // Third Text Element at the End of the Row
                            Text(
                                text = "$29,850.15",
                                fontSize = 16.sp
                            )
                        }
                    }
                }


            }

        }

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ConvertItem() {

    var amountFrom by remember { mutableStateOf("") }
    var amountTo by remember { mutableStateOf("") }

    var selectedCurrencyFrom by remember { mutableStateOf("EGP") } // Initial value
    var selectedCurrencyTo by remember { mutableStateOf("EGP") } // Initial value


    var expandedFrom by remember {
        mutableStateOf(false)
    }
    var expandedTo by remember {
        mutableStateOf(false)
    }

    Row(
        modifier = Modifier
            .fillMaxWidth(),
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
                text = "To",
                style = TextStyle(
                    fontSize = 16.sp,
                    fontWeight = FontWeight(600),
                    color = Color(0xFF000000),
                )
            )

            // To Currency DropMenu
            ExposedDropdownMenuBox(
                expanded = expandedTo,
                onExpandedChange = { expandedTo = it },
            ) {

                OutlinedTextField(
                    value = selectedCurrencyTo, // Use the selected currency as the value
                    onValueChange = {},
                    readOnly = true,
                    shape = CircleShape,
                    maxLines = 1,
                    trailingIcon = {
                        ExposedDropdownMenuDefaults.TrailingIcon(
                            expanded = expandedTo
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
                    expanded = expandedTo,
                    onDismissRequest = { expandedTo = false }
                ) {

                    DropdownMenuItem(
                        text = { Text(text = "USD") },
                        onClick = {
                            selectedCurrencyTo = "USD" // Update the selected currency when clicked
                            expandedTo = false
                        }
                    )
                    DropdownMenuItem(
                        text = { Text(text = "EGP") },
                        onClick = {
                            selectedCurrencyTo = "EGP" // Update the selected currency when clicked
                            expandedTo = false
                        }
                    )
                    DropdownMenuItem(
                        text = { Text(text = "UKA") },
                        onClick = {
                            selectedCurrencyTo = "UKA" // Update the selected currency when clicked
                            expandedTo = false
                        }
                    )

                }

            }



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
                text = "Amount",
                style = TextStyle(
                    fontSize = 16.sp,
                    fontWeight = FontWeight(600),
                    color = Color(0xFF000000),
                )
            )

            OutlinedTextField(
                value = amountTo,
                onValueChange = {amountTo=it},
                shape = CircleShape,
                maxLines = 1,
                keyboardOptions = KeyboardOptions.Default.copy(
                    keyboardType = KeyboardType.Number
                ),
                modifier = Modifier.background(FiledBackground)
            )

        }

    }
}