package com.ekaterinabaygin.myhomework1


    sealed class Transport {
        data class Car(val brand: String, val model: String) : Transport()
        data class Bicycle(val type: String) : Transport()
    }





