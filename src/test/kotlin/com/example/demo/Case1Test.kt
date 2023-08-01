package com.example.demo

import com.example.demo.case1.Case1
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.test.web.reactive.server.WebTestClient

@WebMvcTest
class Case1Test {
    @Autowired
    private lateinit var webTestClient: WebTestClient

    @Test
    fun a() {
        webTestClient.get().uri {
            it.path("")
            it.queryParam("a", "0")
            it.build()
        }
            .exchange()
            .expectStatus().isOk
    }

    @Test
    fun b() {
        val case1 = Case1("")

        webTestClient.post().uri {
            it.path("")
            it.build()
        }.bodyValue(
            case1
        )
            .exchange()
            .expectStatus().isOk
    }
}