package com.example.toygry.studykotlin.ch01

class Lec03Kotlin {

    fun main() {
        val int = 1 // Int 로 간주
        val long = 2L // Long
        val float = 4.0f // Float
        val double = 5.0 // Double

        // Kotlin 에서 타입 변화는 명시적으로 이루어져야한다
        val number : Long = int.toLong()

        // Any 는 Java의 Object 역할이다 모든 객체의 최상위 타입
        // Unit : void (생략 가능)
        // Nothing 함수가 정상적으로 끝나지 않는다는 사실 !

        val name = "정구리"
        // ${} 써도 되는데 간단한거 쓸때는 그냥 $name 만 써도됨
        val log = "이름은 $name 입니다"

        val str = """
            trimIndent 쓰면
            줄바꿈 해서 쓸 수 있삼
        """.trimIndent()

        val abc = "ABC"
        println(abc[0])
    }



}