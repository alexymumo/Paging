package com.alexmumo.paging.ui.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import com.alexmumo.paging.ui.screens.main.MainScreen
import com.alexmumo.paging.ui.theme.PagingTheme

@ExperimentalFoundationApi
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PagingTheme {
                MainScreen()
            }
        }
    }
}
