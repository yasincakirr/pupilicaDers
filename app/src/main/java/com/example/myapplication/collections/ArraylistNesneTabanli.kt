package com.example.myapplication.collections


fun main() {
    val f1 = Filimler(1,"Babam ve Oglum",50)
    val f2 = Filimler(2,"Neseli Hayatlar",30)
    val f3 = Filimler(3,"Kis Uykusu",80)



    val filimlerListesi = ArrayList<Filimler>()

    filimlerListesi.add(f1)
    filimlerListesi.add(f2)
    filimlerListesi.add(f3)


    println(filimlerListesi)

    for (film in filimlerListesi){
        println("${film.id} :${film.ad} ${film.fiyat} TL" )
    }



    //siralama
    println("---------Fiyata göre artan")

    val siralama1 = filimlerListesi.sortedWith( compareBy{it.fiyat })
    for (film in siralama1){
        println("${film.id} :${film.ad} ${film.fiyat} TL" )
    }

    println("---------Fiyata göre azalan")

    val siralama2 = filimlerListesi.sortedWith( compareByDescending{it.fiyat })
    for (film in siralama2){
        println("${film.id} :${film.ad} ${film.fiyat} TL" )
    }



    println("---------Z - A")

    val siralama3 = filimlerListesi.sortedWith( compareByDescending{it.ad })
    for (film in siralama3){
        println("${film.id} :${film.ad} ${film.fiyat} TL" )
    }


    //Filtreleme

    println("---------Filtreleme 1---------")
    val filtreleme1 = filimlerListesi.filter { it.fiyat >40 }

    for (film in filtreleme1){
        println("${film.id} :${film.ad} ${film.fiyat} TL" )
    }


    println("---------Filtreleme 2---------")
    val filtreleme2 = filimlerListesi.filter { it.ad.contains("at") }

    for (film in filtreleme2){
        println("${film.id} :${film.ad} ${film.fiyat} TL" )
    }

}