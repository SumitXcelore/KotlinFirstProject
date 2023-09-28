package com.kotlinspring.controller

import com.kotlinspring.services.GreetingService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class GreetingController(val greetingService: GreetingService) {



    @GetMapping("/greetings/{name}")
    fun greet(@PathVariable("name") name:String):String{
     return greetingService.doGreeting(name)
    }
}