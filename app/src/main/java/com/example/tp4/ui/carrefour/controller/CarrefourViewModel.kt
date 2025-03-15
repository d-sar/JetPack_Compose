package com.example.tp4.ui.carrefour.controller
import CarrefourState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.tp4.ui.state.FeuCouleur


class CarrefourViewModel : ViewModel() {
    private val _state = mutableStateOf(CarrefourState())
    var state
        get() = _state.value
        private set(newState) {
            _state.value = newState
        }


    }
