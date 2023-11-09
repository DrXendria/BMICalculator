package com.example.myapplication

import java.util.Scanner

fun main(){
    val scn = Scanner(System.`in`)

    println("Boyunuzu metre cinsinden giriniz:(Örnek:1,71)")
    val boy = scn.nextDouble()
    println("Kilonuzu kilogram olarak giriniz:")
    val kilo = scn.nextDouble()

    if (kilo <= 0 || boy <= 0) {
        println("Hatalı giriş. Lütfen pozitif sayılar girin.")
        return
    }

    val bmi : Double  = kilo / (boy*boy)


    val durum = when{
        bmi <= 18.5 -> "Zayıf"
        bmi <= 24.9 -> "Normal"
        bmi <= 29.9 -> "Fazla Kilolu"
        bmi <= 34.9 -> "1.Derece Obezite"
        bmi <= 40 -> "2.Derece Obezite"
        bmi <= 50 -> "3.Derece Obezite / Morbid Obezite"
        bmi <= 60 -> "Süper Obezite"
        bmi <= 70 -> "Süper Süper Obezite"


        else -> ("Git diyet yap lütfen sağlığın için.")

    }
    println("BMI: $bmi")
    println("Durum: $durum")



}