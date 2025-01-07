package com.example.toygry.studykotlin.ch01

fun main() {
    val str : String? = "ABC"
    println(str?.length) // null 이 허용되는 타입은 safe call(?.) null 이 아닌 경우에만 호출해줘 ~ 이렇게 된다
    // null 이 아니면 실행 Null 이면 그냥 Null

    str?.length ?: 0 // null 이면 0 아니면 str.length : elvis 연산자 ?: 엘비스 닮아서
}

fun startsWithA1(str : String?): Boolean {
    if (str == null) {
        throw IllegalArgumentException("null")
    }
    return str.startsWith("a")
}

fun startsWithA2(str : String?):Boolean? {
    if (str == null) {
        return null
    }
    return str.startsWith("a")
}

fun startsWithA3(str : String?):Boolean {
    if (str == null) {
        return false
    }
    return str.startsWith("a")
}

fun startsWithA4(str : String?): Boolean {
    return str?.startsWith("a") ?: throw IllegalArgumentException("str is null")
}

fun startsWithA5(str : String?): Boolean? {
    return str?.startsWith("a")
}

fun startsWithA6(str : String?): Boolean {
    return str?.startsWith("a") ?: false
}

fun startsWithA7(str : String?): Boolean {
    // 사실은 이게 어떤 경우에도 null 일 수 없다 !!
    return str!!.startsWith("a")
    // 이랬는데 null 이 들어오면 npe 가 터진다 ! 걍 있는거만 알고있음 될듯
}