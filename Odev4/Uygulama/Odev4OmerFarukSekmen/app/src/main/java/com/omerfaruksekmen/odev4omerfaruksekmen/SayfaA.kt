package com.omerfaruksekmen.odev4omerfaruksekmen

import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun SayfaA(navController: NavController){

    val context = LocalContext.current

    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(text = "SAYFA A", fontSize = 25.sp, fontWeight = FontWeight.Bold, color = Color.Red)
        Button(onClick = {
            navController.navigate("sayfa_B"){
                popUpTo("sayfa_A"){
                    inclusive = true
                }
            }
            Toast.makeText(context, "Sayfa A Back Stack'ten silindi !", Toast.LENGTH_SHORT).show()

        })
        {
            Text(text = "Sayfa B'ye Git", fontSize = 18.sp)
        }

    }

}