package com.example.Sintaxi

fun main() {
    val l1 = listOf(1, 2, 3)
    val l2 = listOf(4, 5, 6)

    val anyList = listOf(1, 6,65,3,5,787,12)

    //intercalar(l1, l2)
    reverse(anyList)
}

//Exercise 1
fun salute()
{
    println("Hello Jordi")
}

//Exercise 2
fun printTwoInts(a:Int, b:Int)
{
    println("${a}, ${b}")
}

//Exercise 3
fun intercalar(l1: List<Int>, l2: List<Int>)
{
    var size = if(l1.size > l2.size)
        l2.size
    else
        l1.size

    for(i in 0 until size)
    {
        print("${l1[i]}, ${l2[i]}, ")
    }
    println()
}

//Exercise 4
fun reverse (list :List<Any>)
{
    for(i in list.size - 1 downTo 0)
    {
        println(list[i])
    }
    println()
}

//Exercise 5
fun reverseMatrix(list:List<List<Any>>)
{
    for(i in list.size - 1 downTo 0)
        for(j in list[i].size - 1 downTo 0)
            println(list[i][j])
}