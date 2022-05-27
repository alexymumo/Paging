package com.alexmumo.paging.ui.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import com.alexmumo.paging.ui.theme.PagingTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PagingTheme {
                MovieCard()
            }
        }
    }
}

@Composable
fun MovieCard() {
    Text(text = "Alex Mumo")
}
