package com.rohit.viewmodelcomponent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
    private lateinit var mainViewModel: MainViewModel
    private lateinit var textCounter: TextView
    val initalValue: Int = 20
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textCounter = findViewById(R.id.textView)
        mainViewModel = ViewModelProvider(
            this,
            MainViewModelFactory(initalValue)
        ).get(MainViewModel::class.java)
        setText()
    }

    private fun setText() {
        textCounter.text = mainViewModel.count.toString()
    }

    fun increment(view: View) {
        mainViewModel.increment()
        setText()
    }
}