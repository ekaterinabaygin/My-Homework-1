package com.ekaterinabaygin.myhomework1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun main() {
        val car = Transport.Car("Toyota", "Camry")
        val bicycle = Transport.Bicycle("Mountain")

    }
}