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
import androidx.compose.material3.OutlinedTextField
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
fun Conta () {
    Column (
        verticalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xffFFFFFF)),
    )
    {
        Column (
            modifier = Modifier
                .align(Alignment.CenterHorizontally),
        )
        {
            Text(text = "SAÚDE INTEGRADA" )
            Text(text = "TERCEIRA IDADE")
        }
        Card (
            modifier = Modifier
                .align(Alignment.CenterHorizontally),
        )
        {
            Image(painter = painterResource(id = R.drawable.icone_saude)
                , contentDescription = "ícone do projeto saúde integrada", modifier = Modifier.size(width = 49.dp, height = 49.dp) )
        }
        Row (
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Text(text = "Preencha seus dados para criar a conta")
        }
        Column (
            modifier = Modifier
                .fillMaxWidth()
        ) {
            OutlinedTextField(value = "", onValueChange = {})
            OutlinedTextField(value = "", onValueChange = {})
            OutlinedTextField(value = "", onValueChange = {})
            OutlinedTextField(value = "", onValueChange = {})
            OutlinedTextField(value = "", onValueChange = {})
        }
        Column {
            Text(text = "Eu concordo com os termos e condições")
            Text(text = "Termos e Condições")
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Enviar")
            }
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
fun ContaPreview() {
    Surface (
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Conta()
    }
}