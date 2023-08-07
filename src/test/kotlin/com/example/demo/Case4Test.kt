package com.example.demo

import com.example.demo.case4.Case4
import org.junit.jupiter.api.Test
import kotlin.reflect.full.createInstance

class Case4Test {
    @Test
    fun kotlinWay() {
        val case4 = Case4::class.createInstance()
        //val case4  = Case4::class.primaryConstructor!!.call("B")
        case4.print()
    }

    @Test
    fun javaWay() {
        val clazz = Class.forName("com.example.demo.case4.Case4")
        val case4 = clazz.getDeclaredConstructor().newInstance() as Case4
        case4.print()
    }
}