package com.example.learncompose.ui.features.auth

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun RegisterScreen(
    modifier: Modifier = Modifier,
    onRegisterSuccess: () -> Unit,
) {

    Box(modifier = Modifier
        .fillMaxSize()
        .background(color = Color.Blue))
}