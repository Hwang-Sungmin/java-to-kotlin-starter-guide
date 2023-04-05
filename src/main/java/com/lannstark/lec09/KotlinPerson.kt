package com.lannstark.lec09

import java.lang.IllegalArgumentException


fun main() {
    KotlinPerson()
}


// 생성자(=constructor)는 생략이 가능
// 선언부는 자동으로 public으로 인식
// Java 객체 생성과는 달리 getter / setter는 자동으로 만들어 진다.

class KotlinPerson(
    // 주생성자 (primary constructor)
    name: String = "황성민",
    var age: Int = 18
) {
    var name = name
        set(value){
            field = value
        }

    // 초기화 시점에 한 번 불러오는 함수
    init {
        if(age <=0){
            throw IllegalArgumentException("나이는 ${age}일 수 없습니다")
        }
        println("초기화 블록")
    }
    // Java의 오버라이딩을 Kotlin에서는 아래와 같이 나타냄
    // 부생성자 (secondary constructor) -> 있을 수도 없을 수도.. 
    constructor(name: String): this(name, 1){
        println("첫 번째 부생성자")
    }
    
    constructor(): this("홍길동"){
        println("두 번째 부생성자")
    }


}