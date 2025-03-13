package com.example.learncompose.features.navigation.graphs

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.learncompose.features.home.HomeScreen
import com.example.learncompose.features.navigation.GraphRoutes
import com.example.learncompose.features.navigation.MainRoutes

fun NavGraphBuilder.mainNavGraph(navController: NavHostController) {
    navigation(startDestination = MainRoutes.Home.route, route = GraphRoutes.MainGraph.route) {
        composable(MainRoutes.Home.route) {
            HomeScreen()
        }
    }
}
