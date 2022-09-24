package com.example.Classes

class Galaxy(distancetoEarth: Double, positionInSky: Double, name: String, val numberOfStars: Int, var currentLuminosity: Double) :
    CelestialBody(distancetoEarth, positionInSky, false, name)
{

}