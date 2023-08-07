package com.example.demo

import com.example.demo.case2.Case2
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Timeout
import java.util.concurrent.TimeUnit

class Case2Test {
    private val case2 = Case2()

    @Test
    @Timeout(10, unit = TimeUnit.SECONDS)
    fun iWillWait() {
        case2.iWillWait()
    }

    @Test
    @Timeout(10, unit = TimeUnit.SECONDS)
    fun iWontWait() {
        case2.iWontWait()
    }

    @Test
    @Timeout(10, unit = TimeUnit.SECONDS)
    fun okIWontWait() {
        case2.okIWontWait()
    }

    @Test
    @Timeout(10, unit = TimeUnit.SECONDS)
    fun okIWillWait() {
        case2.okIWillWait()
    }
}


//new coroutine and blocks the current thread interruptibly until its completion