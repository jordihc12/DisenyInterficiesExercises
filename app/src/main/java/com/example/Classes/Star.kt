package com.example.Classes

import kotlin.random.Random

class Star (distanceToEarth: Double,
            positionInSky: Double,
            name: String,
            var todaySurfaceTemperature: Double,
            val coreTemperature: Double,
            var belongsTo: Galaxy?) :
    CelestialBody(distanceToEarth, positionInSky, false, name)
{
    private fun countNumberOfPlanetsOnOrbit() : Int
    {
        return Random.nextInt()
    }

    override fun printName()
    {
        print("Star Name: ")
        super.printName()
    }
}