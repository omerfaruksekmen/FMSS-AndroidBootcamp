package com.omerfaruksekmen.odev2omerfaruksekmen.odev2

fun main() {
    val nesne = MetodClass()

    println("------ Metod Sonuçları ------")

    println("İç Açı Hesabı              : " + nesne.icAciHesabi(3))
    println("Maaş Hesabı                : " + nesne.maasHesabi(21))
    println("Otopark Ücreti Hesabı      : " + nesne.otoparkUcretiHesabi(12))
    println("Kilometreden Mil Hesabı    : " + nesne.kmToMilHesabi(34.7))
    nesne.dikdortgenAlanHesabi(5,10)
    println("Faktoriyel Hesabı          : " + nesne.faktoriyelHesabi(5))
    nesne.harfSayisiHesabi("Merhaba ne muhteşem bir etkinlik")
    
}