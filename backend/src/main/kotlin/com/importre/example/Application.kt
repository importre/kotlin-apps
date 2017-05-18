package com.importre.example

import com.importre.example.shared.User
import com.importre.example.shared.greeting
import org.jetbrains.ktor.application.Application
import org.jetbrains.ktor.application.call
import org.jetbrains.ktor.application.install
import org.jetbrains.ktor.http.ContentType
import org.jetbrains.ktor.response.respondText
import org.jetbrains.ktor.routing.Routing
import org.jetbrains.ktor.routing.get

fun Application.main() {

    install(Routing) {
        get("/") {
            val response = mapOf("message" to greeting(User()))
            call.respondText(response.toJson(), ContentType.Application.Json)
        }
    }
}
