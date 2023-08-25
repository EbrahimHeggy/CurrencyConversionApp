package dev.currency_conversion_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import dev.currency_conversion_app.presentation.screens.convert.CompareScreen
import dev.currency_conversion_app.presentation.screens.convert.CompareScreen2
import dev.currency_conversion_app.presentation.screens.convert.Home
import dev.currency_conversion_app.ui.theme.CurrencyConversionAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CurrencyConversionAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                ) {
                    //ConvertScreen()
                  //  ExposedDropdownMenuBox()
//                    CompareScreen()
                    Home()
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CurrencyConversionAppTheme {
        Greeting("Android")
    }
}