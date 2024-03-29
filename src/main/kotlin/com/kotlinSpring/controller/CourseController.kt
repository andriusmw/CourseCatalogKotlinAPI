package com.kotlinSpring.controller

import com.kotlinSpring.dto.CourseDTO
import com.kotlinSpring.services.CourseService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
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

    @GetMapping
    fun retrieveAllCourses() : List<CourseDTO> = courseService.retrieveAllCourses()

    //courseId
    @PutMapping("/{course_id}")
    fun updateCourse(@RequestBody courseDTO: CourseDTO,
                        @PathVariable("course_id") courseId : Int) =  courseService.updateCourse(courseId, courseDTO)


    @DeleteMapping("/{course_id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun deleteCourse(@PathVariable("course_id") courseId: Int) = courseService.deleteCourse(courseId)

}

//------------------------README-----------------
/* The Controller defines the endpoint and call the service.

    The "addCourse" function on this file should be called "addCourseController" to
    avoid confusion with the addCourse function on courseService or upside down.
            --> addCourse(){}  calls for courseService.addCourseService()

*/