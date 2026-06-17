package com.senai.carteirinha_senai.core.designsystem.navigation

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

import com.senai.carteirinha_senai.feature.auth.presentation.screen.LoginScreen
import com.senai.carteirinha_senai.feature.carteirinha.presentation.screen.CarteirinhaScreen
import com.senai.carteirinha_senai.feature.home.presentation.screen.HomeScreen
import com.senai.carteirinha_senai.feature.unidade_curricular.presentation.screen.UnidadeCurricularScreen
import java.util.Collections.emptyList

@Composable
fun AppNavHost(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = Routes.Login.route
    ) {
        composable(Routes.Login.route) {
            LoginScreen(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp),
                navController = navController
            )
        }

        composable(Routes.Home.route) {
            HomeScreen(
                usuarioNome = "Gabriel",
                usuarioDescricao = "Desenvolvimento de Sistemas",
                drawerItems = emptyList(),
                onLogoutClick = {
                    navController.navigate(Routes.Login.route) {
                        popUpTo(Routes.Home.route) { inclusive = true }
                    }
                },
                onCarteirinhaClick = {
                    navController.navigate(Routes.Carteirinha.route)
                },
                onUnidadesCurricularesClick = {
                    navController.navigate(Routes.UnidadesCurriculares.route)
                }
            )
        }

        composable(Routes.Carteirinha.route) {
            CarteirinhaScreen(
                modifier = Modifier.fillMaxSize()
            )
        }

        composable(Routes.UnidadesCurriculares.route) {
            UnidadeCurricularScreen(
                usuarioNome = "Gabriel",
                usuarioDescricao = "Desenvolvimento de Sistemas",
                drawerItems = emptyList(),
                onLogoutClick = {
                    navController.navigate(Routes.Login.route) {
                        popUpTo(Routes.Home.route) { inclusive = true }
                    }
                },
                modifier = Modifier.fillMaxSize(),
                onBackClick = {
                    navController.popBackStack()
                }
            )
        }
    }
}