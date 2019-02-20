package com.example.mvvmsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //return the object of View Model
        val viewModel = ViewModelProviders.of(this, ViewModelProvider.NewInstanceFactory())
            .get(MainActivityViewModel::class.java)
        // here we'll get what we are observing
        viewModel.getliveDataVariable().observe(this@MainActivity, Observer {
            myedittext.setText("$it")
        })

        button_add.setOnClickListener {
            //updating the value in viewmodel observer
            viewModel.updateString(viewModel.getliveDataVariable().value!! + 1)
        }
    }
}
