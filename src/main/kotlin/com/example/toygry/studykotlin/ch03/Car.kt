package com.example.toygry.studykotlin.ch03

class Car(
    // getter 를 internal
    internal val name: String,

    // get,set 을 private
    private var owner: String,
    _price: Int
) {
    // set 만 private
    var price = _price
    private set
}

// price 에 _ 를 붙이는 이유 : 배킹 프로퍼티 패턴을 따르기 때문
/*
백킹 프로퍼티란 실제 데이터를 저장하는 변수를 따로 두고 이를 감싸는 공개된 프로퍼티를 제공하는 패턴
외부에서는 직접 접근하지 못하고 특정한 방식으로만 값을 읽거나 수정하도록 제한 가능
_price는 진짜 데이터를 저장하는 변수이고,
price는 외부에 노출되는 프로퍼티야.
price는 읽기만 가능하고, setter를 private으로 막음.
 */