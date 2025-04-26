package com.example.myapplication.nesne_tabanli_programlama

data class Yemekler(var id:Int, var ad:String, var fiyat:Int) {
    //Constructor - init methodu
    // Bu sıb-nıftan bir nesne oluşturuldugunda çalışsın istiyorsak
    init {
        println("******** Nesne Oluşturuldu ********")
    }


    fun bilgiAl(){
        println("----------------------")
        println("Id : ${this.id}")
        println("Ad : ${this.ad}")
        println("Fiyat : ${this.fiyat}")

    }
    // bir sınıfnı başına data eklenince
    // this : Bulundugu sınıfı temsil eder
    //super : Kallıtım ile bir üst sınıfı temsil eder
}