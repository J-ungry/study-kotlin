package com.example.toygry.studykotlin.ch03

// 추상이랑 인터페이스 모두 : 뒤에
class Penguin(
    species: String
) : Animal(species,2) , Swimable, Flyable{

    private val wingCount: Int = 2
    override fun move() {
        println("Moving $species")
    }

    // getter 오버라이드는 어떻게 할 수 있냐면
    // 프로퍼티에 getter 가 붙어있으니까 프로퍼티를 오버라이드 해야한다
    // 이때 프로퍼티를 오버라이드 하려면 무조건 open 을 붙여줘야한다
//    override val leg: Int
//        // 상위 클래스는 super ! java 랑 동의
//        get() = super.leg + this.wingCount

    // 중복돼ㅣ는 인터페이스 특정시에는 super<타입>.함수
    override fun act() {
        super<Swimable>.act()
        super<Flyable>.act()
    }

}

// 추상클래스는 인터페이스화 할 수 없다