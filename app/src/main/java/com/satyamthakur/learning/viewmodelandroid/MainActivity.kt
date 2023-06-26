package com.satyamthakur.learning.viewmodelandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    lateinit var btn: Button
    lateinit var mainViewModel: MainViewModel
    lateinit var tvMain: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn = findViewById(R.id.increment_button)
        tvMain = findViewById(R.id.tv_main)

        // setting up the viewModel
        mainViewModel = ViewModelProvider(this, MainViewModelFactory(8)).get(MainViewModel::class.java)

        tvMain.text = mainViewModel.count.toString()

        btn.setOnClickListener {
            mainViewModel.increment()
            tvMain.text = mainViewModel.count.toString()
        }

    }
}