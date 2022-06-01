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
    object Details : NavigationItem("details{movieId}", null, R.string.home)
}

/*
* Koin - is a pragmatic and lightweight dependency injection framework for kt developers
* Is a DSL, a light container and a pragmatic API
* Application DSL - to describe the koin container configuration
* Module DSL - describe the components that have to be injected
*
* Application DSL
* A KoinApplication instance is a Koin container instance configuration
* koinApplication {} - create a KoinApplication container configuration
* startKoin{} - create a KoinApplication container configuration and register it to GlobalContext
* To configure KoinApplication instance use the following functions:
* logger() - describe what level ad Logger implementation
* modules() - set list of Koin modules to load in the container
* properties() - load HashMap properties into Koin containers
*
* KoinApplication instance: Global vs Local
* >koinApplication - describe a koin container instance
* >startKoin - describe a koin container instance and register it in koin GlobalContext
*
* Starting Koin
*-Starting Koin means run a KotlinApplication instance into the Global context
*
* Module DSL
* -Koin module gather definitions that will inject combine for your application
* module{} - create a koin module
* -To describe your content in a module you can use the following functions
* factory{} - provide a factory bean definition
* single{} - provide a singleton bean definition
* get() - resolve a component dependency
* bind() - add types array for given bean definition
*
* Writing a module
* -A koin module is the space to declare all your components,
*
* Injecting Android ViewModel
* -viewModel DSL keyword comes in complement of single and factory to
*  help declare a ViewModel component and bind it to an Android Component lifecycle
* */
