package com.example.toygry.studykotlin.ch01;

import java.util.Arrays;
import java.util.List;

public class Lec01Java {

    public static void main(String[] args) {
        long number = 10L;
        final long number2 = 10L;

        // Kotlin 에는 primitive 랑 reference type 구분이 없음
        // Kotlin 은 모두 Long 이다. 연산할때 내부에서 알아서 똑똑하게 primitive 타입으로 바꿔서 처리해준다
        Long number3 = 1_000L;

    }
}
