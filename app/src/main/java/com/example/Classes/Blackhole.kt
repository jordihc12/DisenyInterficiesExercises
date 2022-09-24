package com.example.Classes

class Blackhole(distancetoEarth: Double, positionInSky: Double, name: String, var rotationVelocity: Double, val mass: Double) :
    CelestialBody(distancetoEarth, positionInSky, false, name)
{
    private fun calculateSchwarzschildRadius() : Double?
    {
        var returnValue: Double? = null
        return returnValue
    }
}