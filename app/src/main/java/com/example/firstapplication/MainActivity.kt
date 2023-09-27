package com.example.firstapplication

import android.os.Bundle
import android.print.PrintAttributes.Margins
import android.util.EventLogTags.Description
import android.view.Gravity
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.Dimension.Companion.DP
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.absolutePadding
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.firstapplication.ui.theme.FirstApplicationTheme
import java.time.format.TextStyle

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FirstApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    OurAppUi()
                }
            }
        }
    }
}

@Composable
fun OurAppUi(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Image(
            painterResource(id = R.drawable.splash_back),
            contentDescription = "App Image",
            Modifier
                .paddingFromBaseline(150.dp)
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
        Text(
            "Best Markitplac",
            style = androidx.compose.ui.text.TextStyle(
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold ,
                fontFamily = FontFamily(Font(R.font.montserrat_medium)),


            ),
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(top = 160.dp)
        )
    }
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(
            stringResource(R.string.On_Time_Departures),
            style = androidx.compose.ui.text.TextStyle(
                // fontSize = 30.sp,
                fontFamily = FontFamily(Font(R.font.montserrat_medium)),

                ),
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(top = 320.dp, start = 20.dp, end = 20.dp)

        )
    }

    Column(

        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),

        // below line is used for specifying
        // vertical arrangement.
        verticalArrangement = Arrangement.Center,

        // below line is used for specifying
        // horizontal arrangement.
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {

        val context = LocalContext.current

        Button(

            onClick = {

                Toast.makeText(context, "Welcome to Geeks for Geeks", Toast.LENGTH_LONG).show()
            },

            shape = RoundedCornerShape(6.dp),

            modifier = Modifier.padding(top = 560.dp, start = 20.dp, end = 20.dp).fillMaxWidth(),

            enabled = true,

            // below line is use to add border to our button.
           // border = BorderStroke(width = 1.dp, brush = SolidColor(Color.Blue)),

            // below line is use to add shape for our button.
            colors = ButtonDefaults.buttonColors(Color(0xFF0E1C9C))
        )
        // below line is use to
        // add text on our button
        {
            Text(text = "Get Started", color = Color.White,
                style = androidx.compose.ui.text.TextStyle(
                fontSize = 14.sp,
                fontFamily = FontFamily(Font(R.font.montserrat_medium)),

                ))
        }


    }
}




    @Preview(showBackground = true)
    @Composable
    fun GreetingPreview() {
        FirstApplicationTheme {
            OurAppUi()
        }
    }
