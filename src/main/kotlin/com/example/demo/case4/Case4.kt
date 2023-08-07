package com.example.demo.case4

@NoArg
class Case4(
    private var itWillBeC: String?
){
    init {
        itWillBeC = "C"
    }

    fun print() {
        println(itWillBeC)
    }
}

annotation class NoArg