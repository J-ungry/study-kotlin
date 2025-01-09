package com.example.toygry.studykotlin.ch02

// unit (void) 생략
fun validateScoreIsNotNegative(score : Int) {
    // 자바랑 완전 똑같아 ~
    if (score < 0) {
        throw IllegalArgumentException("Score must be greater than zero.")
    }

    // score 의 범뤼가 0~100 사이에 있지 않은 경우
    if (score !in 0..100) {
        throw IllegalArgumentException("Score must be between 0 and 100.")
    }
}

fun getPassOrFail(score: Int):String {
    if (score >= 50) {
        return "P"
    } else {
        return "X"
    }

}

// java is Statement, Kotlin is Expression
// 그래서 이런것도 된다 그래서 삼항연산자가 없삼 !
fun getPassOrFail2(score: Int):String {
    return if (score >= 50) {
        "p"
    } else {
        "F"
    }
}

fun getGradeWithSwitch(score: Int):String {
    // 조건부에는 어떠한 expression 이라도 들어갈 수 있다
    return when (score/10) {
        in 90..99 -> "a"
        in 80..89 -> "b"
        in 70 .. 79 -> "c"
        else -> "d"
    }
}
