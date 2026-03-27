package com.senai.carteirinha_senai.app

import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.example.compose.CarteirinhaSenaiTheme
import com.senai.carteirinha_senai.core.designsystem.navigation.AppNavHost

@Composable
fun App() {
    CarteirinhaSenaiTheme() {
        val navController = rememberNavController()
        AppNavHost(
            navController = navController,
        )
    }
}