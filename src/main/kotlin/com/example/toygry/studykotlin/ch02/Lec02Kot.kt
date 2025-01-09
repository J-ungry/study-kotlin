package com.example.toygry.studykotlin.ch02

fun main () {

    val numbers = listOf(1L,2L,3L)
    for (number in numbers) {
        println(number)
    }

    for (i in 1..3) {
        println(i)
    }

    for (i in 3 downTo 1 step 2) {
        println(i)
    }

    // while 문은 자바랑 동일하다 !!!
    var i = 1
    while (i <= 10) {
        println(i)
        i++
    }
}