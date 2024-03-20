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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.sharp.List
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.rounded.AccountCircle
import androidx.compose.material.icons.rounded.CheckCircle
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.fiap.saudeintegrada.R
import br.com.fiap.saudeintegrada.model.Endereco
import br.com.fiap.saudeintegrada.service.RetrofitFactory
import br.com.fiap.saudeintegrada.ui.theme.InterBold
import br.com.fiap.saudeintegrada.ui.theme.InterRegular
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

@Composable
fun CadastroEndereco () {

    var cepState by remember { mutableStateOf("") }
    var ufState by remember { mutableStateOf("") }
    var cidadeState by remember { mutableStateOf("") }
    var ruaState by remember { mutableStateOf("") }
    var complementoState by remember { mutableStateOf("") }

    var enderecoCadastrado by remember{
        mutableStateOf(Endereco())
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xffFFFFFF)),
        contentAlignment = Alignment.Center
    ){
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
            Spacer(modifier = Modifier.height(15.dp))
            Column (
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.fillMaxWidth()
            ){
                Row (
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                ) {
                    Text(text = "Cadastre seu endereço residencial",
                        color = (Color(0xff5861E2)),
                        fontSize = 18.sp,
                        fontFamily = InterBold,
                        textAlign = TextAlign.Center)
                }
            }
            Spacer(modifier = Modifier.height(5.dp))

            Column (
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .fillMaxWidth()
                    .padding(20.dp)
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .fillMaxWidth()
                ){
                    OutlinedTextField(
                        value = cepState,
                        onValueChange = {
                            cepState = it
                        },
                        shape = RoundedCornerShape(10.dp),
                        colors = OutlinedTextFieldDefaults.colors (focusedBorderColor = (Color(0xff454B60))),
                        modifier = Modifier
                            .width(317.5.dp)
                            .height(50.dp),
                        placeholder = {
                            Text (text = "Digite o seu CEP",
                                color = Color.DarkGray,
                                fontSize = 16.sp,
                                fontFamily = InterRegular)
                        },
                        trailingIcon = {
                            IconButton(
                                onClick = {
                                    val call = RetrofitFactory().getCepService().getEndereco(cepState)
                                    call.enqueue(object : Callback<Endereco> {
                                        override fun onResponse(
                                            call: Call<Endereco>,
                                            response: Response<Endereco>
                                        ) {
                                            enderecoCadastrado = response.body()!!
                                        }
                                        override fun onFailure(call: Call<Endereco>, t: Throwable) {
                                            android.util.Log.e("error", "onFailure: ${t.message}")
                                        }
                                    })

                                }
                            ) {
                                Icon(
                                    imageVector = Icons.Default.Search,
                                    contentDescription = ""
                                )
                            }
                        },
                        keyboardOptions = KeyboardOptions(
                            keyboardType = KeyboardType.Number
                        )
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                    OutlinedTextField(value = enderecoCadastrado.uf,
                        onValueChange = {
                            ufState = it
                        },
                        shape = RoundedCornerShape(10.dp),
                        colors = OutlinedTextFieldDefaults.colors (focusedBorderColor = (Color(0xff454B60))),
                        modifier = Modifier
                            .width(317.5.dp)
                            .height(50.dp),
                        placeholder = {
                            Text (text = "Estado ",
                                color = Color.DarkGray,
                                fontSize = 16.sp,
                                fontFamily = InterRegular)
                        })
                    Spacer(modifier = Modifier.height(16.dp))
                    OutlinedTextField(
                        value = enderecoCadastrado.cidade,
                        onValueChange = {
                            cidadeState = it
                        },
                        shape = RoundedCornerShape(10.dp),
                        colors = OutlinedTextFieldDefaults.colors (focusedBorderColor = (Color(0xff454B60))),
                        modifier = Modifier
                            .width(317.5.dp)
                            .height(50.dp),
                        placeholder = {
                            Text (text = "Cidade ",
                                color = Color.DarkGray,
                                fontSize = 16.sp,
                                fontFamily = InterRegular)
                        })
                    Spacer(modifier = Modifier.height(16.dp))
                    OutlinedTextField(
                        value = enderecoCadastrado.rua,
                        onValueChange = {
                            ruaState = it
                        },
                        shape = RoundedCornerShape(10.dp),
                        colors = OutlinedTextFieldDefaults.colors (focusedBorderColor = (Color(0xff454B60))),
                        modifier = Modifier
                            .width(317.5.dp)
                            .height(60.dp),
                        placeholder = {
                            Text (text = "Rua",
                                color = Color.DarkGray,
                                fontSize = 16.sp,
                                fontFamily = InterRegular)
                        })
                    Spacer(modifier = Modifier.height(16.dp))
                    OutlinedTextField(
                        value = complementoState,
                        onValueChange = {
                            complementoState = it
                        },
                        shape = RoundedCornerShape(10.dp),
                        colors = OutlinedTextFieldDefaults.colors (focusedBorderColor = (Color(0xff454B60))),
                        modifier = Modifier
                            .width(317.5.dp)
                            .height(60.dp),
                        placeholder = {
                            Text (text = "Complemento",
                                color = Color.DarkGray,
                                fontSize = 16.sp,
                                fontFamily = InterRegular)
                        })
                }

                Spacer(modifier = Modifier.height(50.dp))

                Row (
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                ){
                    Button(
                        onClick = {},
                        colors = ButtonDefaults.buttonColors(Color(0xff5861E2)),
                        shape = RoundedCornerShape(6.dp),
                        contentPadding = PaddingValues(5.dp),
                        modifier = Modifier
                            .width(309.dp),
                    ){
                        Text(text= "Salvar",
                            color = (Color.White),
                            fontSize = 16.sp,
                            fontFamily = InterBold,
                            textAlign = TextAlign.Center,)
                    }
                }
                Spacer(modifier = Modifier.height(8.dp))
            }

        }
        //Rodapé
        Box (
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(bottom = 15.dp)
                .padding(top = 16.dp)
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

@Preview(showSystemUi = false)
@Composable
fun CadastroEnderecoPreview(){
    Surface (
        modifier = Modifier
            .fillMaxWidth()
    ){
        CadastroEndereco()
    }
}