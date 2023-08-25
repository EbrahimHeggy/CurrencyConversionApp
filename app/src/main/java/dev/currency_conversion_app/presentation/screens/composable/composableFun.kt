package dev.currency_conversion_app.presentation.screens.composable

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
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

@Composable
fun BackgroundImage(
     imageResId: Int,
    content: @Composable () -> Unit
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(.35f)
    ) {
        Image(
            painter = painterResource(id = imageResId),
            contentDescription = "",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(.9f)
                .align(Alignment.TopStart)
        )
        content()
    }
}


@Composable
fun AppNameImage(@DrawableRes imageResId: Int) {

    Image(
        painter = painterResource(id = imageResId),
        contentDescription = null,
        modifier = Modifier
            .padding(top = 16.dp)
            .width(144.dp)
    )
}


@Composable
fun HeaderText(text: String, subText: String) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 100.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = text,
            style = TextStyle(
                fontSize = 22.sp,
                fontWeight = FontWeight(600),
                color = Color(0xFFFFFFFF),
            ),
            modifier = Modifier.padding(bottom = 8.dp)
        )

        Text(
            text = subText,
            color = Color.White,
            style = TextStyle(
                fontSize = 16.sp
            )
        )
    }
}


@Composable
fun RoundedButton(
    text: String,
    isSelected: Boolean,
    onClick: () -> Unit
) {
    Button(
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(containerColor = Color(if (isSelected) 0xFFFFFFFF else 0xfff8f8f8)),
    ) {
        Text(
            text = text,
            color = Color(0xff141414),
            style = TextStyle(
                fontSize = 15.sp
            )
        )
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RoundedOutlinedTextField1(
    value: String,
    onValueChange: (String) -> Unit,
    label: String
) {
    OutlinedTextField(
        value = value,
        onValueChange = onValueChange,
        textStyle = TextStyle(fontSize = 15.sp),
        label = { Text(text = label) },
        shape = RoundedCornerShape(8.dp),
        modifier = Modifier
            .requiredWidth(width = 121.dp)
            .requiredHeight(height = 48.dp)
            .clip(shape = RoundedCornerShape(20.dp))
    )
}

@Composable
fun RoundedDropdownBox1(
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
                Icon(
                    imageVector = Icons.Default.ArrowDropDown,
                    contentDescription = null,
                    tint = Color.Black
                )
            }
        }
    }
}

@Composable
fun CustomDivider() {
    Divider(
        color = Color(0xffe9e9e9),
        modifier = Modifier
            .padding(15.dp)
    )
}


@Composable
fun LiveExchangeRatesHeader(text: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = text,
            style = TextStyle(
                fontSize = 16.84.sp,
                fontWeight = FontWeight(600),
                color = Color(0xFF202020),
            )
        )
    }
}

@Composable
fun AddToFavoritesButton(onClick: () -> Unit) {
    Button(
        onClick = onClick,
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
            contentDescription = "",
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

@Composable
fun PortfolioItem(currency: String, amount: String) {
    // Row with portfolio item
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
                text = currency,
                fontSize = 16.sp,
                fontWeight = FontWeight(50)
            )
        }

        Spacer(modifier = Modifier.weight(1f))

        // Third Text Element at the End of the Row
        Text(
            text = amount,
            fontSize = 16.sp
        )
    }
}
