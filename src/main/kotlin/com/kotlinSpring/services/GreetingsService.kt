package com.kotlinSpring.services

import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Service

@Service
class GreetingsService {
    @Value("\${message}") // this access the message on application.yml , idkwbidc
    lateinit var message: String
    fun retrieveGreeting(name: String) = "Hello $name, $message"
}