package com.example.tp4



import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

import com.example.tp4.ui.carrefour.ui.MainActivityCarrefourView

class Main : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainActivityCarrefourView()
        }
    }
}
