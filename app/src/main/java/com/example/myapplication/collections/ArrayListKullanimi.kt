package com.example.myapplication.collections

fun main() {
    val meyveler = ArrayList<String>()


    //Veri Ekleme
    meyveler.add("Elma")//0
    meyveler.add("Muz")//1
    meyveler.add("Kiraz")//2
    println(meyveler)


    //Veri guncelleme
    meyveler[1] = "Yeni Muz"

    println(meyveler)

    //istedigimiz bir indekse : insert

    meyveler.add(1,"Portakal")

    println(meyveler)


    //okuma

    println(meyveler.get(3))

    println("Boyut : ${meyveler.size}")

    //terse çevirme

    println(meyveler)

    meyveler.reverse()

    println(meyveler)

    for(meyve in meyveler){
        println(meyve)
    }


    for((index,meyve) in meyveler.withIndex()){


        println("$index -> $meyve")

    }



    //Silme işlemi

    meyveler.removeAt(1)

    println(meyveler)

    meyveler.clear()

    println(meyveler)


}