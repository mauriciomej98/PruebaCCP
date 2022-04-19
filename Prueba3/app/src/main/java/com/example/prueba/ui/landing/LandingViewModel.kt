package com.example.prueba.ui.landing

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.prueba.model.Person
import com.example.prueba.repository.PersonRepository
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers

class LandingViewModel  @ViewModelInject constructor(
    personRepository: PersonRepository
)

    : ViewModel() {
        private val _listUser = MutableLiveData<Person>()
        val persons : LiveData<Person>
        get() = _listUser
                init {
                   personRepository.getUser()
                       .observeOn(AndroidSchedulers.mainThread())
                       .subscribe()

                }

}