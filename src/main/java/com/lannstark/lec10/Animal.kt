package com.lannstark.lec10

abstract class Animal(
    protected val species: String,
    // open 이유 : 추상 프로퍼티가 아니라면, 상속받을때 open을 꼭 붙여야 한다.
    protected open val legCount: Int,
) {
    abstract fun move()
}
