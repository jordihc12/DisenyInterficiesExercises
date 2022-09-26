package com.example.Classes

import kotlin.math.pow

class Blackhole(distanceToEarth: Double,
                positionInSky: Double,
                name: String,
                var rotationVelocity: Double,
                private val mass: Double) :
    CelestialBody(distanceToEarth, positionInSky, false, name)
{
    companion object{
        val gravity = 6.67 * 10.0.pow(-11.0)
        val lightVelocity = 3 * 10.0.pow(8.0)
    }

    private fun calculateSchwarzschildRadius() : Double?
    {
        if(rotationVelocity != 0.0) return null

        return (2 * gravity * mass) / lightVelocity.pow(2.0)
    }
}