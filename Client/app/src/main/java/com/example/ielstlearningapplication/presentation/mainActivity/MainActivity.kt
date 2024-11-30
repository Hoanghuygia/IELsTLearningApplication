package com.example.ielstlearningapplication.presentation.mainActivity

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.example.ielstlearningapplication.presentation.navGraph.NavGraph
import com.example.ielstlearningapplication.ui.theme.IELsTLearningApplicationTheme

class MainActivity : ComponentActivity() {
    private val viewModel by viewModels<MainViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen().apply {
            setKeepOnScreenCondition(condition = {viewModel.splashCondition.value})
        }
        setContent {
            IELsTLearningApplicationTheme {
                Box(modifier = Modifier.background(MaterialTheme.colorScheme.background)){
                    NavGraph(startDestination = viewModel.startDestination.value)
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Preview(uiMode = UI_MODE_NIGHT_YES, showBackground= true)
@Composable
fun Preview() {
}