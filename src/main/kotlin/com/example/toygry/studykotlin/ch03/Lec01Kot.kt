package com.example.toygry.studykotlin.ch03

//기본이 public 이라 생략 가능
public class Lec01Kot constructor(name: String, age:Int) {

    // 프로퍼티 = field + getter + setter
    // kotlin 에서는 field 를 만들면 자동으로 만들어줌
    // 앞에 val 이 붙으ㅕ면 자동으로 프로퍼티를 만들어줌 setter 빼고
    val name : String = name
    // var 되면 setter 도 만들어줌
    var age: Int = age
}


class Person(val name: String, var age:Int) {
    // class 가 초기화 되는 시점에 한번 호출됨 class 생성 시점에 검증
    init {
        if (age <=0) {
            throw  IllegalArgumentException("age must be greater than 0")
        }
        println("init")
    }

    // 두번쨰, 세번째 생성자는 constructor 아래에 만들어짐 => 주 생성자를 호출해야함
    constructor(name: String):this(name,1){
        println("constructor called")
    }

    // 두번째 생성자 호출 -> 주 생성자 호출
    constructor():this("구리구리구리"){
        println("constructor called222")
    }

    fun isAdult(): Boolean {
        return this.age >= 20
    }

    val isAdult: Boolean
        get() = this.age>=20

    companion object {
        fun of(name: String, age: Int): Person {
            return Person(name, age)
        }
    }


}

// 프로퍼티로 안만들어서 getter 자동으로 안만들어지도록함
class Person2(name: String="구리", var age : Int) {
    // 주생성자에서 받은name name.uppercase 하면 name 안에 get 무한루프 ! 그래서 field 사용
    val name = name
        get() = field.uppercase()

    val uppercaseName : String
        get() = this.name.uppercase()
}

fun main() {
    val person  = Person("구리",100)
    println(person.age)
    person.age = 25

    // Java 로 만들어진 class 여도 getter setter 없이 쓸 수 있다

    val person2 = Person("구리구리")
    print(person2.age)

    val person3 = Person()
}

// converting 같은 경우에 부 생성자를 사용할 수 있지만 정적 팩토리 메소드를 추천함



class Pig(name: String, age:Int) {
    constructor(): this("구리",1)
}
