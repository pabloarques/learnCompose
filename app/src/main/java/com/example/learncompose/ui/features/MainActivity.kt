package com.example.learncompose.ui.features

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.example.learncompose.ui.navigation.NavigationWrapper
import com.example.learncompose.ui.theme.LearnComposeTheme
import com.example.learncompose.ui.util.rememberWindowInfo
import com.example.learncompose.ui.util.windowInfoPreview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        installSplashScreen()

        setContent {
            LearnComposeTheme {
                val isLoggin = false
                val windowInfo = rememberWindowInfo()
                NavigationWrapper(isLoggin, windowInfo)
            }
        }
    }
}

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun ActivityPreview() {
    LearnComposeTheme {
        NavigationWrapper(isLoggin = false, windowInfo = windowInfoPreview)
    }
}