package com.kotlinspring.services

import org.springframework.stereotype.Service

@Service
class GreetingService {

    fun doGreeting(name:String):String{
        return "Namaste mr. $name"
    }
}