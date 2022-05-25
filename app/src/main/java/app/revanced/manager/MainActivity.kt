package app.revanced.manager

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import app.revanced.manager.backend.utils.AndroidAaptProvider
import app.revanced.manager.ui.screens.MainScreen
import app.revanced.manager.ui.theme.ReVancedManagerTheme
import brut.androlib.res.AndrolibResources

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AndrolibResources.setAaptProvider(AndroidAaptProvider(applicationContext))
        setContent {
            ReVancedManagerTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MainScreen()
                }
            }
        }
    }
}

@Preview
@Composable
fun FullPreview() {
    ReVancedManagerTheme {
        MainScreen()
    }
}