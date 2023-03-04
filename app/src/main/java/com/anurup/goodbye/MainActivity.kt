package com.anurup.goodbye

import android.annotation.SuppressLint

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.anurup.goodbye.ui.theme.GoodByeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GoodByeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Navigation()
                }
            }
        }
    }
}

@SuppressLint("InlinedApi")
@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "gift") {
        composable("gift"){
            Gift(navController = navController)
        }
        composable("main"){
            Greeting(text = "Thank you for bearing us for 10 days." +
                            "We are really impressed with your training. The way of making us clap our hand made you a unique trainer." +
                            "You shake your head like a Tanjavur doll\uD83E\uDD29")
        }
    }
}
