package com.msid.jetpackcomposeproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.msid.jetpackcomposeproject.ui.theme.JetpackcomposeprojectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            //SayHello("Siddhesh")
            DisplayButton()
        }
    }
}


    @Composable
    fun SayHello(name: String){
        Text("Hello World, $name",
            fontStyle = FontStyle.Italic,
            fontWeight = FontWeight.Bold,
            color = Color.Red,
            fontSize = 36.sp,
            textAlign = TextAlign.Right
        )
    }

    @Preview(showBackground = true, heightDp = 300, widthDp = 300)
    @Composable
    fun PreviewFunction(){
        //SayHello("Siddhesh")
        //DisplayImage()
        DisplayButton()
    }

    @Composable

    fun DisplayImage(){
        Image(
            painter = painterResource(R.drawable.ic_launcher_background),
            contentDescription = "Dummy Image",
            colorFilter = ColorFilter.tint(Color.Blue),
            contentScale = ContentScale.Crop
        )
    }

    @Composable
    fun DisplayButton(){
        Button(
            onClick = {},
            colors = ButtonDefaults.buttonColors(
                contentColor = Color.White,
                containerColor = Color.Black
            ),
            enabled = true
            ) {
            Text("Click Me")
            Image(
                painter = painterResource(R.drawable.ic_launcher_foreground),
                contentDescription = "Dummy"
            )
        }
}