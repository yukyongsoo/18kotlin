package com.example.demo

import com.example.demo.case5.Enti
import com.example.demo.case5.Repo2
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.ArgumentMatchers.anyInt
import org.mockito.Mock
import org.mockito.junit.jupiter.MockitoExtension
import org.mockito.kotlin.given
import org.mockito.kotlin.willReturn
import org.springframework.data.repository.findByIdOrNull
import java.util.Optional

@ExtendWith(MockitoExtension::class)
class Case5Test {
    @Mock
    private lateinit var repo2: Repo2

    @Test
    fun a() {
        given {
            repo2.findById(anyInt())
        }.willReturn {
            Optional.of(Enti("a"))
        }

        val a = repo2.findByIdOrNull(1)!!

        println(a.hashCode())
    }
}