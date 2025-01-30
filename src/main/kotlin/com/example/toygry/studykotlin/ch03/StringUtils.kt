package com.example.toygry.studykotlin.ch03

fun isDirPath(path: String) : Boolean {
    return path.startsWith("/")
}

/*
Java 에선 유틸성 코드 만들때 abstract class + private constructor 를 사용해서 인스턴스화

public abstract class StringUtils {
    private StringUtils() {}

    public boolean isDirPath(String path) {
        return path.endsWith("/");
    }
}

kotlin 에서는 상단에 적기
 */