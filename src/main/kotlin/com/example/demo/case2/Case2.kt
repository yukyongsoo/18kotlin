package com.example.demo.case2

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class Case2 {
    fun what() {
        runBlocking {
            launch {
                delay(10_000)

                println("what")
            }
        }
    }

    fun hmm() {
        runBlocking {
            async {
                delay(10_000)

                println("what")
            }
        }
    }

    fun ok() {
        CoroutineScope(Dispatchers.IO).async {
            delay(10_000)

            println("ok")
        }
    }

    fun wtf() {
        CoroutineScope(Dispatchers.IO).launch {
            delay(10_000)

            println("ok")
        }
    }
}