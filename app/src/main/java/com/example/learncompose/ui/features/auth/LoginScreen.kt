package com.example.learncompose.ui.features.auth

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.learncompose.ui.theme.LearnComposeTheme
import com.example.learncompose.ui.util.WindowInfo
import com.example.learncompose.ui.util.windowInfoPreview

@Composable
fun LoginScreen(
    modifier: Modifier = Modifier,
    windowInfo: WindowInfo,
    onNavigateToRegister: () -> Unit,
    onLoginSuccess: () -> Unit,
) {
    if (windowInfo.screenWidthInfo is WindowInfo.WindowType.Medium) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            ElevatedButton(onClick = { onLoginSuccess() }) { Text(text = "Login") }
            ElevatedButton(onClick = { onNavigateToRegister() }) { Text(text = "Register") }
        }
    }
}

@Preview
@Composable
fun LoginScreenPreview() {
    LearnComposeTheme {
        LoginScreen(
            windowInfo = windowInfoPreview,
            onNavigateToRegister = {},
            onLoginSuccess = {}
        )
    }
}