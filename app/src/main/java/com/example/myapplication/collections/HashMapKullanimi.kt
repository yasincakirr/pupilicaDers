package com.example.myapplication.collections

fun main() {
    //HASH MAP json veri modeline benzemektedir

    val iller = HashMap<Int,String>()

    iller.put(27,"Gaziantep")
    iller[34] = "İstanbul"
    iller[6] = "Ankara"
    println(iller)


    iller[6] = "yeni Ankara"
    println(iller)

    var il = iller[6]

    println(il)

    println("Boyut : ${iller.size}")


    for ((anahtar,deger) in iller){
        println("$anahtar -> $deger")
    }

    iller.remove(34)
    println(iller)

    iller.clear()
    println(iller)



}