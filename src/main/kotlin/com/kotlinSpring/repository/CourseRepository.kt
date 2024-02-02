package com.kotlinSpring.repository

import com.kotlinSpring.entity.Course
import org.springframework.data.repository.CrudRepository

interface CourseRepository : CrudRepository<Course, Int> {
}