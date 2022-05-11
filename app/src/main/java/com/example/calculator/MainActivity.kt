package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.calculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val binding =
            DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
        val mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        binding.mainViewModel = mainViewModel


        var number1: Int?

        var number2: Int?


        /**
         * onClickListener for the addition button
         */
        binding.addition.setOnClickListener {
            number1 = binding.firstNumber.text.toString().toIntOrNull()
            number2 = binding.secondNumber.text.toString().toIntOrNull()
            mainViewModel.addition(number1, number2)

            Log.i("numb", "number is $number1")
        }

        /**
         * onClickListener for the subtraction button
         */
        binding.subtraction.setOnClickListener {
            number1 = binding.firstNumber.text.toString().toIntOrNull()
            number2 = binding.secondNumber.text.toString().toIntOrNull()
            mainViewModel.subtraction(number1, number2)
            Log.i("number2", "number is $number2")
        }

        /**
         * onClickListener for the multiplication button
         */
        binding.multiplication.setOnClickListener {
            number1 = binding.firstNumber.text.toString().toIntOrNull()
            number2 = binding.secondNumber.text.toString().toIntOrNull()
            mainViewModel.multiplication(number1, number2)

        }


        /**
         * onClickListener for the division button
         */
        binding.division.setOnClickListener {
            number1 = binding.firstNumber.text.toString().toIntOrNull()
            number2 = binding.secondNumber.text.toString().toIntOrNull()
            mainViewModel.division(number1, number2)
        }


        mainViewModel.result.observe(this, {newResult ->
            binding.resultShow.text = newResult.toString()
        })


    }
}