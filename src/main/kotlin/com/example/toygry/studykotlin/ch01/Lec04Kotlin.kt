package com.example.toygry.studykotlin.ch01

class Lec04Kotlin {
    fun main() {
        // 연산자 연산자
        val money1 = JavaMoney(2_000L)
        val money2 = JavaMoney(3_000L)
        val money3 = money1

        // 비교 연산자 쓰면 자동으로 compareTo 를 호출해줌 겁나 똑똑
        if (money1 > money2) {
            println("money1 이 더 큼 !")
        }

        // Java 는 동일성에 == 동등성에 equals
        // Kotlin 은 동일성에 === 동등성에 ==  == 쓰면 간접적으로 equals 를 호출해줌

        println(money1 === money3)
        println(money1 == money2)

    }
}