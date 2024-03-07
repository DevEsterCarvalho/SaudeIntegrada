package br.com.fiap.saudeintegrada.screens

import androidx.compose.foundation.BorderStroke
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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.sharp.List
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.rounded.AccountCircle
import androidx.compose.material.icons.rounded.CheckCircle
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
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
fun Login () {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xffFFFFFF)),
        contentAlignment = Alignment.Center
    ) {
        Column (
            modifier = Modifier
                .align(Alignment.TopStart)
                .padding(start = 0.dp, top = 60.dp)
        ) {
            Column (
                modifier = Modifier
                    .align(Alignment.CenterHorizontally),
            )
            {
                Text(
                    text = "SAÚDE INTEGRADA",
                    color = Color.Black,
                    fontSize = 28.sp,
                    fontFamily = InterBold,
                    textAlign = TextAlign.Center,
                        modifier = Modifier
                        .fillMaxWidth())
                Text(
                    text = "TERCEIRA IDADE",
                    color = Color.Black,
                    fontSize = 20.sp,
                    fontFamily = InterBold,
                    textAlign = TextAlign.Center,
                            modifier = Modifier
                            .fillMaxWidth())
                Spacer(modifier = Modifier.height(20.dp))
                Card (
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)

                )
                {
                    Image(painter = painterResource(id = R.drawable.icone_saude)
                        , contentDescription = "ícone do projeto saúde integrada",
                        modifier = Modifier
                            .size(width = 49.dp, height = 49.dp)
                            .fillMaxWidth(),
                        contentScale = ContentScale.Fit)
                }
            }
            Spacer(modifier = Modifier.height(15.dp))
            Column (
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .fillMaxWidth()
                    .padding(20.dp)
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.fillMaxWidth()
                ){
                        OutlinedTextField(value= "", onValueChange = {},
                            shape = RoundedCornerShape(10.dp),
                            modifier = Modifier
                                .width(317.5.dp)
                                .height(43.6.dp),
                            label = {
                                Text (text = "Preencha seu E-mail",
                                    color = Color.LightGray,
                                    fontSize = 16.sp,
                                    fontFamily = InterRegular)
                            },
                            placeholder = {
                                Text (text = "Digite o seu e-mail: ",
                                    color = Color.LightGray,
                                    fontSize = 16.sp,
                                    fontFamily = InterRegular)
                            }
                        )
                        Text (text= "Esqueceu seu E-mail?",
                            color = (Color(0xff5861E2)),
                            fontSize = 16.sp,
                            fontFamily = InterRegular,
                            textAlign = TextAlign.End,
                            modifier = Modifier
                                .padding(top = 10.dp, end = 15.dp)
                                .fillMaxWidth()
                        )
                    Spacer(modifier = Modifier.height(15.dp))
                        OutlinedTextField(value = "", onValueChange = {},
                            shape = RoundedCornerShape(10.dp),
                            modifier = Modifier
                                .width(317.5.dp)
                                .height(43.6.dp),
                            label = {
                                Text (text = "Preencha sua senha",
                                    color = Color.LightGray,
                                    fontSize = 16.sp,
                                    fontFamily = InterRegular)
                            },
                            placeholder = {
                                Text (text = "Digite a sua senha: ",
                                    color = Color.LightGray,
                                    fontSize = 16.sp,
                                    fontFamily = InterRegular)
                            }
                        )
                        Text (text= "Esqueceu sua senha?",
                            color = (Color(0xff5861E2)),
                            fontSize = 16.sp,
                            fontFamily = InterRegular,
                            textAlign = TextAlign.End,
                                modifier = Modifier
                                    .padding(top = 10.dp, end = 15.dp)
                                    .fillMaxWidth()
                        )
                    Spacer(modifier = Modifier.height(20.dp))
                        Button(onClick = {},
                            colors = ButtonDefaults.buttonColors(Color(0xff5861E2)),
                            shape = RoundedCornerShape(6.dp),
                            contentPadding = PaddingValues(5.dp),
                            modifier = Modifier
                                .width(309.dp),
                        ){
                            Text(text= "Entrar",
                                color = (Color.White),
                                fontSize = 16.sp,
                                fontFamily = InterBold,
                                textAlign = TextAlign.Center,)
                        }
                    Row (
                        Modifier
                            .align(Alignment.CenterHorizontally)
                    ) {
                        Text(text= "Ou entre com",
                            color = (Color(0xff161616)),
                            fontSize = 16.sp,
                            fontFamily = InterRegular,
                            textAlign = TextAlign.Center,
                            modifier = Modifier
                                .padding (top= 10.dp))
                    }
                }
            }
            Row (
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
            ){
                Button(onClick = {},
                    border = BorderStroke(1.dp, (Color(0xff5861E2))),
                    colors = ButtonDefaults.buttonColors(Color.White),
                    modifier = Modifier
                        .width(142.dp)
                        .height(45.dp)
                        .padding(end = 10.dp),
                    shape = RoundedCornerShape(6.dp),
                    contentPadding = PaddingValues(5.dp)
                ){
                    Image(
                        painter = painterResource(id = R.drawable.google),
                        contentDescription = "ícone google",
                        modifier = Modifier
                            .size(width = 26.dp, height = 26.5.dp)
                            .clip(RoundedCornerShape(15.dp))
                    )
                    Text(text = "Google",
                        color = (Color(0xff5861E2)),
                        fontSize = 16.sp,
                        fontFamily = InterBold,
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .padding (start= 10.dp))
                    }
                    Button(onClick = {},
                        colors = ButtonDefaults.buttonColors(Color(0xff5861E2)),
                        modifier = Modifier
                            .width(142.dp)
                            .height(45.dp),
                        shape = RoundedCornerShape(6.dp),
                        contentPadding = PaddingValues(5.dp)) {
                        Image(
                            painter = painterResource(id = R.drawable.facebook),
                            contentDescription = "ícone facebook",
                            modifier = Modifier.size(width = 26.dp, height = 26.5.dp)
                                .clip(RoundedCornerShape(15.dp))
                        )
                        Text(text = "Facebook",
                            color = (Color.White),
                            fontSize = 16.sp,
                            fontFamily = InterBold,
                            textAlign = TextAlign.Center,
                            modifier = Modifier
                                .padding (start= 10.dp))
                    }
            }
            Spacer(modifier = Modifier.height(30.dp))
            Column (modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .fillMaxWidth()

            ) {
                Row (
                    modifier= Modifier
                        .align(Alignment.CenterHorizontally),
                ){
                    Text(text = "Não tem uma conta? ",
                        color = (Color(0xff161616)),
                        fontSize = 16.sp,
                        fontFamily = InterRegular,
                        textAlign = TextAlign.Center)
                    Text(text = "Registre",
                        color = (Color(0xff5861E2)),
                        fontSize = 16.sp,
                        fontFamily = InterBold,
                        textAlign = TextAlign.Center)
                }
                Row (
                    modifier= Modifier
                        .padding(top = 7.dp)
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
fun LoginPreview() {
    Surface (
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Login()
    }
}