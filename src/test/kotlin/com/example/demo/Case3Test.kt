package com.example.demo

import com.example.demo.case3.Case3
import com.example.demo.case3.Enti
import com.example.demo.case3.Repo
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.ArgumentMatchers.anyInt
import org.mockito.InjectMocks
import org.mockito.Mock
import org.mockito.junit.jupiter.MockitoExtension
import org.mockito.kotlin.given
import org.springframework.data.repository.findByIdOrNull

@ExtendWith(MockitoExtension::class)
class Case3Test {
    @Mock
    private lateinit var repo: Repo

    @InjectMocks
    private lateinit var case3: Case3


    @Test
    fun case1() {
        given(
            repo.findByIdOrNull(anyInt())
        ).willReturn(
            Enti("a")
        )

        case3.a()
    }

    //https://github.com/mockito/mockito/issues/1481
}