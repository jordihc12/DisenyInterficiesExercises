package com.example.Classes

fun main()
{

}

fun findTheFarthest(celestialBodies: List<CelestialBody>):CelestialBody
{
    var farthestBody = celestialBodies[0]
    for (i in 1 until celestialBodies.size)
    {
        if(farthestBody.distanceToEarth < celestialBodies[i].distanceToEarth) farthestBody = celestialBodies[i]
    }

    return farthestBody
}

fun filterByGalaxy(stars:List<Star?>, galaxy: Galaxy) :List<Star>
{
    val listOfStars:MutableList<Star> = mutableListOf()

    for (i in stars.indices)
    {
        val star = stars.elementAtOrNull(i)
        if((star?.belongsTo ?: continue) == galaxy)
        {
            listOfStars.add(star)
        }
    }

    return listOfStars
}