package com.importre.example

import com.google.gson.Gson
import org.jetbrains.ktor.application.Application
import org.jetbrains.ktor.http.HttpMethod
import org.jetbrains.ktor.http.HttpStatusCode
import org.jetbrains.ktor.testing.handleRequest
import org.jetbrains.ktor.testing.withTestApplication
import org.junit.Test
import kotlin.test.assertEquals

class ApplicationTest {

    @Test
    fun testRequest() = withTestApplication(Application::main) {
        with(handleRequest(HttpMethod.Companion.Get, "/")) {
            assertEquals(HttpStatusCode.Companion.OK, response.status())

            val expected = "Hello, Kotlin!"
            val actual = Gson().fromJson(response.content, Map::class.java)
            assertEquals(expected, actual["message"])
        }
    }
}
