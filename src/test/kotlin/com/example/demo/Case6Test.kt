package com.example.demo

import com.example.demo.case6.Case6Id
import com.example.demo.case6.Repo3
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest

@DataJpaTest
class Case6Test {
    @Autowired
    private lateinit var repo3: Repo3

    @Test
    fun a() {
        val b = repo3.findById(Case6Id(1))
    }
}