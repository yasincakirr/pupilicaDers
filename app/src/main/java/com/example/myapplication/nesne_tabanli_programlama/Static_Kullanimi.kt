package com.example.myapplication.nesne_tabanli_programlama

fun main() {

    val a = ClassA()

    //Standart nesne tabalı erişim
    println(a.x)
    a.method()


    //Sanal nesne - Virtual Object - Nameless(İsimsiz) erişim bu kullanımda iki nesne oluşuyor üsttekinden performaslı degil
    println(ClassA().x)
    ClassA().method()



    //STATİC kullanım parantez yok nesne erişimi yok burada
    println(ClassA.y)
    ClassA.method2()


}