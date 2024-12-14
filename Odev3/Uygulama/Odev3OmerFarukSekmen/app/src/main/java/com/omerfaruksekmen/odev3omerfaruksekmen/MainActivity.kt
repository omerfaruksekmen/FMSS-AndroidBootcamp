package com.omerfaruksekmen.odev3omerfaruksekmen

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.omerfaruksekmen.odev3omerfaruksekmen.ui.theme.AnaRenk
import com.omerfaruksekmen.odev3omerfaruksekmen.ui.theme.AnaRenkDark
import com.omerfaruksekmen.odev3omerfaruksekmen.ui.theme.Odev3OmerFarukSekmenTheme
import com.omerfaruksekmen.odev3omerfaruksekmen.ui.theme.YaziRenk1
import com.omerfaruksekmen.odev3omerfaruksekmen.ui.theme.YaziRenk1Dark
import com.omerfaruksekmen.odev3omerfaruksekmen.ui.theme.butonRenk1
import com.omerfaruksekmen.odev3omerfaruksekmen.ui.theme.butonRenk1Dark
import com.omerfaruksekmen.odev3omerfaruksekmen.ui.theme.pacifico

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Odev3OmerFarukSekmenTheme {
                AnaSayfa()
            }
        }
    }
}


@Composable
fun AnaSayfa(darkTheme : Boolean = isSystemInDarkTheme()){
    val configuration = LocalConfiguration.current
    val ekranYuksekligi = configuration.screenHeightDp
    val ekranGenisligi = configuration.screenWidthDp

    Scaffold(topBar = { } ){paddingValues ->
        Image(
            painter = painterResource(id = R.drawable.spacedark),
            contentDescription = "",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.FillBounds)
        Column(modifier = Modifier
            .fillMaxSize()
            .padding(paddingValues),
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally)
        {
            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(5.dp),
                horizontalArrangement = Arrangement.SpaceBetween) {
                Column {
                    Text(text = stringResource(id = R.string.gezegenAdi),
                        fontWeight = FontWeight.Bold, color = if (darkTheme) AnaRenkDark else AnaRenk, fontFamily = pacifico,
                        fontSize = (ekranGenisligi/23).sp)
                    Text(text = stringResource(id = R.string.gezegenAciklama), color = if (darkTheme) YaziRenk1Dark else YaziRenk1,
                        fontWeight = FontWeight.Bold, fontSize = (ekranGenisligi/23).sp)
                }
                Row {
                    IconButton(
                        onClick = {  }
                    ) {
                        Icon(
                            imageVector = Icons.Default.MoreVert,
                            contentDescription = "More Options",
                            tint = if (darkTheme) AnaRenkDark else AnaRenk
                        )
                    }
                    IconButton(
                        onClick = {  }
                    ) {
                        Icon(
                            imageVector = Icons.Default.Close,
                            contentDescription = "Close",
                            tint = if (darkTheme) AnaRenkDark else AnaRenk
                        )
                    }
                }
            }
            Box(
                modifier = Modifier
                    //.fillMaxWidth()
                    //.aspectRatio(1f)
                    .clip(CircleShape)
                    .background(Color.Black),
                contentAlignment = Alignment.Center

            ) {
                Image(
                    painter = painterResource(id = R.drawable.mars),
                    contentDescription = "",
                    contentScale = ContentScale.Crop,
                    //modifier = Modifier.fillMaxSize()
                )
            }
            Column(modifier = Modifier
                .fillMaxWidth()
                .padding(5.dp)) {
                Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
                    Text(modifier = Modifier.weight(1f), text = stringResource(id = R.string.ozellikler),
                        fontWeight = FontWeight.Bold, fontFamily = pacifico,
                        fontSize = (ekranGenisligi/23).sp, color = if (darkTheme) AnaRenkDark else AnaRenk)
                }
                Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
                    Text(modifier = Modifier.weight(1f), text = stringResource(id = R.string.agirlikBaslik),
                        color = if (darkTheme) YaziRenk1Dark else YaziRenk1,
                        fontWeight = FontWeight.Bold, fontSize = (ekranGenisligi/23).sp)
                    Text(modifier = Modifier.weight(1f), text = stringResource(id = R.string.agirlik),
                        fontWeight = FontWeight.Bold, color = if (darkTheme) AnaRenkDark else AnaRenk,
                        fontSize = (ekranGenisligi/23).sp)
                }
                Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
                    Text(modifier = Modifier.weight(1f), text = stringResource(id = R.string.yaricapBaslik),
                        fontWeight = FontWeight.Bold, color = if (darkTheme) YaziRenk1Dark else YaziRenk1,
                        fontSize = (ekranGenisligi/23).sp)
                    Text(modifier = Modifier.weight(1f), text = stringResource(id = R.string.yaricap),
                        fontWeight = FontWeight.Bold, color = if (darkTheme) AnaRenkDark else AnaRenk,
                        fontSize = (ekranGenisligi/23).sp)
                }
                Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
                    Text(modifier = Modifier.weight(1f), text = stringResource(id = R.string.yercekimiBaslik),
                        fontWeight = FontWeight.Bold, color = if (darkTheme) YaziRenk1Dark else YaziRenk1,
                        fontSize = (ekranGenisligi/23).sp)
                    Text(modifier = Modifier.weight(1f), text = stringResource(id = R.string.yercekimi),
                        fontWeight = FontWeight.Bold, color = if (darkTheme) AnaRenkDark else AnaRenk,
                        fontSize = (ekranGenisligi/23).sp)
                }
            }
            Column(modifier = Modifier
                .fillMaxWidth()
                .padding(5.dp)) {
                Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
                    Text(modifier = Modifier.weight(1f), text = stringResource(id = R.string.digerOzellikler),
                        fontWeight = FontWeight.Bold, fontFamily = pacifico, fontSize = (ekranGenisligi/23).sp,
                        color = if (darkTheme) AnaRenkDark else AnaRenk)
                }
                Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
                    Text(modifier = Modifier.weight(1f), text = stringResource(id = R.string.yorungeHiziBaslik),
                        fontWeight = FontWeight.Bold, color = if (darkTheme) YaziRenk1Dark else YaziRenk1,
                        fontSize = (ekranGenisligi/23).sp)
                    Text(modifier = Modifier.weight(1f), text = stringResource(id = R.string.yorungeHizi),
                        fontWeight = FontWeight.Bold, color = if (darkTheme) AnaRenkDark else AnaRenk,
                        fontSize = (ekranGenisligi/23).sp)
                }
                Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
                    Text(modifier = Modifier.weight(1f), text = stringResource(id = R.string.minSicaklikBaslik),
                        color = if (darkTheme) YaziRenk1Dark else YaziRenk1,
                        fontWeight = FontWeight.Bold, fontSize = (ekranGenisligi/23).sp)
                    Text(modifier = Modifier.weight(1f), text = stringResource(id = R.string.minSicaklik),
                        fontWeight = FontWeight.Bold, color = if (darkTheme) AnaRenkDark else AnaRenk,
                        fontSize = (ekranGenisligi/23).sp)
                }
                Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
                    Text(modifier = Modifier.weight(1f), text = stringResource(id = R.string.maxSicaklikBaslik),
                        fontWeight = FontWeight.Bold, color = if (darkTheme) YaziRenk1Dark else YaziRenk1,
                        fontSize = (ekranGenisligi/23).sp)
                    Text(modifier = Modifier.weight(1f), text = stringResource(id = R.string.maxSicaklik),
                        fontWeight = FontWeight.Bold, color = if (darkTheme) AnaRenkDark else AnaRenk,
                        fontSize = (ekranGenisligi/23).sp)
                }

            }

            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(5.dp),
                horizontalArrangement = Arrangement.SpaceEvenly) {
                Button(
                    onClick = {  },
                    modifier = Modifier.weight(1f),
                    shape = RectangleShape,
                    colors = ButtonDefaults.buttonColors(
                        containerColor = if (darkTheme) butonRenk1Dark else butonRenk1,
                        contentColor = AnaRenk
                    )
                ) {
                    Text(text = stringResource(id = R.string.arastirma), fontFamily = pacifico,
                        fontSize = 16.sp)
                }
                Button(
                    onClick = {  },
                    modifier = Modifier.weight(1f),
                    shape = RectangleShape,
                    colors = ButtonDefaults.buttonColors(
                        containerColor = if (darkTheme) butonRenk1Dark else butonRenk1,
                        contentColor = AnaRenk
                    )
                ) {
                    Text(text = stringResource(id = R.string.ozellikler), fontFamily = pacifico,
                        fontSize = 16.sp)
                }
                Button(
                    onClick = {  },
                    modifier = Modifier.weight(1f),
                    shape = RectangleShape,
                    colors = ButtonDefaults.buttonColors(
                        containerColor = if (darkTheme) butonRenk1Dark else butonRenk1,
                        contentColor = AnaRenk
                    )
                ) {
                    Text(text = stringResource(id = R.string.gozlem), fontFamily = pacifico,
                        fontSize = 16.sp)
                }
            }


        }

    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Odev3OmerFarukSekmenTheme {
        AnaSayfa()
    }
}