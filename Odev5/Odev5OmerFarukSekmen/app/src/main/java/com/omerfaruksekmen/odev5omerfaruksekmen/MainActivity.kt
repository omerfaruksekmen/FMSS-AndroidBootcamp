package com.omerfaruksekmen.odev5omerfaruksekmen

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.runtime.Composable
import com.omerfaruksekmen.odev5omerfaruksekmen.ui.theme.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Odev5OmerFarukSekmenTheme {
                TrendyolGoApp()
            }
        }
    }
}

@Composable
fun TrendyolGoApp() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = TrendyolBackground
    ) {
        Scaffold(
            topBar = {
                Column(
                    modifier = Modifier.background(TrendyolOrange)
                ) {
                    TopBar()
                    SearchBar()
                }
            },
            bottomBar = { BottomNavigation() }
        ) { paddingValues ->
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .verticalScroll(rememberScrollState())
                    .padding(
                        top = paddingValues.calculateTopPadding(),
                        bottom = paddingValues.calculateBottomPadding()
                    ).background(TrendyolOrange)
            ) {
                MainContent()
            }
        }
    }
}

@Composable
fun TopBar() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 20.dp),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = "Trendyol Go Logo",
            colorFilter = ColorFilter.tint(Color.White),
            modifier = Modifier.height(50.dp)
        )

        Row(verticalAlignment = Alignment.CenterVertically) {
            Card(
                modifier = Modifier
                    .height(40.dp)
                    .width(210.dp)
                    .padding(end = 8.dp),
                shape = RoundedCornerShape(20.dp),
                colors = CardDefaults.cardColors(
                    containerColor = TrendyolDeliveryYelllow
                )
            ) {
                Row(
                    modifier = Modifier
                        .padding(horizontal = 12.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        imageVector = Icons.Default.LocationOn,
                        contentDescription = "Konum",
                        tint = IconColor,
                        modifier = Modifier.size(20.dp)
                    )
                    Spacer(modifier = Modifier.width(4.dp))
                    Text(
                        text = "Teslimat Adresi Seç",
                        fontWeight = FontWeight.Bold,
                        color = TrendyolDeliveryTextBlack,
                        fontSize = 14.sp,
                        modifier = Modifier.padding(vertical = 8.dp)
                    )
                    Spacer(modifier = Modifier.width(4.dp))
                    Icon(
                        imageVector = Icons.Default.KeyboardArrowDown,
                        contentDescription = "Aşağı Ok",
                        tint = IconColor,
                        modifier = Modifier.size(20.dp)
                    )
                }
            }
        }
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            IconButton(
                onClick = { },
                modifier = Modifier.size(24.dp)
            ) {
                Icon(
                    imageVector = Icons.Default.Notifications,
                    contentDescription = "Bildirimler",
                    tint = Color.White
                )
            }
            Text(
                text = "Bildirimler",
                color = Color.White,
                fontSize = 10.sp
            )
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchBar() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(12.dp)
    ) {
        TextField(
            value = "",
            onValueChange = { },
            modifier = Modifier.fillMaxWidth(),
            placeholder = { Text("Döner ara", color = TrendyolGray, fontWeight = FontWeight.Bold) },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Search,
                    contentDescription = "Ara",
                    tint = TrendyolOrange
                )
            },
            colors = TextFieldDefaults.textFieldColors(
                containerColor = Color.White,
                unfocusedIndicatorColor = Color.Transparent,
                focusedIndicatorColor = Color.Transparent,
                disabledIndicatorColor = Color.Transparent
            ),
            shape = RoundedCornerShape(24.dp)
        )
    }
}

@Composable
fun MainContent() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(color = MainContentColor,
                shape = RoundedCornerShape(topStart = 16.dp, topEnd = 16.dp)
            )
            .padding(16.dp)
    ) {
        CategoryGrid()
        Spacer(modifier = Modifier.height(16.dp))
        PromotionBanner()
        Spacer(modifier = Modifier.height(16.dp))
        KitchenCategories()
    }
}

