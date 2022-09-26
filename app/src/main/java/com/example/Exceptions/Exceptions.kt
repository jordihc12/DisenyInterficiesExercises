package com.example.Exceptions

var end = false

fun main()
{
    var value:Int = exercise1B()
        println(value)
}

fun makeSomeDangerousCalc():Int
{
    val randomNumber = (0..100).random()

    return if(randomNumber > 50) randomNumber else
        throw ArithmeticException()
}

fun exercise1A():Int
{
    val value = try {
        makeSomeDangerousCalc()
    }
    catch (e: ArithmeticException )
    {
        -1
    }

    return value
}

fun exercise1B():Int
{
    val value  = try {
        makeSomeDangerousCalc()
    }
    catch (e: ArithmeticException )
    {
        println("Error")
        exercise1B()
    }

    if(!end) end = true
    return value
}