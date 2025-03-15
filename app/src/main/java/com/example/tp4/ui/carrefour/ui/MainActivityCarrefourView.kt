package com.example.tp4.ui.carrefour.ui

import CarrefourState
import androidx.compose.foundation.layout.*

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.semantics.Role.Companion.Button
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.tp4.ui.carrefour.controller.CarrefourViewModel
import com.example.tp4.ui.carrefour.state.*
import com.example.tp4.ui.state.Feu3State
import com.example.tp4.ui.state.Feu3StateV2
import com.example.tp4.ui.state.FeuCouleur
import com.example.tp4.ui.vue.Feu3ViewV3


@Composable
fun MainActivityCarrefourView(viewmodel: CarrefourViewModel = viewModel()) {
    Column {
        CarrefourView(state = viewmodel.state)
        Button(onClick = { viewmodel.suivant() }) {
            Text("Suivant")
        }
    }
}

@Composable
fun CarrefourView(state: CarrefourState, modifier: Modifier = Modifier, size: Dp = 180.dp) {
    Box(modifier.fillMaxWidth().padding(60.dp)) {
        val mod = Modifier.scale(0.5f).align(Alignment.Center)
        Feu3ViewV3(state = state.feux[0], modifier = mod.offset(y = -size))
        Feu3ViewV3(state = state.feux[1], modifier = mod.offset(y = size))
        Feu3ViewV3(state = state.feux[2], modifier = mod.offset(x = -size))
        Feu3ViewV3(state = state.feux[3], modifier = mod.offset(x = size))
    }
}

@Preview(showBackground = true)
@Composable
fun CarrefourPreview() {
    CarrefourView(state = CarrefourState(1, arrayOf(
        Feu3StateV2(), Feu3StateV2(FeuCouleur.VERT), Feu3StateV2(), Feu3StateV2()
    )))
}