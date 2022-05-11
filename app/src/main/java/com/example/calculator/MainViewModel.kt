package com.example.calculator

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private val _result = MutableLiveData<Int?>()
    val result : LiveData<Int?>
    get() = _result


    init {
    }


    /**
     * Addition function, takes integers and add them together
     */
    fun addition(numberx: Int?, numbery: Int?): Int? {
        reset()
        if (numbery != null) {
            if (numberx != null) {
                _result.value = numberx + numbery
            }
        }
        Log.i("result", "result is ${_result.value}")

        return _result.value
    }

    /**
     * Subtraction function, takes integers and subtract them
     */
    fun subtraction(number_x: Int?, number_y: Int?): Int? {
        reset()
        if (number_y != null) {
            if (number_x != null) {
                _result.value = number_x - number_y
            }
        }
        Log.i("result", "result is ${_result.value}")

        return _result.value

    }

    /**
     * multiplication function, takes integers and multiply them
     */
    fun multiplication(number_x: Int?, number_y: Int?): Int? {
        reset()
        if (number_y != null) {
            if (number_x != null) {
                _result.value = number_x * number_y
            }
        }
        Log.i("result", "result is ${_result.value}")
        return _result.value
    }


    /**
     * division function, takes integers and divide them
     */
    fun division(number_x: Int?, number_y: Int?): Int? {
        reset()
        if (number_x != null) {
            if (number_y != null) {
                _result.value = number_x / number_y
            }
        }
        return _result.value
    }


    /**
     * Resets the value of our result
     */
    private fun reset() {
        _result.value = 0
    }


}