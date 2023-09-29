package com.example.firstapplication

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.firstapplication.ui.theme.FirstApplicationTheme

class SplashScreen2Activity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FirstApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    SplashScreen2Ui()
                    Handler(Looper.getMainLooper()).postDelayed({
                        val intent = Intent(this, MainActivity::class.java)
                        startActivity(intent)
                        finish()
                    }, 2000)
                }
            }
        }
    }
}

@Composable
    fun SplashScreen2Ui() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Image(
            painterResource(id = R.drawable.splash_back),
            contentDescription = "App Image",
            Modifier
                .padding(bottom = 140.dp)
                .size(136.dp)

        )
    }
    Column(
        modifier = Modifier
            .fillMaxWidth()
        .fillMaxHeight(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,

    ) {
        Image(
            painterResource(id = R.drawable.splack_back_center),
            contentDescription = "App Image",
            contentScale = ContentScale.Fit,
            //.size(136.dp)
            modifier = Modifier
                .padding(bottom = 160.dp)
                .size(386.dp),

        )
    }
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text("Find Nearest Local",
            style = androidx.compose.ui.text.TextStyle(
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold ,
                fontFamily = FontFamily(Font(R.font.montserrat_medium)),


                ),
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(bottom = 70.dp)
        )
    }
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text("Market",
            style = androidx.compose.ui.text.TextStyle(
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold ,
                fontFamily = FontFamily(Font(R.font.montserrat_medium)),


                ),
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(bottom = 40.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview2() {
    FirstApplicationTheme {
        SplashScreen2Ui()
    }
}