package br.com.fiap.saudeintegrada

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.com.fiap.saudeintegrada.screens.BemVindo
import br.com.fiap.saudeintegrada.screens.Conta
import br.com.fiap.saudeintegrada.screens.Direcionamento
import br.com.fiap.saudeintegrada.screens.Login
import br.com.fiap.saudeintegrada.screens.RecuperarConta
import br.com.fiap.saudeintegrada.ui.theme.SaudeIntegradaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SaudeIntegradaTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background)
                {
                     val navController= rememberNavController()
                     NavHost(navController = navController,
                         startDestination = "BemVindo"
                     ){
                         composable(route= "BemVindo") {BemVindo(navController)}
                         composable(route= "Login") {Login(navController) }
                         composable(route= "Conta") { Conta(navController) }
                         composable(route= "RecuperarConta") { RecuperarConta(navController) }
                         composable(route= "Direcionamento") { Direcionamento(navController) }
                     }
                }
            }
        }
    }



}

