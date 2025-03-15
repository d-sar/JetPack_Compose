package com.example.tp4.ui.carrefour.ui


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.tp4.ui.state.Feu3State
import com.example.tp4.ui.state.Feu3StateV2
import com.example.tp4.ui.state.FeuCouleur


@Composable
fun Feu3ViewV3(state: Feu3State, modifier: Modifier = Modifier, size: Dp = 60.dp) {
    Column(
        modifier = modifier
            .width(size)
            .background(Color.DarkGray)
            .padding(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        LightCircle(color = if (state.couleur == FeuCouleur.ROUGE) Color.Red else Color.Gray, size = size)
        Spacer(modifier = Modifier.height(8.dp))
        LightCircle(color = if (state.couleur == FeuCouleur.ORANGE) Color(0xFFFFA500) else Color.Gray, size = size)
        Spacer(modifier = Modifier.height(8.dp))
        LightCircle(color = if (state.couleur == FeuCouleur.VERT) Color.Green else Color.Gray, size = size)
    }
}

@Composable
fun LightCircle(color: Color, size: Dp) {
    Box(
        modifier = Modifier
            .size(size)
            .background(color, shape = CircleShape)
    )
}

@Preview
@Composable
fun Feu3ViewV3Preview() {
    Surface {
        Feu3ViewV3(state = Feu3StateV2(FeuCouleur.VERT))
    }
}
