package com.lannstark.lec14


fun main(){
  handleCountry(Country.KOREA)
}

enum class Country(
    private val code: String
) {
    KOREA("KO"),
    AMERICA("US")
    ;
}

fun handleCountry(country: Country){
    when (country){
        Country.KOREA -> print("한국")
        Country.AMERICA -> print("미국")

    }
}