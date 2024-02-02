package com.kotlinSpring.entity

import jakarta.persistence.Entity
import jakarta.persistence.Table

@Entity
@Table(name = "Courses")
data class Course(
        val id: Int?,
        val name: String,
        val category: String
)