package com.example.myapplication.odev2

class Odev2Method() {

    //Method 1
    fun derecedenCevir (derece:Int) :Double{
        var fahrenayt = (derece*1.8) + 32
        return fahrenayt
    }


    //Method 2
    fun cevreBulma ( kisaKenar: Int,uzunKenar:Int) : Int{
        val cevre = kisaKenar*2 + uzunKenar*2
        return cevre
    }


    //Method 3
    fun fakteriyelAl( sayi : Int){

        var sonuc = 1

        for (i in sayi downTo  1){
            sonuc *= i

        }
        println(sonuc)
    }



    //Method 4
    fun aHarfiBulma (ifade : String): Int{

        var aSayisi =0

        for(harf in ifade){
            if (harf == 'A' || harf == 'a'){
                aSayisi++
            }
        }


        return aSayisi
    }



    //Method 5
    fun icAcilariToplami ( kenarSayisi: Int){

        var icAcilarToplami = (kenarSayisi-2) * 180

        println(icAcilarToplami)
    }


    //Method 6
    fun maasHesabi(gunSayisi: Int){

        var ucret = 0
        var saat = gunSayisi * 8

        if(saat <= 160 && saat > 0){
             ucret = saat * 10
        }
        else if (saat > 160){
             ucret = 160 * 10

            var mesaiSaat = saat - 160

            ucret = ucret + (mesaiSaat * 20)
        }
        else{
            println("Gecersiz Bir Deger Girildi")
        }

        println(ucret)

    }



    //Method 7
    fun kotaMiktari (kullanilanKota: Int):Int{

        if(kullanilanKota <= 50 && kullanilanKota > 0){
            return 100
        }
        else if (kullanilanKota > 50){
            var asimMiktari = kullanilanKota-50

            return 100 + asimMiktari*4

        }
        else{
            return 0
        }


    }


}