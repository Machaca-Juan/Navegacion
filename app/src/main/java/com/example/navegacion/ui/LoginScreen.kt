package com.example.navegacion.ui

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun Pantalla(titulo: String, contenido: @Composable ColumnScope.() -> Unit) {
    Column(
        modifier = Modifier.fillMaxSize().padding(24.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Text(titulo, style = MaterialTheme.typography.headlineMedium)
        contenido()
    }
}

@Composable
fun LoginScreen(onLogin: () -> Unit) = Pantalla("Login") {
    Button(onClick = onLogin) { Text("Iniciar sesión") }
}