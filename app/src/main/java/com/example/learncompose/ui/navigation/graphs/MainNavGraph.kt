package com.example.learncompose.ui.navigation.graphs

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.learncompose.ui.features.home.HomeScreen
import com.example.learncompose.ui.navigation.GraphRoutes
import com.example.learncompose.ui.navigation.MainRoutes

fun NavGraphBuilder.mainNavGraph(navController: NavHostController) {
    navigation(startDestination = MainRoutes.Home.route, route = GraphRoutes.MainGraph.route) {
        composable(MainRoutes.Home.route) {
            HomeScreen()
        }
    }
}
