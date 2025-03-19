package com.example.learncompose.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.example.learncompose.ui.navigation.graphs.authNavGraph
import com.example.learncompose.ui.navigation.graphs.mainNavGraph
import com.example.learncompose.ui.util.WindowInfo

@Composable
fun NavigationWrapper(isLoggin: Boolean, windowInfo: WindowInfo) {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = if (isLoggin) GraphRoutes.MainGraph.route else GraphRoutes.AuthGraph.route
    ) {
        authNavGraph(navController, windowInfo)
        mainNavGraph(navController, windowInfo)
    }
}