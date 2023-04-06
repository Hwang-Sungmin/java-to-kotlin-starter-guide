package com.lannstark.lec12

fun main(){
    println(Singleton.a)
    Singleton.a += 10
    println(Singleton.a)
}


class Person private constructor(
    var name: String,
    var age: Int
) {
    // static 대신에 사용
    // 이름을 붙여서 사용이 가능 (interface)로 구현 가능
    companion object Factory : Log {
        // compile시 값이 할당 된다. 만약 const 값 없으면 runtime시 값이 할당.
        private const val MIN_AGE = 1

        @JvmStatic
        fun newBaby(name: String): Person {
            return Person(name, MIN_AGE)
        }

        override fun log() {
            println("강의가 엄청 불친절 함")
        }
    }
}

object Singleton {
    var a: Int = 0;
}