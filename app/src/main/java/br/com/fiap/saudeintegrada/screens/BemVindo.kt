package br.com.fiap.saudeintegrada.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.rounded.AccountCircle
import androidx.compose.material.icons.rounded.CheckCircle
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.sharp.List
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.fiap.saudeintegrada.R

@Composable
fun BemVindo (modifier: Modifier = Modifier) {
    Column {
        Card (
            modifier = Modifier
                .align(Alignment.CenterHorizontally),
        )
        {
            Image(painter = painterResource(id = R.drawable.icone_saude)
                , contentDescription = "icone do projeto saúde integrada", modifier = Modifier.size(width = 91.dp, height = 91.dp) )
        }
        Column {
            Text(text = "Bem-Vindo  ao\n" +
                    "SAÚDE INTEGRADA" )
            Text(text = "TERCEIRA IDADE")
        }
        Column {
            Text ("Toque na tela para continuar")
        }
        Row {

        }
        Row {
            Button(onClick = { /*TODO*/ }) {
                Icon(imageVector = Icons.Rounded.Home, contentDescription = "icone home nav")
            }
            Button(onClick = { /*TODO*/ }) {
                Icon(imageVector = Icons.Rounded.AccountCircle, contentDescription = "icone usuario nav")
            }
            Button(onClick = { /*TODO*/ }) {
                Icon(imageVector = Icons.Rounded.CheckCircle, contentDescription = "icone verificado nav")
            }
            Button(onClick = { /*TODO*/ }) {
                Icon(imageVector = Icons.Sharp.List, contentDescription = "icone list")
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun BemVindoPreview() {
    Surface (
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFFFFFF))
    ) {
        BemVindo()
    }
}
