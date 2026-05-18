package com.senai.carteirinha_senai.feature.carteirinha.presentation.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.senai.carteirinha_senai.R
import com.rafaelcosta.myapplication.QrCode
import com.senai.carteirinha_senai.feature.carteirinha.presentation.component.ValueText

@Composable
fun CarteirinhaContent(
    qrCodeContent: String = "numero de matricula do aluno",
    modifier: Modifier = Modifier) {

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


