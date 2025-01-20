package com.example.toygry.studykotlin.ch02

fun max (a:Int, b:Int) :Int =
    if (a>b) {
        a
    } else {
        b
    }

fun repeat(str: String, num: Int =3, newLine:Boolean = true){
    for (i in 1..num) {
        if(newLine) {
            println(str)
        } else {
            println(str)
        }
    }
}

fun main() {
    printAll("A","B","C")

    val array = arrayOf("A","B","C")
    printAll(*array)
}
// 가변인자
fun printAll(vararg strings:String) {
    for(str in strings){
        println(str)
    }
}