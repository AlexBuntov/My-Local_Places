package com.example.mylocalplaces

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.mylocalplaces.data.Categories
import com.example.mylocalplaces.data.Places
import com.example.mylocalplaces.ui.theme.MyLocalPlacesTheme
import com.example.mylocalplaces.uii.CategoryScreen
import com.example.mylocalplaces.uii.PlaceScreen


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
                    items = Categories.categories
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