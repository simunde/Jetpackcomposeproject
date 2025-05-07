package com.msid.jetpackcomposeproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.msid.jetpackcomposeproject.ui.theme.JetpackcomposeprojectTheme
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            //SayHello("Siddhesh")
            //DisplayButton()
            //DisplaySomething()
            //ModifierExamples()
            PreviewItem()
            //DisplayCard(R.drawable.ic_launcher_foreground, "John Doe", "Softwre=")
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
        //DisplayButton()
        //DisplaySomething()
        //DisplayColumnLayout()
        //DisplayRowLayout()
        //DisplayBoxLayout()
//        Column {
//            DisplayCard(R.drawable.ic_launcher_foreground, "John Doe", "Software Developer")
//            DisplayCard(R.drawable.ic_launcher_foreground, "Dough Zone", "Software Developer")
//            DisplayCard(R.drawable.ic_launcher_foreground, "Sid Munk", "Software Developer")
//            DisplayCard(R.drawable.ic_launcher_foreground, "John Doe", "Software Developer")
//            DisplayCard(R.drawable.ic_launcher_foreground, "Virat kohli", "Software Developer")
//            DisplayCard(R.drawable.ic_launcher_foreground, "Rohit Sharma", "Software Developer")
//
//        }
        //ModifierExamples()
        PreviewItem()
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

    @Composable
    fun DisplaySomething(){
        val state = remember {mutableStateOf("")}
        TextField(
            value = state.value,
            onValueChange = {
                state.value = it
            },
            label = { Text(text = "Type Something") },
            placeholder = {}

        )
    }

@Composable
fun DisplayColumnLayout() {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "A", fontSize = 24.sp)

        Text(text = "B", fontSize = 24.sp)
    }
}

@Composable
fun DisplayRowLayout(){
    Row(
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text("C", fontSize = 24.sp)
        Text("D", fontSize = 24.sp)
    }
}

@Composable
fun DisplayBoxLayout(){
    Image(
        painter = painterResource(R.drawable.ic_launcher_foreground),
        contentDescription = "Dummy"
    )
    Image(
        painter = painterResource(R.drawable.ic_launcher_background),
        contentDescription = "Dummy"
    )

}

@Composable
fun DisplayCard(imageID: Int, name:String, occupation: String){
    //val name = remember { mutableStateOf("") }
    //val profession = remember { mutableStateOf("") }
    Row {
        Image(
            painter = painterResource(R.drawable.ic_launcher_foreground),
            contentDescription = "Guy",
            Modifier.size(40.dp)
        )


        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Text(
                text = name,
                fontWeight = FontWeight.Bold)

            Text(
                text = occupation,
                fontWeight = FontWeight.Thin,
                fontSize = 12.sp)
        }
    }
}

@Composable
fun ModifierExamples(){
    Text(text="Hello",
        color = Color.White,
        modifier = Modifier
            .background(Color.Blue)
            .size(200.dp)
            .border(4.dp, Color.Red)
            .clip(CircleShape)
            .background(Color.Yellow)
            .clickable {  }
            .fillMaxWidth()
        )
}

