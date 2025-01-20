package com.example.toygry.studykotlin.ch02

fun paresIntOrThrow(str: String) : Int {
    try {
        return str.toInt()
    } catch(e: NumberFormatException) {
        throw IllegalArgumentException(e)
    }
}

fun parseIntOrThrowV2(str: String) : Int? {
    return try {
        str.toInt()
    } catch (e: NumberFormatException) {
        null
    }
}