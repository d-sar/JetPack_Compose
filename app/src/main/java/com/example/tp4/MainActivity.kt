package com.example.tp4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.tp4.ui.vue.MainActivityFeu3View
import com.example.tp4.ui.theme.TP4Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //enableEdgeToEdge()
//        setContent {
//            TP4Theme {
//                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//                    Greeting(
//                        name = "Android",
//                        modifier = Modifier.padding(innerPadding)
//                    )
//                }
//            }
//        }

        // setContent(null,{ Text("ok") })
        setContent{
//            Text( text="Bonjour tout la monde !",
//                fontWeight = FontWeight.Bold,
//                fontSize = 32.sp,
//                color = Color.Magenta
//            )
            TP4Theme {



                        Surface(
                            modifier = Modifier.fillMaxSize(),
                            color = MaterialTheme.colorScheme.background
                        ) {
                            MainActivityFeu3View()
                        }
            }

        }

    }
}
//Column est un LinearLayout vertical
//@Composable
//fun Accueil(name: String) {
//    Column {
//        Text(text = "Bonjour $name", fontSize=20.sp)
//        Text(text = "Je vois de grands progrès", color = Color.Blue)
//    }
//    }
//@Composable
//fun Accueil(name: String) {
//    Column(content = {
//        Text(text = "Bonjour $name", fontSize=20.sp)
//        Text(text = "Je vois de grands progrès", color = Color.Blue)
//    })
//}

//@Composable
//fun Accueil(name: String) {
//    ElevatedCard {
//        Text(text = "Bonjour $name", fontSize=20.sp)
//        Text(text = "Je vois de grands progrès", color = Color.Blue)
//    }
//}
//
//@Preview
//@Composable
//fun AccueilPreview() {
//    Accueil(name = "numéro 10")
//}
//Paramétrage des vues
//@Composable
//fun Accueil(name: String, modifier: Modifier = Modifier) {
//    ElevatedCard {
//        Column(
//            modifier = modifier.padding(8.dp),
//            horizontalAlignment = Alignment.CenterHorizontally
//        ) {
//            Text(
//                text = "Bonjour $name",
//                fontSize = 20.sp,
//                modifier = Modifier.padding(12.dp))
//            Text(text = "Je vois de grands progrès", color = Color.Blue)
//        }
//    }
//}
//
//@Preview
//@Composable
//fun AccueilPreview() {
//    Column {
//        Accueil(name = "numéro 10", modifier = Modifier.fillMaxWidth())
//        Accueil(name = "numéro 6")  // valeur par défaut du modifier
//    }
//}
//@Composable
//fun AccueilMultiple(names: List<String>) {
//    Column {
//        for (name in names) {
//            Text(text = "Bonjour $name !", modifier = Modifier.padding(4.dp))
//        }
//    }
//}
//@Preview
//@Composable
//fun AccueilMultiplePreview() {
//    AccueilMultiple(listOf("pierre", "paul", "jacques"))
//}



