package com.lannstark.lec11

import com.lannstark.lec16.lastChar

class KStringUtils {


}

fun isDirectoryPath(path: String): Boolean {
    return path.endsWith("/")
}

fun String.lastChar(): Char {
    return this[this.length - 1]
}