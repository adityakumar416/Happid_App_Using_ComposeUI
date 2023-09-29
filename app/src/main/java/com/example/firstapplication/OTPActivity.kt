package com.example.firstapplication

import android.annotation.SuppressLint
import android.content.Context
import android.os.Bundle
import android.util.AttributeSet

import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.viewinterop.AndroidView
import com.example.firstapplication.ui.theme.FirstApplicationTheme
import com.hbb20.CountryCodePicker


class OTPActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FirstApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting()
                }
            }
        }
    }
}

@SuppressLint("RememberReturnType")
@Composable
fun Greeting() {
    var selectedCountryCode by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start,
    ) {
        Image(
            painterResource(id = R.drawable.arrow_back),
            contentDescription = "App Image",

            Modifier
                .size(50.dp)
                .padding(top = 20.dp, start = 14.dp)

        )
    }
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(
            "Enter Your Mobile Number",
            style = androidx.compose.ui. text.TextStyle(
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily(Font(R.font.montserrat_medium)),


                ),
            textAlign = TextAlign.Start,
            modifier = Modifier
                .padding(top = 100.dp, start = 20.dp, end = 20.dp)
        )
    }
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start,
    ) {
        Text(
            "Hello, Welcome Back to Our Account",
            style = androidx.compose.ui.text.TextStyle(
                fontSize = 17.sp,
                fontWeight = FontWeight.Medium,
                fontFamily = FontFamily(Font(R.font.montserrat_medium)),

                ),
            // textAlign = TextAlign.Start,
            modifier = Modifier
                .padding(top = 180.dp, start = 20.dp)
        )
    }


    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        val context = LocalContext.current

        AndroidView(
            factory = { context ->
                CountryCodePicker(context)
            },
            update = { countryCodePicker ->
                // Handle country selection
                countryCodePicker.setOnCountryChangeListener {
                    selectedCountryCode = countryCodePicker.selectedCountryCode
                }
            }
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "Selected Country Code: $selectedCountryCode",
            fontWeight = FontWeight.Bold,
            color = Color.Black
        )
    }


}

@Composable
fun CustomCountryCodePicker(
    context: Context,
    onCountrySelected: (CountryCodePicker) -> Unit
) {
    CountryCodePicker(context).apply {
        onCountrySelected(this)
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview3() {
    FirstApplicationTheme {
        Greeting()
    }
}