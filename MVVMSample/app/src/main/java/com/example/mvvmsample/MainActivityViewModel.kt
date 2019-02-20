package com.example.mvvmsample

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel() : ViewModel() {
    //created a variable which will be updated on button click
    var counter: Int = 0
    //reference of data we'll update for live data
    var liveDataVariable = MutableLiveData<Int>()

    init {
        //update the initial value in livedata variable
        liveDataVariable.value = counter
    }

    //geting the live data variable
    fun getliveDataVariable(): MutableLiveData<Int> {
        return liveDataVariable
    }

    //updating the live data variable
    fun updateString(counterVariable: Int) {
        counter = counterVariable
        liveDataVariable.value = counter
    }
}