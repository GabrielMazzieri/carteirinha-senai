package com.senai.carteirinha_senai

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.example.compose.CarteirinhaSenaiTheme
import com.rafaelcosta.myapplication.QrCode

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CarteirinhaSenaiTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) {
                    innerPadding ->
                        CarteirinhaDeEstudante(modifier = Modifier
                            .padding(innerPadding)
                            .fillMaxSize())
                }


            }
        }
    }
}

@Composable
fun CarteirinhaDeEstudante(modifier: Modifier = Modifier) {

    val isDark = isSystemInDarkTheme()

    Box(
        modifier = modifier.fillMaxSize()
    ) {

        Image(
            painter = painterResource(
                if (isDark) R.drawable.background_dark
                else R.drawable.background_light
            ),
            contentDescription = "Plano de fundo",
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )

        Column(
            modifier = modifier,
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(20.dp)
        ) {

            Image(
                painter = painterResource(R.drawable.senai_sp_logo),
                "Logo padrão do SENAI",
                modifier = Modifier
                    .size(250.dp)
            )

            Image(
                painter = painterResource(R.drawable.login_1),
                "Foto de Perfil",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(150.dp)
                    .offset(y = (-20).dp)
                    .clip(CircleShape)
                    .aspectRatio(1f)
            )

            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(6.dp)
            ) {
                ValueText(
                    value = "Gabriel Nogueira Mazzieri",
                    fontSize = 26.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center
                )

                ValueText(
                    value = "Técnico em Desenvolvimento de Sistemas",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Normal,
                    textAlign = TextAlign.Center
                )

            }
                Spacer(modifier = Modifier.height(10.dp))

                Button(
                    onClick = {}
                ) {
                    Text("Acessar Informações")
                }

            /*OutlinedTextField(
                    value = "90000000001417175860",
                    onValueChange = {},
                    label =  {
                        Text(text = "Número de Matrícula")
                    }
            )*/

                QrCode(
                    conteudo = "90000000001417175860",
                    modifier = Modifier
                        .aspectRatio(2f)
                )

            }
        }
    }

@Preview(
    showBackground = true,
    showSystemUi = true
)

@Composable
fun PreviewCarterinhaClaro(){
    CarteirinhaSenaiTheme(darkTheme = false){
        CarteirinhaDeEstudante(modifier = Modifier.padding(16.dp))
    }
}
@Preview(
    showBackground = true,
    showSystemUi = true
)

@Composable
fun PreviewCarterinhaEscura(){
    CarteirinhaSenaiTheme(darkTheme = true) {
        CarteirinhaDeEstudante(modifier = Modifier.padding(16.dp))
    }
}


