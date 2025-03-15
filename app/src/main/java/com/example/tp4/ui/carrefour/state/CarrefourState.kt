
import com.example.tp4.ui.state.Feu3StateV2
import com.example.tp4.ui.state.FeuCouleur

@Suppress("ArrayInDataClass")
data class CarrefourState (
    val courant: Int = 0, // feu courant (vert ou orange, les autres rouges)
    val feux: Array<Feu3StateV2> = arrayOf(
        Feu3StateV2(), Feu3StateV2(), Feu3StateV2(), Feu3StateV2() // 4 feux
    )
) {
    val feuCourant get() = feux[courant]

    fun copyChangeCouleurCourant(couleur: FeuCouleur): CarrefourState {
        val newFeux = feux.copyOf()
        newFeux[courant] = feux[courant].copy(couleur = couleur)
        return copy(feux = newFeux)
    }

    fun copyChangeCourant(num: Int): CarrefourState {
        return copy(courant = num % feux.size)
    }
}