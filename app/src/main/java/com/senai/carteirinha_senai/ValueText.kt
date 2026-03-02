package com.senai.carteirinha_senai

import androidx.annotation.Size
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp

@Composable
fun ValueText(
    value: String,
    fontSize: TextUnit = MaterialTheme.typography.titleLarge.fontSize,
    fontWeight: FontWeight = MaterialTheme.typography.titleLarge.fontWeight ?: FontWeight.Normal,
    modifier: Modifier = Modifier,
    textAlign: TextAlign = TextAlign.Start
){
    Text(
        text = value,
        fontSize = fontSize,
        fontWeight = fontWeight,
        fontFamily = MaterialTheme.typography.titleLarge.fontFamily,
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 8.dp),
        softWrap = true,
        textAlign = textAlign,
        color = MaterialTheme.colorScheme.onSurface
    )
}