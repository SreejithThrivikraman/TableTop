package com.example.tabletop

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.tabletop.ui.theme.TableTopTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TableTopTheme {

            }
        }
    }
}

@Composable
fun Greeting(){
   Text(text = "Hello Sreejith !")
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TableTopTheme {
        Greeting()
    }
}