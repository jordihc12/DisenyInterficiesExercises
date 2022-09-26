package com.example.Classes

class Galaxy(distanceToEarth: Double,
             positionInSky: Double,
             name: String,
             val numberOfStars: Int,
             var currentLuminosity: Double) :
    CelestialBody(distanceToEarth, positionInSky, false, name)
{

}