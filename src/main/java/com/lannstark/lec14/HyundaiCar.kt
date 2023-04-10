package com.lannstark.lec14

fun main(){

}
sealed class HyundaiCar(
    val name: String,
    val price: Long
)

class Avant : HyundaiCar("아반떼", 1_000L)

class Sonata : HyundaiCar("소나타", 2_000L)

class Grandeur : HyundaiCar("그렌저", 3_000L)

fun handleCar(car: HyundaiCar){
    when(car){
        is Avant -> TODO()
        is Grandeur -> TODO()
        is Sonata -> TODO()
    }
}