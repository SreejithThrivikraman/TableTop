package com.example.tabletop.ui.meals

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.example.tabletop.ui.theme.TableTopTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TableTopTheme {
                Greeting()
            }
        }
    }
}

@Composable
fun Greeting(){
    Box(modifier = Modifier.fillMaxSize()) {
            Text(text = "Hello Sreejith !",
                modifier = Modifier.align(Alignment.Center),
                textAlign = TextAlign.Center)
        }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TableTopTheme {
        Greeting()
    }
}