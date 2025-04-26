package com.example.myapplication.nesne_tabanli_programlama

fun main() {
    //var olan yapıyı genişletmek extension denir

    val sonuc = 5 carp 2//5.carp(2)
    println(sonuc)

}

infix fun Int.carp(sayi: Int): Int{
    return this * sayi //thıs(Int)
}