package com.ekaterinabaygin.myhomework1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

val car = Transport.Car("Toyota", "Camry")
val bicycle = Transport.Bicycle("Mountain")