@Composable
fun CategoryGrid() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Column(
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            CategoryItem(
                title = "Hızlı Market",
                subtitle = "Binlerce ürün indirimlerle kapında",
                modifier = Modifier
                    .width(160.dp)
                    .height(100.dp)
            )
            CategoryItem(
                title = "Su ve Damacana",
                subtitle = "",
                modifier = Modifier
                    .width(160.dp)
                    .height(60.dp)
            )
        }
        CategoryItem(
            title = "Yemek",
            subtitle = "Sıcak ve indirimli lezzetler",
            modifier = Modifier
                .width(160.dp)
                .height(168.dp)
        )
    }
}

@Composable
fun CategoryItem(
    title: String,
    subtitle: String,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier,
        shape = RoundedCornerShape(8.dp)
    ) {
        Box(
            modifier = Modifier.fillMaxSize()
        ) {
            Image(
                painter = painterResource(
                    id = when (title) {
                        "Hızlı Market" -> R.drawable.hizlimarket
                        "Yemek" -> R.drawable.yemek
                        else -> R.drawable.suvedamacana
                    }
                ),
                contentDescription = null,
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop
            )
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 1.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = title,
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp,
                    color = Color.White,
                    textAlign = TextAlign.Center
                )
                if (subtitle.isNotEmpty()) {
                    Text(
                        text = subtitle,
                        fontSize = 9.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Black,
                        textAlign = TextAlign.Center,
                        lineHeight = 14.sp,
                        maxLines = 2,
                        softWrap = true,
                        modifier = Modifier.width(120.dp)
                    )
                }
            }
        }
    }
}

@Composable
fun PromotionBanner() {
    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        contentPadding = PaddingValues(horizontal = 16.dp)
    ) {
        val promotions = listOf(
            "ilksiparisindirim",
            "ilksiparissportplus"
        )
        items(promotions) { promotion ->
            Card(
                modifier = Modifier
                    .width(300.dp)
                    .height(110.dp),
                shape = RoundedCornerShape(8.dp)
            ) {
                Box(
                    modifier = Modifier.fillMaxSize()
                ) {
                    Image(
                        painter = painterResource(
                            id = when (promotion) {
                                "ilksiparisindirim" -> R.drawable.ilksiparisreklam
                                else -> R.drawable.ilksiparisreklam2
                            }
                        ),
                        contentDescription = null,
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop
                    )
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(5.dp),
                        verticalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(
                            text = when(promotion){
                                "ilksiparisindirim" -> "İlk siparişe"
                                else -> "TRENDYOL GO UYGULAMASINDAN"
                            },
                            fontSize = when(promotion){
                                "ilksiparisindirim" -> 10.sp
                                else -> 12.sp
                            },
                            color = Color.Black,
                            fontWeight = FontWeight.Bold
                        )
                        Text(
                            text = when(promotion){
                                "ilksiparisindirim" -> "100 TL"
                                else -> "İLK SİPARİŞİNİ VERENLERE"
                            },
                            fontSize = when(promotion){
                                "ilksiparisindirim" -> 20.sp
                                else -> 12.sp
                            },
                            fontWeight = FontWeight.Bold,
                            color = Color.Black
                        )
                        Text(
                            text = when(promotion){
                                "ilksiparisindirim" -> "İNDİRİM"
                                else -> "S SPORT PLUS İLK AY ÜCRETSİZ"
                            },
                            fontSize = when(promotion){
                                "ilksiparisindirim" -> 20.sp
                                else -> 12.sp
                            },
                            color = Color.Black,
                            fontWeight = FontWeight.Bold
                        )
                        Text(
                            text = "Kampanya koşullarını öğrenmek için lütfen tıklayınız.",
                            fontSize = 10.sp,
                            color = when(promotion){
                                "ilksiparisindirim" -> Color.Black
                                else -> Color.White
                            },
                            lineHeight = 12.sp,
                            maxLines = 2,
                            softWrap = true,
                            modifier = Modifier.width(150.dp)
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun KitchenCategories() {
    Column {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Mutfaklar",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = TrendyolDarkGray
            )
            TextButton(onClick = { }) {
                Text(
                    text = "Tümünü Gör",
                    color = TrendyolOrange,
                    fontWeight = FontWeight.Bold
                )
            }
        }

        LazyRow(
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            val categories = listOf("Tatlı", "Döner", "Hamburger", "Kebap", "Pizza")
            items(categories) { category ->
                KitchenCategoryItem(category)
            }
        }
    }
}

@Composable
fun KitchenCategoryItem(category: String) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Card(
            modifier = Modifier
                .height(100.dp)
                .width(80.dp)
                .clip(RoundedCornerShape(8.dp)),
            colors = CardDefaults.cardColors(containerColor = Color.White)
        ) {
            Box(
                modifier = Modifier.fillMaxSize()
            ) {
                Image(
                    painter = painterResource(
                        id = when (category) {
                            "Tatlı" -> R.drawable.tatli
                            "Döner" -> R.drawable.doner
                            "Hamburger" -> R.drawable.hamburger
                            "Kebap" -> R.drawable.kebap
                            else -> R.drawable.pizza
                        }
                    ),
                    contentDescription = null,
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(bottom = 20.dp)
                        .height(80.dp)
                        .width(60.dp),
                    contentScale = ContentScale.Crop
                )
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                )
                Text(
                    text = category,
                    modifier = Modifier
                        .align(Alignment.BottomCenter)
                        .padding(bottom = 4.dp),
                    color = Color.Black,
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Medium
                )
            }
        }
    }
}

