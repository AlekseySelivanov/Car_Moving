package com.example.carmoving

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.carmoving.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var _binding: ActivityMainBinding? = null
    private val binding get() = _binding!!
    private var setAnimation = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        doInitialization()
    }

    private fun doInitialization(){
        binding.car.setOnClickListener {
            when( setAnimation){
                false ->{
                    setAnimation = true
                    binding.motionLayout.transitionToEnd()
                }
                true -> {
                    setAnimation = false
                    binding.motionLayout.transitionToStart()
                }
            }


        }
    }
}