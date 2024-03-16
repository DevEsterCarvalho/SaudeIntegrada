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
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.rounded.AccountCircle
import androidx.compose.material.icons.rounded.CheckCircle
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
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
fun RecuperarConta () {
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
                        .align(Alignment.CenterHorizontally),
                    colors = CardDefaults.cardColors(containerColor = Color.White)
                )
                {
                    Image(painter = painterResource(id = R.drawable.logo_saude)
                        , contentDescription = "ícone do projeto saúde integrada",
                        modifier = Modifier
                            .size(width = 49.dp, height = 49.dp)
                            .fillMaxWidth(),
                        contentScale = ContentScale.Fit)
                }
            }

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
                    Text(text = "Recuperar Conta",
                        color = (Color(0xff5861E2)),
                        fontSize = 30.sp,
                        fontFamily = InterBold,
                        textAlign = TextAlign.Center
                    )

                    Spacer(modifier = Modifier.height(24.dp))

                    Text(text = "Use seu e-mail ou telefone",
                        color = (Color(0xff5861E2)),
                        fontSize = 14.sp,
                        fontFamily = InterBold,
                        textAlign = TextAlign.Center
                    )

                    Spacer(modifier = Modifier.height(36.dp))

                    OutlinedTextField(value= "", onValueChange = {},
                        shape = RoundedCornerShape(10.dp),
                        modifier = Modifier
                            .width(317.5.dp)
                            .height(43.6.dp),
                        label = {
                            Text (text = "E-mail",
                                color = Color.LightGray,
                                fontSize = 16.sp,
                                fontFamily = InterRegular)
                        },
                        placeholder = {
                            Text (text = "E-mail: ",
                                color = Color.LightGray,
                                fontSize = 16.sp,
                                fontFamily = InterRegular)
                        }
                    )
                    Spacer(modifier = Modifier.height(24.dp))
                    Row (
                        Modifier
                            .align(Alignment.CenterHorizontally)
                    ) {
                        Text(text= "OU",
                            color = (Color(0xff5861E2)),
                            fontSize = 16.sp,
                            fontFamily = InterBold,
                            textAlign = TextAlign.Center)
                    }
                    Spacer(modifier = Modifier.height(24.dp))
                    OutlinedTextField(
                        value = "",
                        onValueChange = {},
                        shape = RoundedCornerShape(10.dp),
                        colors = OutlinedTextFieldDefaults.colors (focusedBorderColor = (Color(0xff454B60))),
                        modifier = Modifier
                            .width(317.5.dp)
                            .height(43.6.dp),
                        leadingIcon = {
                            Icon(imageVector = Icons.Filled.ArrowDropDown, contentDescription = "ícone seta selecionar")
                        },
                        label = {
                            Text (text = "Número de Celular",
                                color = Color.LightGray,
                                fontSize = 16.sp,
                                fontFamily = InterRegular)
                        },
                        placeholder = {
                            Text (text = "Digite o seu número de celular: ",
                                color = Color.LightGray,
                                fontSize = 16.sp,
                                fontFamily = InterRegular)
                        }
                    )
                    Spacer(modifier = Modifier.height(36.dp))
                }
            }
            Row (
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
            ){
                Button(onClick = {},
                    colors = ButtonDefaults.buttonColors(Color(0xff5861E2)),
                    modifier = Modifier
                        .width(142.dp)
                        .height(45.dp),
                    shape = RoundedCornerShape(6.dp),
                    contentPadding = PaddingValues(5.dp))
                {
                    Text(text = "Enviar",
                        color = (Color.White),
                        fontSize = 16.sp,
                        fontFamily = InterBold,
                        textAlign = TextAlign.Center
                    )
                }
                Spacer(modifier = Modifier.width(16.dp))
                Button(onClick = {},
                    border = BorderStroke(1.dp, (Color(0xff5861E2))),
                    colors = ButtonDefaults.buttonColors(Color.White),
                    modifier = Modifier
                        .width(142.dp)
                        .height(45.dp),
                    shape = RoundedCornerShape(6.dp),

                ){
                   Text(text = "Cancelar",
                        color = (Color(0xff5861E2)),
                        fontSize = 16.sp,
                        fontFamily = InterBold,
                        textAlign = TextAlign.Center
                   )
                }
            }
            Spacer(modifier = Modifier.height(36.dp))
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
fun RecuperarContaPreview() {
    Surface (
        modifier = Modifier
            .fillMaxWidth()
    ) {
        RecuperarConta()
    }
}