@Composable
fun BottomNavigation() {
    var selectedItem by remember { mutableStateOf(0) }

    NavigationBar(
        containerColor = Color.White
    ) {
        NavigationBarItem(
            icon = {
                Icon(
                    painter = painterResource(id = R.drawable.ic_home),
                    contentDescription = null,
                    tint = if (selectedItem == 0) TrendyolOrange else NavigationBarGray
                )
            },
            label = {
                Text(
                    text = "Anasayfa",
                    color = if (selectedItem == 0) TrendyolOrange else NavigationBarGray
                )
            },
            selected = selectedItem == 0,
            onClick = { selectedItem = 0 },
            colors = NavigationBarItemDefaults.colors(
                selectedIconColor = TrendyolOrange,
                unselectedIconColor = TrendyolGray,
                selectedTextColor = TrendyolOrange,
                unselectedTextColor = TrendyolGray,
                indicatorColor = Color.White
            )
        )
        NavigationBarItem(
            icon = {
                Icon(
                    painter = painterResource(id = R.drawable.siparis_icon),
                    contentDescription = null,
                    tint = if (selectedItem == 1) TrendyolOrange else NavigationBarGray
                )
            },
            label = {
                Text(
                    text = "Siparişlerim",
                    color = if (selectedItem == 1) TrendyolOrange else NavigationBarGray
                )
            },
            selected = selectedItem == 1,
            onClick = { selectedItem = 1 },
            colors = NavigationBarItemDefaults.colors(
                selectedIconColor = TrendyolOrange,
                unselectedIconColor = TrendyolGray,
                selectedTextColor = TrendyolOrange,
                unselectedTextColor = TrendyolGray,
                indicatorColor = Color.White
            )
        )
        NavigationBarItem(
            icon = {
                Icon(
                    painter = painterResource(id = R.drawable.ic_profile),
                    contentDescription = null,
                    tint = if (selectedItem == 2) TrendyolOrange else NavigationBarGray
                )
            },
            label = {
                Text(
                    text = "Hesabım",
                    color = if (selectedItem == 2) TrendyolOrange else NavigationBarGray
                )
            },
            selected = selectedItem == 2,
            onClick = { selectedItem = 2 },
            colors = NavigationBarItemDefaults.colors(
                selectedIconColor = TrendyolOrange,
                unselectedIconColor = TrendyolGray,
                selectedTextColor = TrendyolOrange,
                unselectedTextColor = TrendyolGray,
                indicatorColor = Color.White
            )
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Odev5OmerFarukSekmenTheme {
        TrendyolGoApp()
    }
}