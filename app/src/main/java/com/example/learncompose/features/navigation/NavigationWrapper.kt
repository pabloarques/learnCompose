package com.example.learncompose.features.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.example.learncompose.features.navigation.graphs.authNavGraph
import com.example.learncompose.features.navigation.graphs.mainNavGraph

@Composable
fun NavigationWrapper(isLoggin: Boolean) {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = if (isLoggin) GraphRoutes.MainGraph.route else GraphRoutes.AuthGraph.route
    ) {
        authNavGraph(navController)
        mainNavGraph(navController)
    }
}