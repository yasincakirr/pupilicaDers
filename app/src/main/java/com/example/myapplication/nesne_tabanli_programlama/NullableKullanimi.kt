package com.example.myapplication.nesne_tabanli_programlama

fun main() {
    //Nullable, Null Safety, Optional(Swift)
    //Genellikle mobil uygulama geliştirme dillerinde yer alır

    //1. Tanımlama
    var mesaj: String? = null
    var mesaj2: String? = null


    mesaj = "Merhaba"
    //mesaj2 = "Merhaba"


    //Yöntem 1
    println("Yontem 1 : ${mesaj.uppercase()}")


    println("Yontem 2 : ${mesaj2?.uppercase()}")
    // !! kesinlikle null degil
    //? nullable olabilir uygulamanın çökmemesi iiiçin lazım





    //yöntem 3 null kontrolü

    if(mesaj2 != null){
        println("Yöntem 3 : ${mesaj2.lowercase()}")
    }
    else{
        println("Degişkende null yer almaktadir")
    }



    //null kontrolu
    //mesaj null degilse bu blok çalışır
    mesaj?.let {
        println(mesaj2)
    }


}