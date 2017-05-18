package com.importre.example

import com.google.gson.GsonBuilder

private val gson = GsonBuilder()
    .setPrettyPrinting()
    .serializeNulls()
    .create()

fun Any.toJson() = gson.toJson(this)
