package com.example.prueba

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import dagger.hilt.android.AndroidEntryPoint
import com.example.prueba.R

@AndroidEntryPoint

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        return super.onCreateOptionsMenu(menu)
        menuInflater.inflate(R.menu.boton_research, menu)

        return super.onCreateOptionsMenu(menu)
    }

}