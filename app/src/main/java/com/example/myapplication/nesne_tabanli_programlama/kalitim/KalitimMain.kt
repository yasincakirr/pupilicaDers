package com.example.myapplication.nesne_tabanli_programlama.kalitim

fun main() {
    val hayvan = Hayvan()
    val memeli = Memeli()
    val kedi = Kedi()
    val kopek = Kopek()





    hayvan.sesCikar() // Kalıtım yok kendi fonk erişiyor
    memeli.sesCikar() // Kalıtım var ,bir üst sınıfın methoduna erişim
    kedi.sesCikar() //kalıtım var kendi fonk
    kopek.sesCikar() //kalıtım var kendi fonk


}