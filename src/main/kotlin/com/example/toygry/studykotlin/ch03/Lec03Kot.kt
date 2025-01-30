package com.example.toygry.studykotlin.ch03

val a = 3

fun add (a:Int, b : Int):Int {
    return a+b
}

class Dog public constructor() {}

/*

Java
public : 모든 곳에서 접근 가능
protected : 같은 패키지 또는 하위 클래스에서만 접근
default : 같은 패키지에서만 접근 가능
private : 선언된 클래스 내에서만 접근 가능

Kotlin
public : 모든곳에서 접근 가능
protected : 선언된 클래스 또는 하위 클래스에서만 접근 가능
internal : 같은 모듈에서만 접근 가능
private : 선언된 클래스 내에서만 접근 가능

** 코틀린에서는 패키지라는 개념을 접근 제어에 사용하지 않는다
기본 접근 지시어는 public

* 파일
public : 기본값 어디서든 접근 가능
protected : 파일에는 사용 불가능 (클래스와 하위 클래스에서만 동작)
internal : 같은 모듈에서만 접근 가능
private : 같은 파일 내에서만 접근 가능

* 클래스
public : 모든곳
protected : 선언된 클래스
internal: 같은 모듈
private : 선언된클래스

* 생성자 (생성자에 접근 제어를 하려면 constructor 를 붙여줘야한다)
public :
protected :
internal:
private :

* 프로퍼티
public :
protected :
internal:
private :
 */