package com.example.myapplication.nesne_tabanli_programlama

class Fonksiyonlar {

    //void -- sadece işlem yapan
    fun selamla1(){
        val sonuc = "Merhaba Ahmet"
        println(sonuc)
    }


    //return -- hem işlem yapan hem veri transferi
    fun selamla2(): String{
        val sonuc = "Merhaba Ahmet"
        return sonuc
    }


    //parametre
    fun selamla3(isim : String){
        val sonuc = "Merhaba  $isim"
        println(sonuc)
    }


    //Overloading
    //Bir sınıf içerisinde aynı isimde fonksiyonları tekrar kullanma

    fun topla(sayi1:Int,sayi2:Int){
        println("Toplam  : ${sayi1 + sayi2}")
    }

    fun topla(sayi1:Double,sayi2:Double){
        println("Toplam  : ${sayi1 + sayi2}")
    }

    fun topla(sayi1:Int,sayi2:Int,isim: String){
        println("Toplam  : ${sayi1 + sayi2} işlemiYapan $isim" )
    }



}