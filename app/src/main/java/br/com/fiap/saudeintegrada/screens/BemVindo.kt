package br.com.fiap.saudeintegrada.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.Surface
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
                , contentDescription = "icone do projeto saúde integrada", modifier = Modifier.size(width = 150.dp, height = 91.dp) )
        }
        Column {
            Text(text = )
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
        Login()
    }
}
