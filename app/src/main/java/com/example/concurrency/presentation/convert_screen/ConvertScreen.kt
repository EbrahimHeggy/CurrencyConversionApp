package com.example.concurrency.presentation.convert_screen


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
import coil.compose.AsyncImage
import com.example.concurrency.R
import com.example.concurrency.presentation.favorite_screen.FavoriteBottomSheet
import com.example.concurrency.ui.theme.ButtonColor
import com.example.concurrency.ui.theme.FiledBackground


@Composable
fun ConvertScreen(
    convertViewModel: ConvertViewModel,
    state: CurrencyState,
    onEvent: (ConvertEvent) -> Unit
) {


    var isSheetEnabled by remember {
        mutableStateOf(false)
    }

    ConvertItem(state, onEvent)

    Button(
        onClick = {
            onEvent(
                ConvertEvent.GetConvertedCurrency(
                    state.base,
                    state.target,
                    state.amount.toDouble(),
                )
            )
        },
        shape = CircleShape,
        colors = ButtonDefaults.buttonColors(ButtonColor),
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

    Spacer(modifier = Modifier.height(5.dp))


    Divider(
        color = Color.LightGray, modifier = Modifier.padding(start=16.dp,end=16.dp)
    )

    Spacer(modifier = Modifier.height(10.dp))

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalArrangement = Arrangement.SpaceBetween, // This will align the text to the start and the button to the end
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = "live exchange rates",
            modifier = Modifier,
            style = TextStyle(
                fontSize = 16.sp,
                fontWeight = FontWeight(600),
                color = Color(0xFF202020),
            )
        )

        Button(
            onClick = { isSheetEnabled = true },
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
        convertViewModel.currency?.let {
            FavoriteBottomSheet (currencies = it.data
            ) {
                isSheetEnabled = false
            }
        }
    }


    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalAlignment = Alignment.Start
    ) {
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
            modifier = Modifier.height(200.dp)
        ) {
            items(10) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 8.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    // Leading Icon
                    Image(
                        painter = painterResource(id = R.drawable.united_kingdom_1),
                        contentDescription = null,
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
fun ConvertItem(
    state: CurrencyState,
    onEvent: (ConvertEvent) -> Unit
) {


    var expandedFrom by remember {
        mutableStateOf(false)
    }
    var expandedTo by remember {
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
                    fontSize = 16.sp,
                    fontWeight = FontWeight(600),
                    color = Color(0xFF000000),
                )
            )

            OutlinedTextField(
                value = state.amount,
                onValueChange = { onEvent(ConvertEvent.SetBaseAmount(it)) },
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
                    value = state.target, // Use the selected currency as the value
                    onValueChange = { onEvent(ConvertEvent.SetTarget(it)) },
                    readOnly = true,
                    shape = CircleShape,
                    enabled = false,
                    maxLines = 1,
                    trailingIcon = {
                        ExposedDropdownMenuDefaults.TrailingIcon(
                            expanded = expandedTo
                        )
                    },
                    leadingIcon = {
                        Image(
                            painter = painterResource(id = R.drawable.egypt_flag),
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

                    state.currencies?.data?.forEach { currency ->
                        DropdownMenuItem(
                            text = { Text(text = currency.code) },
                            onClick = {
                                onEvent(ConvertEvent.SetTarget(currency.code)) // Update the selected currency when clicked
                                expandedTo = false
                            },
                            leadingIcon = {
                                AsyncImage(model = currency.imageUrl, contentDescription = "")
                            }
                        )
                    }
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
                    fontSize = 16.sp,
                    fontWeight = FontWeight(600),
                    color = Color(0xFF000000),
                )
            )

            ExposedDropdownMenuBox(
                expanded = expandedFrom,
                onExpandedChange = { expandedFrom = !expandedFrom },
            ) {

                OutlinedTextField(
                    value = state.base,
                    onValueChange = { onEvent(ConvertEvent.SetBase(it)) },
                    readOnly = true,
                    enabled = false,
                    shape = CircleShape,
                    maxLines = 1,
                    trailingIcon = {
                        ExposedDropdownMenuDefaults.TrailingIcon(
                            expanded = expandedFrom
                        )
                    },
                    leadingIcon = {
                        Image(
                            painter = painterResource(id = R.drawable.egypt_flag),
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

                    state.currencies?.data?.let {
                        it.forEach { currency ->
                            DropdownMenuItem(
                                text = { Text(text = currency.code) },
                                onClick = {
                                    onEvent(ConvertEvent.SetBase(currency.code)) // Update the selected currency when clicked
                                    expandedTo = false
                                },
                                leadingIcon = {
                                    AsyncImage(model = currency.imageUrl, contentDescription = "")
                                }

                            )
                        }
                    }

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
                value = state.resultAmount,
                onValueChange = {},
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

