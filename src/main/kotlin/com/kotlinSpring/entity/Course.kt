package com.kotlinSpring.entity

import jakarta.persistence.*

@Entity
@Table(name = "Courses")
data class Course(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        val id: Int?,
        val name: String,
        val category: String
)