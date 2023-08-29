package com.example.concurrency.presentation.compare_screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CircularProgressIndicator
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.example.concurrency.R
import com.example.concurrency.presentation.convert_screen.Base
import com.example.concurrency.presentation.convert_screen.ConvertEvent
import com.example.concurrency.presentation.convert_screen.CurrencyState
import com.example.concurrency.presentation.convert_screen.Target
import com.example.concurrency.ui.theme.ButtonColor
import com.example.concurrency.ui.theme.FiledBackground

@Composable
fun CompareScreen(
    state: CurrencyState,
    onEvent: (CompareEvent) -> Unit
) {

    var isAmountEmptyDialogShown by remember { mutableStateOf(false) }


    // Wrap the CircularProgressIndicator in a Box to control its visibility and layer
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {

        if (state.isLoading){
            CircularProgressIndicator(
                modifier = Modifier.size(50.dp), // Adjust size as needed
                color = Color.DarkGray, // Match the button's background color
                strokeWidth = 2.dp, // Customize the stroke width
            )
        }
        CompareItem(state, onEvent)

    }

    Button(
        onClick = {
            if (state.amount.isEmpty()) {
                // Amount is empty, show the dialog
                isAmountEmptyDialogShown = true
            } else {
                // Amount is not empty, proceed with comparison
                onEvent(
                    CompareEvent.GetComparedCurrency(
                        state.amount.toDouble(),
                        state.base.base,
                        state.target.target,
                        state.target2.target
                    )
                )
            }
        },
        shape = CircleShape,
        colors = ButtonDefaults.buttonColors(ButtonColor),
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


    if (isAmountEmptyDialogShown) {
        AlertDialog(
            onDismissRequest = {
                isAmountEmptyDialogShown = false
            },
            title = {
                Text("Empty Amount")
            },
            text = {
                Text("Please enter an amount before converting.")
            },
            confirmButton = {
                Button(
                    onClick = {
                        isAmountEmptyDialogShown = false
                    }
                ) {
                    Text("OK")
                }
            }
        )
    }



    Spacer(modifier = Modifier.height(16.dp))

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CompareItem(
    state: CurrencyState,
    onEvent: (CompareEvent) -> Unit
) {
    var expandedFrom by remember {
        mutableStateOf(false)
    }
    var expandedToTarget1 by remember {
        mutableStateOf(false)
    }
    var expandedToTarget2 by remember {
        mutableStateOf(false)
    }

    // Create separate state variables for the selected values in each dropdown
    var selectedBase by remember { mutableStateOf(state.base.base) }
    var selectedTarget1 by remember { mutableStateOf(state.target.target) }
    var selectedTarget2 by remember { mutableStateOf(state.target2.target) }

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
                onValueChange = { onEvent(CompareEvent.SetBaseAmount(it)) },
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
                    value = selectedTarget1, // Use the selected currency as the value
                    onValueChange = {
                        selectedTarget1 = it
                        onEvent(
                            CompareEvent.SetTarget1(
                                Target(
                                    target = it,
                                    imageUrl = ""
                                )
                            )
                        )
                    },
                    readOnly = true,
                    enabled = false,
                    shape = CircleShape,
                    maxLines = 1,
                    trailingIcon = {
                        ExposedDropdownMenuDefaults.TrailingIcon(
                            expanded = expandedToTarget1
                        )
                    },
                    leadingIcon = {
                        AsyncImage(model = state.target.imageUrl, modifier = Modifier.size(24.dp),contentDescription = "")
                    },
                    modifier = Modifier
                        .background(FiledBackground)
                        .menuAnchor()
                )
                ExposedDropdownMenu(
                    expanded = expandedToTarget1,
                    onDismissRequest = { expandedToTarget1 = false }
                ) {
                    // Filter the items based on the selections in other dropdowns
                    state.currencies?.data?.filter { it.code != selectedBase && it.code != selectedTarget2 }
                        ?.forEach { currency ->
                            DropdownMenuItem(
                                text = { Text(text = currency.code) },
                                onClick = {
                                    selectedTarget1 = currency.code
                                    onEvent(
                                        CompareEvent.SetTarget1(
                                            Target(
                                                target = currency.code,
                                                imageUrl = currency.imageUrl
                                            )
                                        )
                                    )
                                    expandedToTarget1 = false
                                },
                                leadingIcon = {
                                    AsyncImage(model = currency.imageUrl, modifier = Modifier.size(24.dp), contentDescription = "")
                                }
                            )
                        }
                }
            }
            OutlinedTextField(
                value = state.resultAmount,
                onValueChange = {},
                shape = CircleShape,
                maxLines = 1,
                modifier = Modifier.background(FiledBackground),
                readOnly = true
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
                    fontSize = 16.sp,
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
                    value = selectedBase,
                    onValueChange = {
                        selectedBase = it
                        onEvent(CompareEvent.SetBase(Base(base = it, imageUrl = "")))
                    },
                    readOnly = true,
                    shape = CircleShape,
                    enabled = false,
                    maxLines = 1,
                    trailingIcon = {
                        ExposedDropdownMenuDefaults.TrailingIcon(
                            expanded = expandedFrom
                        )
                    },
                    leadingIcon = {
                        AsyncImage(model = state.base.imageUrl, modifier = Modifier.size(24.dp), contentDescription = "")
                    },
                    modifier = Modifier
                        .background(FiledBackground)
                        .menuAnchor()
                )
                ExposedDropdownMenu(
                    expanded = expandedFrom,
                    onDismissRequest = { expandedFrom = false }
                ) {
                    // Filter the items based on the selections in other dropdowns
                    state.currencies?.data?.filter { it.code != selectedTarget1 && it.code != selectedTarget2 }
                        ?.forEach { currency ->
                            DropdownMenuItem(
                                text = { Text(text = currency.code) },
                                onClick = {
                                    selectedBase = currency.code
                                    onEvent(
                                        CompareEvent.SetBase(
                                            Base(
                                                base = currency.code,
                                                imageUrl = currency.imageUrl
                                            )
                                        )
                                    )
                                    expandedFrom = false
                                },
                                leadingIcon = {
                                    AsyncImage(model = currency.imageUrl, modifier = Modifier.size(24.dp), contentDescription = "")
                                }
                            )
                        }
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
                    value = selectedTarget2, // Use the selected currency as the value
                    onValueChange = {
                        selectedTarget2 = it
                        onEvent(CompareEvent.SetTarget2(Target(target = it, imageUrl = "")))
                    },
                    readOnly = true,
                    shape = CircleShape,
                    maxLines = 1,
                    enabled = false,
                    trailingIcon = {
                        ExposedDropdownMenuDefaults.TrailingIcon(
                            expanded = expandedToTarget2
                        )
                    },
                    leadingIcon = {
                        AsyncImage(model = state.target2.imageUrl, modifier = Modifier.size(24.dp), contentDescription = "")
                    },
                    modifier = Modifier
                        .background(FiledBackground)
                        .menuAnchor()
                )
                ExposedDropdownMenu(
                    expanded = expandedToTarget2,
                    onDismissRequest = { expandedToTarget2 = false }
                ) {
                    // Filter the items based on the selections in other dropdowns
                    state.currencies?.data?.filter { it.code != selectedBase && it.code != selectedTarget1 }
                        ?.forEach { currency ->
                            DropdownMenuItem(
                                text = { Text(text = currency.code) },
                                onClick = {
                                    selectedTarget2 = currency.code
                                    onEvent(
                                        CompareEvent.SetTarget2(
                                            Target(
                                                target = currency.code,
                                                imageUrl = currency.imageUrl
                                            )
                                        )
                                    )
                                    expandedToTarget2 = false
                                },
                                leadingIcon = {
                                    AsyncImage(model = currency.imageUrl,  modifier = Modifier.size(24.dp),contentDescription = "")
                                }
                            )
                        }
                }
            }
            OutlinedTextField(
                value = state.resultAmount2,
                onValueChange = {},
                shape = CircleShape,
                maxLines = 1,
                modifier = Modifier.background(FiledBackground)
            )
        }
    }
}