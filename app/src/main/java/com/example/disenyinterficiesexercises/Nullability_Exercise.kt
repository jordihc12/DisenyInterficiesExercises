package com.example.disenyinterficiesexercises

import kotlin.random.Random

fun main()
{
    var n:Int? = null
    var s = "21"
    val i = 203
    var j: Int? = 408
    val l1= listOf(1, null, 2)
    val l2 = listOf(1, 5,2)

//    n?.plus(i) === null
//    n ?: 0 === 0
//    (n?:0) + 3 === 3
//    n + i === error
//    i + j === 611
//    s + n === error
//    l1[2] + 3 = 5
//    l2[2] + 3 = 5

//Exercise 2
    val resultSum = nullSafetySum(null, 5)
    println(resultSum)

    //    val list: List<Int?>? = null
    val list: List<Int?>? = listOf(1,2,null,6, 7)

//Exercise 3
    val resultAverage = nullSafetyAverage(list)
    println(resultAverage)

//Exercise 4
    val resultNull = nullControlAverage(list)
    println(resultNull)

//Exercise 5
    println("Odd Exercise")

    val listOdd: List<Int?> = listOf(1,2,5,6, 7, 13 , null)

    printOnlyOdds(listOdd)
}

//Exercise 2
fun nullSafetySum(a: Int?, b:Int?):Int
{
    return a?:0.plus(b ?:0 )
}

//Exercise 3
fun nullSafetyAverage(list: List<Int?>?):Double
{
    if(list == null) return 0.0

    var count = 0
    var value = 0.0

    for (i in 0 until (list?.size ?: 0))
    {
        value = value.plus(list?.elementAtOrNull(i)?.toDouble() ?:0.0)
        count++;
    }

    return value.div(count)
}

//Exercise 4
fun nullControlAverage(list: List<Int?>?):Double?
{
    if(list == null) return null

    var count = 0
    var value = 0.0

    for (i in 0 until (list?.size ?: 0))
    {
        if(list.elementAtOrNull(i) == null) return null
        value = value.plus(list.elementAtOrNull(i)?.toDouble() ?: 0.0)
        count++;
    }

    return value.div(count)
}

//Exercise 5
fun printOnlyOdds(list:List<Int?>)
{
    for (i in 0 until list.size)
    {
        if((list?.elementAtOrNull(i)?: 0.0).toDouble().mod(2.0) == 1.0) println(list.elementAtOrNull(i))
    }
}

//Exercise 6
fun replaceNulls(matrix: List<List<Int?>>):List<List<Int>>
{
    val mutableList : MutableList<MutableList<Int>> = mutableListOf()
    for (i in 0 until matrix.size)
    {
        for (j in 0 until matrix[i].size)
        {
            mutableList[i].add(matrix[i]?.elementAtOrNull(j) ?: Random.nextInt())
        }

    }
    val returnMatrix :List<List<Int>> = mutableList

    return returnMatrix
}