package com.example.tp4.ui.state


enum class FeuCouleur {
    ROUGE,
    ORANGE,
    VERT
}

data class Feu3StateV2(
    val couleur: FeuCouleur = FeuCouleur.ROUGE
) {
    val nomCouleur: String
        get() = couleur.toString()

    val rouge: Boolean
        get() = couleur == FeuCouleur.ROUGE

    val orange: Boolean
        get() = couleur == FeuCouleur.ORANGE

    val vert: Boolean
        get() = couleur == FeuCouleur.VERT

    fun copyChangeCouleur(nouvelle: FeuCouleur): Feu3StateV2 {
        return this.copy(couleur = nouvelle)
    }
}