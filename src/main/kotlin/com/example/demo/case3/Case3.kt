package com.example.demo.case3

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service

@Service
class Case3(
    private val repo: Repo
) {
    fun a() {
        repo.findByIdOrNull(1)
    }
}

interface Repo: JpaRepository<Enti, Int>

@Entity
class Enti(
    private val b: String
){
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val a = 0
}