package com.example.learncompose.ui.navigation.graphs

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.learncompose.ui.features.auth.LoginScreen
import com.example.learncompose.ui.features.auth.RegisterScreen
import com.example.learncompose.ui.navigation.AuthRoutes
import com.example.learncompose.ui.navigation.GraphRoutes

fun NavGraphBuilder.authNavGraph(navController: NavHostController) {
    navigation(startDestination = AuthRoutes.Login.route, route = GraphRoutes.AuthGraph.route) {
        composable(AuthRoutes.Login.route) {
            LoginScreen(
                onNavigateToRegister = { navController.navigate(AuthRoutes.Register.route) },

                onLoginSuccess = {
                    navController.navigate(GraphRoutes.MainGraph.route) {
                        popUpTo(GraphRoutes.AuthGraph.route) {
                            inclusive = true
                        }
                    }
                }
            )
        }

        composable(AuthRoutes.Register.route) {
            RegisterScreen(
                onRegisterSuccess = {
                    navController.navigate(GraphRoutes.MainGraph.route) {
                        popUpTo(GraphRoutes.AuthGraph.route) {
                            inclusive = true
                        }
                    }
                }
            )
        }
    }
}
