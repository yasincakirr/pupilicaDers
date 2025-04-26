package com.example.myapplication.nesne_tabanli_programlama

fun main() {
    val f =Fonksiyonlar()


    //Void - sadece işlem yapan
    f.selamla1()


    //return
    val gelenSonuc = f.selamla2()
    println("Gelen Sonuc : $gelenSonuc")


    //parametre
    f.selamla3("Yasin")



    f.topla(1,3,"Yasin")


}