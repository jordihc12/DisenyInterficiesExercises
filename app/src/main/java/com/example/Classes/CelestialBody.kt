package com.example.Classes

open class CelestialBody(var distanceToEarth: Double,
                    var positionInSky:Double,
                    val isVisibleToNakedEye:Boolean ,
                    val name: String)
{
    open protected fun printName()
    {
        println(name)
    }
}