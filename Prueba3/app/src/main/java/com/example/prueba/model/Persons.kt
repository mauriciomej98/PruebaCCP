package com.example.prueba.model

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass


    @JsonClass(generateAdapter = true)
    data class Persons (
        val page : Int,
    @Json(name= "Status")
        val totalPages: Long,
        val result : List<Person>

        )
    @JsonClass(generateAdapter = true)
    data class Person(
        @Json(name = "avatar_url" )
     val AV: String?,
        @Json(name = "login" )
     val Name: String?,
        @Json(name = "company" )
     val Comp: String?

    )
