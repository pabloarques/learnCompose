package com.example.learncompose.features.auth

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun LoginScreen(
    modifier: Modifier = Modifier,
    onNavigateToRegister: () -> Unit,
    onLoginSuccess: () -> Unit,
) {
    Box(modifier = Modifier
        .fillMaxSize()
        .background(color = Color.Green))

}