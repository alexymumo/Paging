package com.alexmumo.paging.ui.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import com.alexmumo.paging.ui.screens.home.HomeScreen
import com.alexmumo.paging.ui.theme.PagingTheme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalFoundationApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PagingTheme {
                HomeScreen()
            }
        }
    }
}

@Composable
fun MovieCard() {
    Text(text = "Alex Mumo")
}
