package com.lannstark.lec10

fun main() {

    Derived(100)

}
// 상위 클래스는 하위 클래스의 field에 접근하면 안 된다.!!!!
open class Base(open val number: Int = 100){
    init {
        println("Base Class")
        println(number)
    }
}
// 상속은 : <- 콜론 연산자
class Derived(
    override val number: Int
) : Base(number){
    init {
        println("Derived Class")
    }
}