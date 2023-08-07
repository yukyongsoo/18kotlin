package com.example.demo.case7

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class Case7 {
    @GetMapping("/case7")
    fun whatIsTheValue(@RequestParam(required = false) string: String? = "a") {
        println(string)
    }
}