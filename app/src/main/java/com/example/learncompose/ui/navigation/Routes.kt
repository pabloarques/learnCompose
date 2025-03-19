package com.example.learncompose.ui.navigation

enum class GraphRoutes(val route: String) {
    AuthGraph("auth_graph"),
    MainGraph("main_graph")
}

sealed class AuthRoutes(val route: String) {
    data object Login : AuthRoutes(route = "login")
    data object Register : AuthRoutes(route = "create_user")
}

sealed class MainRoutes(val route: String) {
    data object Home : MainRoutes(route = "home")
}