package com.example.mylocalplaces

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.mylocalplaces.data.Categories
import com.example.mylocalplaces.ui.theme.MyLocalPlacesTheme
import com.example.mylocalplaces.uii.CategoryScreen


enum class MyLocalPlacesScreen (){
    Start,
    Places,
    Info
}

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyLocalPlacesTheme {
                CategoryScreen(
                    items = Categories.categories,
                    title = "Pohui"
                )
            }
        }
    }
}

@Composable
fun MyLocalPlacesApp (
    navController: NavHostController = rememberNavController()
){
    val backStackEntry by navController.currentBackStackEntryAsState()

    NavHost(
        navController = navController,
        startDestination = MyLocalPlacesScreen.Start.name
    ){
        composable (route = MyLocalPlacesScreen.Start.name) {

        }
    }
}