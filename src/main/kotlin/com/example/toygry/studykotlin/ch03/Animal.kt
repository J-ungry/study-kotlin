package com.example.toygry.studykotlin.ch03

abstract class Animal(
    val species: String,
    val leg: Int
) {

    fun getLeg() :Int = leg
    abstract fun move()
}