package com.senai.carteirinha_senai.core.designsystem.navigation

sealed class Routes(val route: String) {
    data object Login : Routes("login")
    data object Home : Routes("home")

    data object Carteirinha : Routes("carteirinha")
}