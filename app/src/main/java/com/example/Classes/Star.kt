package com.example.Classes

class Star (distancetoEarth: Double, positionInSky: Double, name: String, var todaySurfaceTemperature: Double, val coreTemperature: Double) :
    CelestialBody(distancetoEarth, positionInSky, false, name)
{
    private fun countNumberOfPlanetsOnOrbit() : Int
    {
        var numOfPlanets: Int = 0

        return numOfPlanets
    }

    override fun printName()
    {
        print("Star Name: ")
        super.printName()
    }
}