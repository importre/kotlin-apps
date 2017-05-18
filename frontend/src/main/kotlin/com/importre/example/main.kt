package com.importre.example

import kotlin.browser.document

fun main(args: Array<String>) {
    val message = "Hello, Javascript!"
    println(message)

    document.body
        ?.querySelector("#main")
        ?.innerHTML = message
}
