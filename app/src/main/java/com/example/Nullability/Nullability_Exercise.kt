package com.example.Nullability

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
//    n + i === error --> (n?:0) + i === i
//    i + j === error --> i + (j?:0) === 611
//    s + n === error
//    l1[2] + 3 = error --> (l1[2]?:0) + 3 = 5
//    l2[2] + 3 = 5

//Exercise 2
    println("Exercise 2: ")
    val resultSum = nullSafetySum(null, 5)
    println(resultSum)

    //    val list: List<Int?>? = null
    val list: List<Int?>? = listOf(1,2,null,6, 7)

    println()
//Exercise 3
    println("Exercise 3: ")
    val resultAverage = nullSafetyAverage(list)
    println(resultAverage)

    println()
//Exercise 4
    println("Exercise 4: ")
    val resultNull = nullControlAverage(list)
    println(resultNull)

    println()
//Exercise 5
    println("Exercise 5: Odd Exercise")

    val listOdd: List<Int?> = listOf(1,2,5,6, 7, 13 , null)

    printOnlyOdds(listOdd)

//Exercise 6
    println("Exercise 6:")

    val matrixNullable:List<List<Int?>> = listOf(
                                            listOf(1, 20, null),
                                            listOf(2, null)
                                                )
    println(replaceNulls(matrixNullable))
}

//Exercise 2
fun nullSafetySum(a: Int?, b:Int?):Int
{
    return a?:0.plus(b ?:0 )
}

//Exercise 3
fun nullSafetyAverage(list: List<Int?>?):Double
{
    if(list.isNullOrEmpty()) return 0.0

    var count = 0
    var value = 0

    for (i in list.indices)
    {
        value += list[i]?:0
        if(list[i] != null)
            count++;
    }

    return value.toDouble().div(count)
}

//Exercise 4
fun nullControlAverage(list: List<Int?>?):Double?
{
    if(list == null) return null

    var count = 0
    var value = 0.0

    for (i in list.indices)
    {
        value += list[i] ?: return null
        count++;
    }

    return value.div(count)
}

//Exercise 5
fun printOnlyOdds(list:List<Int?>)
{
    for (i in list.indices)
    {
        if((list?.elementAtOrNull(i)?: 0.0).toDouble().mod(2.0) == 1.0) println(list.elementAtOrNull(i))
    }
}

//Exercise 6
fun replaceNulls(matrix: List<List<Int?>>):List<List<Int>>
{
    val mutableList : MutableList<MutableList<Int>> = mutableListOf()
    for (i in matrix.indices) {
        mutableList.add(mutableListOf())
        for (j in matrix[i].indices) {
            mutableList[i].add(matrix[i][j] ?: Random.nextInt(0, 200))
        }
    }
    return mutableList
}