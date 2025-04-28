package com.example.myapplication.nesne_tabanli_programlama.kalitim

class Kopek : Memeli() {
    //overriding kalıtım ilişkisi ve interface ilişkisinde kullanılır

    override fun sesCikar() {
        println("hav")
    }
}