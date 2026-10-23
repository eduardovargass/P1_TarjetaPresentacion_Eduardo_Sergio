package com.example.p1_tarjetapresentacion_eduardo_sergio



import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.p1_tarjetapresentacion_eduardo_sergio.ui.theme.P1_TarjetaPresentacion_Eduardo_SergioTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            P1_TarjetaPresentacion_Eduardo_SergioTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(0xFFD2E8D4)
                ) {
                    // Muestra únicamente tu parte centrada abajo en la pantalla
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(bottom = 40.dp),
                        contentAlignment = Alignment.BottomCenter
                    ) {
                        Informacion()
                    }
                }
            }
        }
    }
}

// --- TU PARTE DEL PROYECTO ---

@Composable
fun Informacion(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        Contacto(
            icon = Icons.Default.Phone,
            TextoContacto = "+34 913 98 03 00"
        )
        Contacto(
            icon = Icons.Default.Share,
            TextoContacto = "@VirgenDeLaPaloma"
        )
        Contacto(
            icon = Icons.Default.Email,
            TextoContacto = "palomafp@palomafp.org"
        )
    }
}

@Composable
fun Contacto(icon: ImageVector, TextoContacto: String) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Start,
        modifier = Modifier.width(280.dp)
    ) {
        Icon(
            imageVector = icon,
            contentDescription = null,
            tint = Color(0xFF006D3B),
            modifier = Modifier.size(24.dp)
        )
        Spacer(modifier = Modifier.width(24.dp))
        Text(
            text = TextoContacto,
            fontSize = 14.sp,
            color = Color.Black
        )
    }
}

@Preview(showBackground = true)
@Composable
fun  InformacionPreview() {
    P1_TarjetaPresentacion_Eduardo_SergioTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = Color(0xFFD2E8D4)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(bottom = 40.dp),
                contentAlignment = Alignment.BottomCenter
            ) {
                Informacion()
            }
        }
    }
}