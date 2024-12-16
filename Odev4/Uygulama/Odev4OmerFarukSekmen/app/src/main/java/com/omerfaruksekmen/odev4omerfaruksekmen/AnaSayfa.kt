package com.omerfaruksekmen.odev4omerfaruksekmen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.Navigation

@Composable
fun AnaSayfa(navController: NavController){
    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(text = "ANA SAYFA", fontSize = 25.sp, fontWeight = FontWeight.Bold, color = Color.Red)
        Button(onClick = {
            navController.navigate("sayfa_A")
        })
        {
            Text(text = "Sayfa A'ya Git", fontSize = 18.sp)
        }
        Button(onClick = {
            navController.navigate("sayfa_X")
        })
        {
            Text(text = "Sayfa X'e Git", fontSize = 18.sp)
        }

    }

}