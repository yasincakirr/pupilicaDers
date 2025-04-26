package com.example.myapplication.stadart_programlama

fun main() {
    val yas = 17


    if(yas >= 18){
        println("Reşitsiniz")
    }
    else{
        println("Reşit Degilsiniz")
    }



    val ka = "admin"
    val s = 1234456
    val sayi = 10

    if(ka =="admin" && s == 123456){
        println("Hosgeldiniz")
    }
    else{
        println("Hatalı Giriş")
    }


    if(sayi == 9 || sayi == 10){
        println("Sayi 9 veya 10 dur")
    }
    else{
        println("Sayi 9 veya 10 degildir")
    }


    //when, diger dillerde switch

    val number = 1

    when(number){
        1 -> println("number 1")
        2 -> println("number 2")
        3 -> println("number 3")
        else -> println("Tanımlanamayan sayı")
    }


}