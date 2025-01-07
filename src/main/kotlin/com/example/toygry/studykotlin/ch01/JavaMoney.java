package com.example.toygry.studykotlin.ch01;

public class JavaMoney implements  Comparable<JavaMoney> {

    private final long amount;

    public JavaMoney(long amount) {
        this.amount = amount;
    }

    @Override
    public int compareTo(JavaMoney o) {
        return Long.compare(amount, o.amount);
    }
}
