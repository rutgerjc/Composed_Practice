package com.runitrut.composedpractice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.runitrut.composedpractice.ui.theme.ComposedPracticeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposedPracticeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}
/*
 Intro into learn Jetpack Composed
 Exp of how to modify Text() with Color, FrontSize, Use of modifier and how
 to change is back and padding...

    modifier = Modifier
           .background(Color.Red)
           .padding(20.dp)
           .background(Color.Green)
* */
//@Composable
//fun Greeting(name: String) {
//    Text(
//        text = "Hello $name!",
//        color = Color.Blue,
//        fontSize = 30.sp,
//        modifier = Modifier
//            .background(Color.Red)
//            .padding(20.dp)
//            .background(Color.Green)
//    )
//}

@Composable
fun Greeting(name: String) {
    /* Set the parent View such as, ConstraintView, Relative layout, Column layout, etc */
//    Column(
//        //modifier = Modifier.background(Color.Red)
//        horizontalAlignment = Alignment.CenterHorizontally,
//        verticalArrangement = Arrangement.Center,
//        modifier = Modifier
//            //.fillMaxWidth()
//            .size(400.dp)
//    )

//    Box(
//        modifier = Modifier
//            .size(400.dp),
//    )
//    {
//        Text(
//            text = "Hello $name!",
//            color = Color.Blue,
//            fontSize = 30.sp,
//            modifier = Modifier.align(Alignment.BottomEnd)
//        )
//        Text(
//            text = "SomeOther text!",
//            color = Color.Blue,
//            fontSize = 30.sp,
//        )
//    }
    /* Use " Image to use Images */
//    Image(
//        painter = painterResource(id = R.drawable.ic_launcher_foreground),
//        contentDescription = null,
//        modifier = Modifier.background(Color.Black)
//    )
    /* Use "Icon" to use Icons */
//    Icon(
//        imageVector = Icons.Default.Add,
//        contentDescription = null
//    )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposedPracticeTheme {
        Greeting("Rutger")
    }
}