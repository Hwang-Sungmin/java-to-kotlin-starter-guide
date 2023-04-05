package com.lannstark.lec08


fun main() {
    printAll("a", "b", "c")
    //배열일때
    var array = arrayOf("A", "B", "C")

    printAll(*array)
}

// expression은 아래와 같이 하나로 표현 가능
fun max(a: Int, b: Int) = if (a > b) a else b

// Java의 com.lannstark.lec08.repeat() 아래처럼 변경
fun repeat(str: String, num: Int = 3, useNewLine: Boolean = true) {
    for (i in 1..num) {
        if (useNewLine) {
            println(str)
        } else {
            print(str)
        }
    }
}

fun printAll(vararg strings: String) {
    for (str in strings) {
        println(str)
    }
}