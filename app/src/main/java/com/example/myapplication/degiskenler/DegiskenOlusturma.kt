package com.example.myapplication.degiskenler

fun main() {


    var id= 1
    var ad="Mont"
    var resim= "mont.png"
    var puan= 4.7
    var fiyat = 4500
    var stokDurumu = true


    println(id)
    println(ad)
    println(resim)
    println(puan)
    println(fiyat)
    println(stokDurumu)

    //Sabitler -- Constant

    var sayi = 30
    sayi = 80
    println(sayi)


    val numara = 50
    println(numara)

    //Tür Dönüşümü
    //1 - Sayısaldan sayısala dönüşümü
    val d = 89.32
    val i = 34

    val sonuc1 = d.toInt()
    val sonuc2 = i.toDouble()

    println(sonuc1)
    println(sonuc2)

    //2 - Sayısaldan metine dönüşüm
    val x =85
    val sonuc3 =x.toString()
    println(sonuc3)

    //3 - Metinden Sayısala dönüşüm
    val yazi = "48"
    val sonuc4 = yazi.toInt()
    println(sonuc4)

    val yazi2 = "48T"
    val sonuc5 = yazi2.toIntOrNull()
    println(sonuc5)






}