package com.kotlinSpring.services

import com.kotlinSpring.dto.CourseDTO
import com.kotlinSpring.entity.Course
import com.kotlinSpring.repository.CourseRepository
import mu.KLogging
import org.springframework.stereotype.Service

@Service
class CourseService(val courseRepository: CourseRepository) {

    companion object : KLogging()

    fun addCourse(courseDTO: CourseDTO) : CourseDTO  {

      val courseEntity =  courseDTO.let {
            Course(null, it.name, it.category)
        }
        courseRepository.save(courseEntity)
        logger.info("Saved course is: $courseEntity")

        return courseEntity.let {
            CourseDTO(it.id, it.name, it.category)
        }
    }

    fun retrieveAllCourses(): List<CourseDTO> {

        return courseRepository.findAll()
                .map {
                    CourseDTO(it.id, it.name, it.category)
                }
    }
}

//------------------------README-----------------
/* The service:
        -Access a repository
        -Declares the addCourse function
            -for that it needs a DTO and an Entity
        -If the call is correct, it saves the course and makes a return

   The structure for calling this endpoint is on curl-commands.txt
   we send the value for id, name and category on the call like if we receive it
   from a Front-End.

*/