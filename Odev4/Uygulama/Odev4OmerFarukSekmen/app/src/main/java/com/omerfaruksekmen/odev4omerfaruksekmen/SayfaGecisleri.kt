package com.omerfaruksekmen.odev4omerfaruksekmen

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun SayfaGecisleri(){
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "ana_sayfa"){

        composable(route = "ana_sayfa"){
            AnaSayfa(navController)
        }

        composable(route = "sayfa_A"){
            SayfaA(navController)
        }

        composable(route = "sayfa_B"){
            SayfaB(navController)
        }

        composable(route = "sayfa_X"){
            SayfaX(navController)
        }

        composable(route = "sayfa_Y"){
            SayfaY()
        }
    }
}