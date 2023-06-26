package com.satyamthakur.learning.viewmodelandroid

import androidx.lifecycle.ViewModel

class MainViewModel(val c: Int): ViewModel() {

    var count: Int = c

    fun increment() {
        count++
    }

}