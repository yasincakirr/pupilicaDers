package com.example.myapplication.stadart_programlama

fun main() {
    //1 2 3

    for (i in 1 .. 3){
        println("Dongu1 : $i")
    }

    //10 ile 20 arasında 5 er

    for (i in 10 .. 20 step 5){
        println("Dongu2 : $i")
    }


    //20 ile 10 arasında 5 er

    for (i in 20 downTo 10 step 5){
        println("Dongu3 : $i")
    }

    // While 1 2 3

    var sayac = 1


    while (sayac < 4){
        println("Dongu4 : $sayac")
        sayac+=1
    }


    // 1 2 3 4 5

    for (i in 1..5){
        if(i == 3){
            break //donguyu durdurur
        }

        println("Dongu5 : $i")
    }




    for (i in 1..5){
        if(i == 3){
            continue //Bulundugu adımı pas geçer
        }

        println("Dongu6 : $i")
    }




}