package com.example.toygry.studykotlin.ch03

// cat class 만들때 species 생성자를 갖고
class Cat(
    species: String
    // 애니멀을 상속받고 생성자가 있으니까 값을 느준다
    // extend 아닌 : 를쓴다 컨벤션은 띄어쓰기 하기 , 타입은 없음
) : Animal(species, 4) {
    override fun move() {
        println("Moving $species")
    }


}