package com.example.myapplication.odev2

fun main() {


    var methodlar = Odev2Method()

    println(methodlar.derecedenCevir(50))


    var cevre = methodlar.cevreBulma(2,3)

    println("Cevre : $cevre")



    methodlar.fakteriyelAl(7)


    var aHarfiSayisi = methodlar.aHarfiBulma("safafdsvafAADAVDbggrd")

    println(aHarfiSayisi)




    methodlar.icAcilariToplami(5)



    methodlar.maasHesabi(10)
    methodlar.maasHesabi(50)
    methodlar.maasHesabi(1)
    methodlar.maasHesabi(19)
    methodlar.maasHesabi(-5)
    methodlar.maasHesabi(25)
    methodlar.maasHesabi(100)






    println(methodlar.kotaMiktari(55))
    println(methodlar.kotaMiktari(50))
    println(methodlar.kotaMiktari(25))
    println(methodlar.kotaMiktari(75))
    println(methodlar.kotaMiktari(-5))
}