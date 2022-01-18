package com.rohit.viewmodelcomponent

import androidx.lifecycle.ViewModel

class MainViewModel(val intialValue: Int) : ViewModel() {
    var count = intialValue

    fun increment() {
        count++
    }
}