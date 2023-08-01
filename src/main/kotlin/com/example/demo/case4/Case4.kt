package com.example.demo.case4

@Case4Anno
class Case4(
    var a: String?
){
    init {
        a = "C"
    }

    fun print() {
        println(a)
    }
}

annotation class Case4Anno