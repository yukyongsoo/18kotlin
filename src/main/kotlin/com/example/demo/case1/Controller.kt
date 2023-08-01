package com.example.demo.case1

import jakarta.validation.Valid
import jakarta.validation.constraints.Size
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class Controller {


    @GetMapping
    fun a(@Valid case1: Case1) {

    }

    @PostMapping
    fun b(@Valid @RequestBody case1: Case1) {

    }
}

data class Case1(
    @Size(min = 3)
    val a: String
) {
//    @NotNull
//    val b: String? = null
}
