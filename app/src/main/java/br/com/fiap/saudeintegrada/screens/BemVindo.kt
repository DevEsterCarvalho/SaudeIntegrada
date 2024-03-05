package br.com.fiap.saudeintegrada.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.sharp.List
import androidx.compose.material.icons.rounded.AccountCircle
import androidx.compose.material.icons.rounded.CheckCircle
import androidx.compose.material.icons.rounded.Home
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
import androidx.compose.ui.unit.sp
import br.com.fiap.saudeintegrada.R
import br.com.fiap.saudeintegrada.ui.theme.InterBold

@Composable
fun BemVindo() {
    Column (
        verticalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .background(Color(0xffFFFFFF))
            .fillMaxSize()
    )
    {
        Card (
            modifier = Modifier
                .align(Alignment.CenterHorizontally),
        )
        {
            Image(painter = painterResource(id = R.drawable.icone_saude)
                , contentDescription = "ícone do projeto saúde integrada", modifier = Modifier.size(width = 91.dp, height = 91.dp) )
        }
        Column (
                modifier = Modifier
                    .align(Alignment.CenterHorizontally),
        ){
            Text(
                text = "Bem-Vindo  ao\n" +
                        "SAÚDE INTEGRADA",
                color = Color.Black,
                fontSize = 28.sp,
                fontFamily = InterBold
            )
            Text(
                text = "TERCEIRA IDADE",
                color = Color.Black,
                fontSize = 20.sp,
                fontFamily = InterBold
            )
        }

        Column (
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
        )
        {
            Text(
                text = "Toque na tela para continuar",
                color = Color.Black,
                fontSize = 20.sp,
                fontFamily = InterBold
            )
        }

        Row {

        }
        Row {
            Button(onClick = { /*TODO*/ }) {
                Icon(imageVector = Icons.Rounded.Home, contentDescription = "ícone home nav")
            }
            Button(onClick = { /*TODO*/ }) {
                Icon(imageVector = Icons.Rounded.AccountCircle, contentDescription = "ícone usuário nav")
            }
            Button(onClick = { /*TODO*/ }) {
                Icon(imageVector = Icons.Rounded.CheckCircle, contentDescription = "ícone verificado nav")
            }
            Button(onClick = { /*TODO*/ }) {
                Icon(imageVector = Icons.AutoMirrored.Sharp.List, contentDescription = "ícone lista")
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
    ) {
        BemVindo()
    }
}
