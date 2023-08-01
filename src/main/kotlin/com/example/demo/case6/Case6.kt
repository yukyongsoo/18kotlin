package com.example.demo.case6

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.IdClass
import org.springframework.data.jpa.repository.JpaRepository
import java.io.Serializable

@JvmInline
value class Case6Id(
    val id: Long
): Serializable

@JvmInline
value class Case6Property(
    val value: String
)

@Entity
@IdClass(Case6Id::class)
class Case6Entity{
    @Id
    val id = Case6Id(1)
    //val id = 1L

    @Column
    val property = Case6Property("a")
}

interface Repo3: JpaRepository<Case6Entity, Case6Id> {
    fun findAllByIdIn(id: Collection<Case6Id>): List<Case6Entity>
    fun findAllByPropertyIn(property: Collection<Case6Property>): List<Case6Entity>
}

// https://openjdk.org/projects/valhalla/
