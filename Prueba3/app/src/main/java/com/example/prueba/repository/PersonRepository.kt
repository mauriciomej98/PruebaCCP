package com.example.prueba.repository

import com.example.prueba.model.Person
import com.example.prueba.network.DataPerson
import io.reactivex.rxjava3.core.Scheduler
import io.reactivex.rxjava3.core.Single
import io.reactivex.rxjava3.schedulers.Schedulers
import io.reactivex.rxjava3.schedulers.Schedulers.io
import javax.inject.Inject
import javax.inject.Singleton


@Singleton

class PersonRepository @Inject constructor(
    private val dataPerson: DataPerson

){
    fun getUser() : Single<Person>{
        return dataPerson.getPersonGit()
            .subscribeOn(Schedulers.io())
    }
}