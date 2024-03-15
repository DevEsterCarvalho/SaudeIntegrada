package br.com.fiap.saudeintegrada.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.sharp.List
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.rounded.AccountCircle
import androidx.compose.material.icons.rounded.CheckCircle
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.fiap.saudeintegrada.R
import br.com.fiap.saudeintegrada.ui.theme.InterBold
import br.com.fiap.saudeintegrada.ui.theme.InterRegular


@Composable
fun Direcionamento () {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xffFFFFFF)),
        contentAlignment = Alignment.Center
    ) {
        Column (
            modifier = Modifier
                .align(Alignment.TopStart)
                .padding(start = 0.dp, top = 150.dp)
        ) {
            Column (
                modifier = Modifier
                    .align(Alignment.CenterHorizontally),
            )
            {
                Text(
                    text = "Obrigado\nVocê será redirecionado\nem segundos...",
                    color = Color.Black,
                    fontSize = 20.sp,
                    fontFamily = InterRegular,
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .fillMaxWidth()
                )
                Spacer(modifier = Modifier.height(48.dp))
                Card (
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally),
                    colors = CardDefaults.cardColors(containerColor = Color.White)
                )
                {
                    Image(painter = painterResource(id = R.drawable.logo_saude)
                        , contentDescription = "ícone do projeto saúde integrada",
                        modifier = Modifier
                            .size(width = 120.dp, height = 120.dp)
                            .fillMaxWidth(),
                        contentScale = ContentScale.Fit)
                }
            }
            Spacer(modifier = Modifier.height(50.dp))
            Column (modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .fillMaxWidth()
            ) {
            Row(
                modifier = Modifier
                    .padding(start = 28.dp)
                    .align(Alignment.CenterHorizontally)
                    
                ) {
                    Text(
                        text = "Clique aqui!",
                        color = (Color(0xff5861E2)),
                        fontSize = 16.sp,
                        fontFamily = InterBold,
                        textAlign = TextAlign.Center
                    )
                    Text(
                        text = " Se você não for redirecionado corretamente",
                        color = (Color(0xff161616)),
                        fontSize = 16.sp,
                        fontFamily = InterRegular,
                        textAlign = TextAlign.Start

                    )
                }
            }

            Spacer(modifier = Modifier.height(100.dp))
            Column (modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .fillMaxWidth()
            ) {
                Row (
                    modifier= Modifier
                        .padding(top = 12.dp)
                        .align(Alignment.CenterHorizontally),
                ){
                    Text(text = "Precisa de ajuda? ",
                        color = (Color(0xff161616)),
                        fontSize = 16.sp,
                        fontFamily = InterRegular,
                        textAlign = TextAlign.Center)
                    Text(text = "Centro de Ajuda",
                        color = (Color(0xff5861E2)),
                        fontSize = 16.sp,
                        fontFamily = InterBold,
                        textAlign = TextAlign.Center)
                }
            }
        }
        Box (
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(bottom = 15.dp, top = 16.dp)
                .background(Color.White, shape = RoundedCornerShape(8.dp))
                .border(1.dp, Color(0xffF2F2F7), shape = RoundedCornerShape(8.dp)),
        ){
            Row (
                modifier = Modifier
                    .padding(10.dp)
            ){
                Button(
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(Color(0xff5861E2)),
                    shape = RoundedCornerShape(6.dp),
                    contentPadding = PaddingValues(5.dp),
                    modifier = Modifier
                        .size(48.dp)
                        .shadow(10.dp, shape = RoundedCornerShape(4.dp), clip = true)

                ) {
                    Icon(imageVector = Icons.Default.Home, contentDescription = "ícone home nav")
                }
                Button(
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(Color.White),
                ) {
                    Icon(imageVector = Icons.Rounded.AccountCircle, contentDescription = "ícone usuário nav", tint = Color.LightGray)
                }
                Button(
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(Color.White),
                ) {
                    Icon(imageVector = Icons.Rounded.CheckCircle, contentDescription = "ícone verificado nav", tint = Color.LightGray)
                }
                Button(
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(Color.White),
                ) {
                    Icon(imageVector = Icons.AutoMirrored.Sharp.List, contentDescription = "ícone lista", tint = Color.LightGray)
                }
            }
        }
    }
}
@Preview(showSystemUi = true)
@Composable
fun DirecionamentoPreview() {
    Surface (
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Direcionamento()
    }
}