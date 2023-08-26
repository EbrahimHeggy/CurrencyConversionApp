package com.example.concurrency.presentation.compare_screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.concurrency.R

import com.example.concurrency.ui.theme.FiledBackground


@Preview
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CompareScreen() {

    var baseExpanded by remember {
        mutableStateOf(false)
    }
    var targetExpanded by remember {
        mutableStateOf(false)
    }

    var targetExpanded2 by remember {
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
                expanded = targetExpanded,
                onExpandedChange = { targetExpanded = !targetExpanded },
            ) {


                OutlinedTextField(
                    value = "EGP",
                    onValueChange = {},
                    readOnly = true,
                    shape = CircleShape,
                    maxLines = 1,
                    trailingIcon = {
                        ExposedDropdownMenuDefaults.TrailingIcon(
                            expanded = targetExpanded
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
                    expanded = targetExpanded,
                    onDismissRequest = { targetExpanded = false }
                ) {

                    DropdownMenuItem(text = { Text(text = "USD") }, onClick = { targetExpanded = false })
                    DropdownMenuItem(text = { Text(text = "USD") }, onClick = { targetExpanded = false })
                    DropdownMenuItem(text = { Text(text = "USD") }, onClick = { targetExpanded = false })


                }

            }

            OutlinedTextField(
                value = "1",
                onValueChange = {},
                shape = CircleShape,
                maxLines = 1,
                modifier = Modifier.background(FiledBackground),
                enabled = false
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

            ExposedDropdownMenuBox(
                expanded = baseExpanded,
                onExpandedChange = { baseExpanded = !baseExpanded },
            ) {


                OutlinedTextField(
                    value = "EGP",
                    onValueChange = {},
                    readOnly = true,
                    shape = CircleShape,
                    maxLines = 1,
                    trailingIcon = {
                        ExposedDropdownMenuDefaults.TrailingIcon(
                            expanded = baseExpanded
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
                    expanded = baseExpanded,
                    onDismissRequest = { baseExpanded = false }
                ) {

                    DropdownMenuItem(text = { Text(text = "USD") }, onClick = { baseExpanded = false })
                    DropdownMenuItem(text = { Text(text = "USD") }, onClick = { baseExpanded = false })
                    DropdownMenuItem(text = { Text(text = "USD") }, onClick = { baseExpanded = false })


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

            ExposedDropdownMenuBox(
                expanded = targetExpanded2,
                onExpandedChange = { targetExpanded2 = !targetExpanded2 },
            ) {


                OutlinedTextField(
                    value = "EGP",
                    onValueChange = {},
                    readOnly = true,
                    shape = CircleShape,
                    maxLines = 1,
                    trailingIcon = {
                        ExposedDropdownMenuDefaults.TrailingIcon(
                            expanded = targetExpanded2
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
                    expanded = targetExpanded2,
                    onDismissRequest = { targetExpanded2 = false }
                ) {

                    DropdownMenuItem(text = { Text(text = "USD") }, onClick = { targetExpanded2 = false })
                    DropdownMenuItem(text = { Text(text = "USD") }, onClick = { targetExpanded2 = false })
                    DropdownMenuItem(text = { Text(text = "USD") }, onClick = { targetExpanded2 = false })


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










