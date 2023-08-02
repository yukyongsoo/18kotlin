package com.example.demo

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.test.web.reactive.server.WebTestClient

@WebMvcTest
class Case7Test {
    @Autowired
    private lateinit var webTestClient: WebTestClient

    @Test
    fun a() {
        webTestClient.get().uri {
            it.path("/case7")
            it.build()
        }.exchange().expectStatus().isOk
    }
}