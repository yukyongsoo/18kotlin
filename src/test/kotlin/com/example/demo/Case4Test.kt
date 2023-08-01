package com.example.demo

import com.example.demo.case4.Case4
import org.junit.jupiter.api.Test
import kotlin.reflect.full.createInstance

class Case4Test {
    @Test
    fun good() {
        val a = Case4::class.createInstance()
        a.print()
    }

    @Test
    fun wtf() {
        val clazz = Class.forName("com.example.demo.case4.Case4")
        val a = clazz.getDeclaredConstructor().newInstance() as Case4
        a.print()
    }
}