package com.omerfaruksekmen.odev2omerfaruksekmen.odev2

class MetodClass {

    fun icAciHesabi(kenarSayisi : Int) : String{
        if(kenarSayisi < 3){
            return "Hatalı giriş. Kenar sayısı en az 3 olmalı !"
        }else{
            val icAciDegeri = ( ( kenarSayisi - 2 ) * 180 ) / kenarSayisi
            return "$icAciDegeri"
        }
    }

    fun maasHesabi(gunSayisi : Int) : String{
        if(gunSayisi < 1){
            return "Hatalı giriş. Gün sayısı en az 1 olmalı !"
        }else{
            val toplamSaat = gunSayisi * 8
            val maas = if (toplamSaat > 150) ((toplamSaat-150)*80)+(150*40) else toplamSaat*40
            return "$maas TL"
        }
    }

    fun otoparkUcretiHesabi(otoparkSuresi : Int) : String{
        if(otoparkSuresi < 1){
            return "Hatalı giriş. Otopark süresi en az 1 saat olmalı !"
        }else{
            val otoparkUcreti = if(otoparkSuresi>1) 50+((otoparkSuresi-1)*10) else 50
            return "$otoparkUcreti TL"
        }
    }

    fun kmToMilHesabi(kilometre : Double) : String{
        return if (kilometre < 1) "Hatalı giriş. Kilometre değeri 1'den küçük olamaz." else "${kilometre * 0.621}"
    }

    fun dikdortgenAlanHesabi(kisaKenar : Int, uzunKenar : Int){
        if(kisaKenar >= uzunKenar || kisaKenar < 1){
            println("Dikdörtgen Alan Hesabı     : Hatalı giriş. Kısa kenar, uzun kenardan büyük eşit olamaz veya kenar uzunlukları 1'den küçük olamaz.")
        }else{
            println("Dikdörtgen Alan Hesabı     : ${kisaKenar*uzunKenar}")
        }
    }

    fun faktoriyelHesabi(faktoriyeliAlinacakSayi : Int) : String{
        if(faktoriyeliAlinacakSayi < 1){
            return "Hatalı giriş. Faktöriyeli alınacak sayı en az 1 olmalı."
        }else{
            var faktoriyel = 1
            for (i in 1 .. faktoriyeliAlinacakSayi) faktoriyel*= i
            return "$faktoriyel"
        }
    }

    fun harfSayisiHesabi(kelime : String){
        var harfSayisi = 0
        for(harf in kelime){
            if(harf == 'e'){
                harfSayisi++
            }
        }
        if(harfSayisi == 0 ) println("Harf Sayısı Hesabı         : Kelime içerisinde e harfi bulunmamaktadır.")
        else println("Harf Sayısı Hesabı         : $harfSayisi adet e harfi bulunmaktadır.")
    }

}