package com.example.demo.case1

import jakarta.validation.Valid
import jakarta.validation.constraints.Size
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class Case1Controller {


    @GetMapping
    fun get(@Valid case1: Case1) {}

    @PostMapping
    fun post(@Valid @RequestBody case1: Case1) {}
}

data class Case1(
    @Size(min = 3)
    val cantCheck: String
) {
//    @NotNull
//    val canCheck: String? = null
}
