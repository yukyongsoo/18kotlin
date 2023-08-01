package com.example.demo.case5

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.ManyToOne
import jakarta.persistence.OneToMany
import org.springframework.data.jpa.repository.JpaRepository

interface Repo2: JpaRepository<Enti, Int>

@Entity(name = "case5")
data class Enti(
    private val b: String
){
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val a = 0

    @OneToMany(mappedBy = "parent")
    val list = listOf(
        EntiChild("b")
    )
}

@Entity
data class EntiChild(
    private val b: String
){
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val a = 0

    @ManyToOne
    val parent: Enti = Enti("a")
}