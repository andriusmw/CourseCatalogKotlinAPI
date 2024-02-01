package com.kotlinSpring.controller

import com.kotlinSpring.services.GreetingsService
import mu.KLogging
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("v1/greetings")

class GreetingController(val greetingsService: GreetingsService) {

    companion object : KLogging()

    @GetMapping("/{name}")
    fun retrieveGreeting(@PathVariable("name") name: String): String {
       // return "Hello $name"
        logger.info("Name is $name")
        return greetingsService.retrieveGreeting(name)
        //invoking the service inside the controller, note we imported on the primary constructor, line 12 and 3

    }
}