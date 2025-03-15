package com.example.tp4.ui.vue


import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.*
import androidx.compose.ui.draw.clip

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Gray
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.*
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.tp4.ui.model.Feu3ViewModel
import com.example.tp4.ui.state.Feu3State


@Composable
fun MainActivityFeu3View(viewmodel: Feu3ViewModel = viewModel()) {
// état auquel s abonne cette fonction composable

    val state = viewmodel.state
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
// affichage du feu, version 1
        Feu3ViewV3(state, modifier = Modifier.padding(16.dp))
// bouton, voir la suite du TP
        Button(
            onClick = {
                viewmodel.suivant() // modif par le contrôleur
            },
            modifier = Modifier.fillMaxWidth().padding(32.dp)
        ) {
            Text(text = "état suivant")
        }
    }
}
@Composable
fun Feu3ViewV1(state: Feu3State, modifier: Modifier = Modifier) {
    Text(text = "Feu ${state.nomCouleur}",
        style = MaterialTheme.typography.titleLarge,
        modifier = modifier,
    )
}
@Composable
fun Feu3ViewV2(state: Feu3State, modifier: Modifier = Modifier) {
    Column(
        modifier.wrapContentSize()
    ) {
// feu rouge
        Row(Modifier.align(Alignment.Start).padding(horizontal = 16.dp)) {
            RadioButton(
                selected = state.rouge,
                onClick = null // non réactif
            )
            Text(
                text = "rouge",
                modifier = Modifier.padding(start = 16.dp)
            )
        }
// TODO idem pour le feu orange et pour le feu vert
    }
}

@Composable
fun Feu3ViewV3(state: Feu3State, modifier: Modifier = Modifier) {
    Column(modifier = modifier
        .wrapContentSize(Alignment.Center)) {
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .size(48.dp, 128.dp)
                .clip(RoundedCornerShape(16.dp))
                .background(Color.DarkGray)
        ) {
            Column {
                Feu(Color.Red,    state.rouge)
                Feu(Color.Orange, state.orange)
                Feu(Color.Green,  state.vert)
            }
        }
    }
}

/**
 * dessine un disque coloré ou gris selon isOn
 */
@Composable
fun <C> Feu(color: C, isOn: Boolean, modifier: Modifier = Modifier) where C : Color {
    Canvas(
        modifier = modifier.size(40.dp).padding(4.dp),
        onDraw = {
            drawCircle(color = if (isOn) color else Color.Gray)
        }
    )
}

// définit la couleur Color.Orange par une extension de la classe Color
private val Color.Companion.Orange: Color
    get() = hsv(33.0f, 1.0f, 1.0f)


@Preview(showBackground = true)
@Composable
fun Feu3ViewV3Preview() {
    // une seule des deux lignes suivantes, soit V1, soit V2 (voir § état second)
    Feu3ViewV3(state = Feu3State(false, true, false))    // pour la V1
   // Feu3ViewV3(state = Feu3State(FeuCouleur.ORANGE))   // pour la V2
}