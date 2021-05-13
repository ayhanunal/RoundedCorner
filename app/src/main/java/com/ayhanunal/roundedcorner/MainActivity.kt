package com.ayhanunal.roundedcorner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ayhanunal.roundedcorner.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    //view binding
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }
}