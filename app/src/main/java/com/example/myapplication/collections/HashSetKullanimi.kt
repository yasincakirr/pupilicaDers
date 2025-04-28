package com.example.myapplication.collections

fun main() {

    var meyveler = HashSet<String>()
    //any demek en üst sınıf demektir bütün türleri kapsar


    meyveler.add("Elma")
    meyveler.add("Muz")
    meyveler.add("Kiraz")

    println(meyveler)

    meyveler.add("Elma")
    println(meyveler)

    meyveler.add("Amasya Elmasi")

    println(meyveler)

    val y = meyveler.elementAt(2)
    println(y)


    println("Boyut : ${meyveler.size}")


    for(meyve in meyveler){
        println(meyve)
    }


    for((index,meyve) in meyveler.withIndex()){


        println("$index -> $meyve")

    }


    meyveler.remove("Elma")
    println(meyveler)


    meyveler.clear()

    println(meyveler)


}