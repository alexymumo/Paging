package com.alexmumo.paging.ui.navigation

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.alexmumo.paging.R

sealed class NavigationItem(
    val route: String,
    @DrawableRes val icon: Int?,
    @StringRes val title: Int?
) {
    object Home : NavigationItem("home", R.drawable.ic_home, R.string.home)
}
