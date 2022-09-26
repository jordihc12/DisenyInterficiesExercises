package com.example.Classes

open class CelestialBody(var distanceToEarth: Double,
                         protected var positionInSky:Double,
                         protected val isVisibleToNakedEye:Boolean,
                         private val name: String)
{
    protected open fun printName()
    {
        println(name)
    }
}