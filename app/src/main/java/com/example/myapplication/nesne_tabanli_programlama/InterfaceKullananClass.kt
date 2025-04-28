package com.example.myapplication.nesne_tabanli_programlama

class InterfaceKullananClass() : MyInterface {

    override var degisken: Int =100

    override fun method1() {
        println("Method 1 Çalıştı")
    }

    override fun method2(): String {
    return "Method 2 calisti"
    }
}