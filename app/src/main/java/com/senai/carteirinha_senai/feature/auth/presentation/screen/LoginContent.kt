package com.senai.carteirinha_senai.feature.auth.presentation.screen

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.compose.CarteirinhaSenaiTheme

@Composable
fun LoginContent(
    modifier: Modifier = Modifier,
    login: String = "",
    senha: String = "",
    onLoginChange: (String) -> Unit = {},
    onSenhaChange: (String) -> Unit ={},
    onLoginClick: () -> Unit = {}
) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(
            space = 16.dp,
            alignment = Alignment.CenterVertically
        )
    ) {

        TextField(
            value = login,
            onValueChange = onLoginChange,
            label = {
                Text(text = "Login")
            }
        )
        OutlinedTextField(
            value = senha,
            onValueChange = onSenhaChange,
            label = {
                Text(text = "Senha")
            }
        )
        OutlinedButton(
            onClick = {},
            modifier = Modifier
                .fillMaxWidth(.6f),
            shape = RoundedCornerShape(10.dp),
            border = BorderStroke(
                width = 1.dp,
                color = MaterialTheme.colorScheme.inversePrimary
            )
        ) {
            Text("Cadastrar")

        }
        OutlinedButton(
            onClick = onLoginClick,
            modifier = Modifier
                .fillMaxWidth(.4f),
            shape = RoundedCornerShape(10.dp),
            border = BorderStroke(
                width = 1.dp,
                color = MaterialTheme.colorScheme.inversePrimary
            )
        ) {
            Text("Entrar")
        }
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun PreviewLoginClaro() {
    CarteirinhaSenaiTheme (darkTheme = false) {
        LoginContent(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxSize()
        )
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun PreviewLoginEscuro() {
    CarteirinhaSenaiTheme(darkTheme = true) {
        LoginContent(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxSize()
        )
    }
}