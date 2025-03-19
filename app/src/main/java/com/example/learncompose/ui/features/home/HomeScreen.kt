package com.example.learncompose.ui.features.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    Box(modifier = Modifier.fillMaxSize().background(color = Color.Red))
}