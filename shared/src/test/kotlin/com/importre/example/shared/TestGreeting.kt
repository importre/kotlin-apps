package com.importre.example.shared

import org.junit.Test
import kotlin.test.assertEquals

class TestGreeting {

    @Test
    fun testGreeting() {
        assertEquals("Hello, Kotlin!", greeting(User()))
    }
}
