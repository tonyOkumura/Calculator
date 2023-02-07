package com.example.calculator

import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.calculator.ui.theme.Yellow100

@Composable
fun CalculatorButton(
    modifier: Modifier = Modifier,
    symbol: String,
    onClick: () -> Unit
) {
    ElevatedButton(onClick = onClick, modifier = modifier) {
        Text(text = symbol, style = TextStyle(fontSize = 21.sp))

    }
}

@Preview
@Composable
fun CalculatorButtonPrev() {
    CalculatorButton(symbol = "+") {
    }
}