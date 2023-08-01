package com.example.demo

import com.example.demo.case2.Case2
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Timeout
import java.util.concurrent.TimeUnit

class Case2Test {
    private val case2 = Case2()

    @Test
    @Timeout(10, unit = TimeUnit.SECONDS)
    fun a() {
        case2.what()
    }

    @Test
    @Timeout(10, unit = TimeUnit.SECONDS)
    fun b() {
        case2.hmm()
    }

    @Test
    @Timeout(10, unit = TimeUnit.SECONDS)
    fun c() {
        case2.wtf()
    }

    @Test
    @Timeout(10, unit = TimeUnit.SECONDS)
    fun d() {
        case2.ok()
    }
}