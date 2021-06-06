package com.aleangelozi.android_architectures_kotlin.mvc

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.aleangelozi.android_architectures_kotlin.R

class MVCActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mvc)
        title = "MVC Activity"
    }

}