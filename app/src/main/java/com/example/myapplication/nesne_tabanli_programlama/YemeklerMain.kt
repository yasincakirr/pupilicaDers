package com.example.myapplication.nesne_tabanli_programlama

fun main() {
    //Nesne oluşturma
    val y1 =Yemekler(1,"Köfte",249)
    ///Deger Okuma
    y1.bilgiAl()

    val y2 = Yemekler(2,"Baklava",150)

    println("----------------------")
    println("Id : ${y2.id}")
    println("Ad : ${y2.ad}")
    println("Fiyat : ${y2.fiyat}")

    //deger atama/değiştirme

    y2.fiyat = 250

    y2.bilgiAl()





}