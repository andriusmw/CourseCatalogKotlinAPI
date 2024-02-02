package com.kotlinSpring.controller

import com.kotlinSpring.dto.CourseDTO
import com.kotlinSpring.services.CourseService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1/courses")
class CourseController(val courseService: CourseService) {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun addCourse(@RequestBody courseDTO: CourseDTO): CourseDTO {
        return courseService.addCourse(courseDTO)
    }
}

//------------------------README-----------------
/* The Controller defines the endpoint and call the service.

    The "addCourse" function on this file should be called "addCourseController" to
    avoid confusion with the addCourse function on courseService or upside down.
            --> addCourse(){}  calls for courseService.addCourseService()

*/