package com.example.toygry.studykotlin.ch01;

public class Lec02Java {

    public boolean startsWithA1(String str) {
        if (str == null) {
            throw new IllegalArgumentException("null");
        }

        return str.startsWith("a");
    }

    public Boolean startsWithA2(String str) {
        if (str == null) {
            return null;
        }

        return str.startsWith("a");
    }

    public boolean startsWithA3(String str) {
        if (str == null) {
            return false;
        }

        return str.startsWith("a");
    }


}
