package com.importre.example.cli

import com.importre.example.shared.User
import com.importre.example.shared.greeting

fun main(args: Array<String>) {
    val message = greeting(User())
    println(message)
}
