package com.example.calculo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.calculo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.textView

        binding.buttonCalcular.setOnClickListener {
            val num1: Double = binding.regraA.text.toString().toDouble()
            val num2: Double = binding.regraB.text.toString().toDouble()
            val num3: Double = binding.regraC.text.toString().toDouble()
            val calculus = String.format("%.0f", (num2 * num3) / num1 ).toDouble()

            binding.resultado.text = "$calculus"

        }
    }
}