package com.example.tp4.ui.model


import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.tp4.ui.state.Feu3State


class Feu3ViewModel : ViewModel() {

    // singleton contenant l'état, observable mais privé
    private val _state = mutableStateOf(Feu3State())

    // getter pour consulter cet état à l'extérieur de cette classe, mais setter privé
    var state
        get() = _state.value            // _state.value = instance de Feu3State
        private set(newstate) {
            _state.value = newstate     // remplace l'état par le nouveau
        }

    init {
        reset()
    }

    /// méthodes pour modifier les données

    fun reset() {
        state = Feu3State()
    }

    fun suivant() {
        state = with (state) {
            if (rouge) {
                Feu3State(false, false, true)
            } else if (vert) {
                Feu3State(false, true, false)
            } else {
                Feu3State(true, false, false)
            }
        }
    }
}