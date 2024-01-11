package com.ekaterinabaygin.myhomework1


    sealed class Transport {
        data class Car(val brand: String, val model: String) : Transport()
        data class Bicycle(val type: String) : Transport()
    }


fun describeTransport(transport: Transport) {
    when (transport) {
        is Transport.Car -> println("It's a ${transport.brand} ${transport.model} car.")
        is Transport.Bicycle -> println("It's a ${transport.type} bicycle.")
    }
}


