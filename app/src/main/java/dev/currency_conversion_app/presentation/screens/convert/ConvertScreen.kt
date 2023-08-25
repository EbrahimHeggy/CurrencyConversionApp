package dev.currency_conversion_app.presentation.screens.convert

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Divider
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.ExperimentalMaterial3Api
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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import dev.currency_conversion_app.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable

fun ConvertScreen() {
    // Initialize selected button state
    var isConvertSelected by remember { mutableStateOf(true) }
    var isCompareSelected by remember { mutableStateOf(false) }
    // State for currency amounts and selected countries
    var amountFrom by remember { mutableStateOf("") }
    var amountTo by remember { mutableStateOf("") }

    // Dummy list of currencies
    val currencies = listOf("USD", "EUR", "GBP", "JPY", "AUD")

    // Initialize selected currencies
    var selectedFromCurrency by remember { mutableStateOf(currencies[0]) }
    var selectedToCurrency by remember { mutableStateOf(currencies[1]) }
    var expanded by remember { mutableStateOf(false) }
    var expanded2 by remember { mutableStateOf(false) }
    var scrollstate = rememberScrollState()

    Column(modifier = Modifier.fillMaxSize())
    {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(.35f)
        ) {
            // Background Image
            Image(
                painter = painterResource(id = R.drawable.background),
                contentDescription = "Background",
                contentScale = ContentScale.FillBounds,
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(.9f)
                    .align(Alignment.TopStart)
            )

            // App Name Image
            Image(
                painter = painterResource(id = R.drawable.appname),
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
                    .padding(top = 100.dp),
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
                    .clip(shape = RoundedCornerShape(50.dp))
                    .background(color = Color(0xfff8f8f8))
                    .padding(start = 20.dp, end = 20.dp, top = 5.dp, bottom = 5.dp)
                    .align(Alignment.BottomCenter)
            ) {
                Button(
                    onClick = {
                        isConvertSelected = true
                        isCompareSelected = false
                    },
                    colors = ButtonDefaults.buttonColors(containerColor = Color(if (isConvertSelected) 0xFFFFFFFF else 0xfff8f8f8)),

                    ) {
                    Text(
                        text = "Convert",
                        color = Color(0xff141414),
                        style = TextStyle(
                            fontSize = 15.sp
                        )
                    )
                }

                Button(
                    onClick = {
                        isConvertSelected = false
                        isCompareSelected = true
                    },
                    colors = ButtonDefaults.buttonColors(containerColor = Color(if (isCompareSelected) 0xFFFFFFFF else 0xfff8f8f8)),

                    ) {
                    Text(
                        text = "Compare",
                        color = Color(0xff141414),
                        style = TextStyle(
                            fontSize = 15.sp
                        )
                    )
                }
            }

        }



        ElevatedCard(
            modifier = Modifier
                .padding(16.dp) // Add padding as needed
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth(),
                Arrangement.Center
            ) {
                // Row 1: Amount and From
                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {

                    // Rounded OutlinedTextField with smaller width
                    RoundedOutlinedTextField(
                        value = amountFrom,
                        onValueChange = { amountFrom = it },
                        label = { Text(text = "Amount") },
                    )

                    // Custom Modifier for rounded dropdown
                    RoundedDropdownBox(expanded, selectedFromCurrency, {
                        expanded = it
                    }) {
                        Text(text = selectedFromCurrency)
                        DropdownMenu(
                            expanded = expanded,
                            onDismissRequest = {
                                // Handle menu dismissal
                            }
                        ) {
                            currencies.forEach { currency ->
                                DropdownMenuItem(
                                    {
                                        Text(text = currency)
                                    },
                                    onClick = {
                                        selectedFromCurrency = currency
                                        expanded = false
                                    }
                                )
                            }
                        }
                    }

                }

                // Row 2: To and Amount
                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    // Custom Modifier for rounded dropdown
                    RoundedDropdownBox(expanded2, selectedToCurrency, {
                        expanded2 = it
                    }) {
                        Text(text = selectedToCurrency)
                        DropdownMenu(
                            expanded = expanded2,
                            onDismissRequest = {
                                // Handle menu dismissal
                            }
                        ) {
                            currencies.forEach { currency ->
                                DropdownMenuItem(
                                    {
                                        Text(text = currency)
                                    },
                                    onClick = {
                                        selectedToCurrency = currency
                                        expanded2 = false
                                    }
                                )
                            }
                        }
                    }

                    // Rounded OutlinedTextField with smaller width
                    RoundedOutlinedTextField(
                        value = amountTo,
                        onValueChange = { amountTo = it },
                        label = { Text(text = "Amount") },

                        )
                }

                Button( // Add padding as needed
                    onClick = { /*TODO*/ },
                    shape = RoundedCornerShape(20.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xff363636))
                ) {
                    Text(text = "Convert")
                }

            }
        }


        Spacer(modifier = Modifier.height(10.dp))

        Divider(
            color = Color(0xffe9e9e9), modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(15.dp)
        )


        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "live exchange rates",
                style = TextStyle(
                    fontSize = 16.84.sp,
                    fontWeight = FontWeight(600),
                    color = Color(0xFF202020),
                )
            )

            Button(
                onClick = { /* Handle button click */ },
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


        // Text "My Portfolio"
        Text(
            text = "My Portfolio",
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp,
            modifier = Modifier.padding(start = 16.dp,end=16.dp)
        )

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
fun RoundedDropdownBox(
    expanded: Boolean,
    text: String,
    onClick: (Boolean) -> Unit,
    content: @Composable () -> Unit
) {
    Box(
        modifier = Modifier.clickable {
            onClick(!expanded)
        },
        contentAlignment = Alignment.Center
    ) {
        Card(
            shape = RoundedCornerShape(8.dp),
            modifier = Modifier.fillMaxWidth()
        ) {
            Row(
                modifier = Modifier.padding(horizontal = 16.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                content()
                Image(
                    painter = painterResource(id = R.drawable.eu),
                    contentDescription = null,
                    modifier = Modifier.clip(CircleShape).size(20.dp)
                )
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RoundedOutlinedTextField(
    value: String,
    onValueChange: (String) -> Unit,
    label: @Composable () -> Unit,
    modifier: Modifier = Modifier
) {
    OutlinedTextField(
        value = value,
        onValueChange = onValueChange,
        textStyle = TextStyle(fontSize = 15.sp),
        label = label,
        shape = RoundedCornerShape(8.dp),
        modifier = modifier
            .requiredWidth(width = 121.dp)
            .requiredHeight(height = 48.dp)
            .clip(shape = RoundedCornerShape(20.dp)))
}