package com.example.prueba.network

import com.example.prueba.model.Person
import io.reactivex.rxjava3.core.Single
import retrofit2.http.GET

interface DataPerson {
    @GET("users")
    fun getPersonGit(): Single<Person>
}