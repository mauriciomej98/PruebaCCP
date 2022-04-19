package com.example.prueba.ui.landing


import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import com.example.prueba.R
import dagger.hilt.android.AndroidEntryPoint
import timber.log.Timber

@AndroidEntryPoint
class LandingFragment : Fragment(R.layout.fragment_landing,) {
    private val landingViewModel by viewModels<LandingViewModel>()

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        landingViewModel.persons.observe(viewLifecycleOwner, Observer{
                Timber.i("succes")
        })

    }
}