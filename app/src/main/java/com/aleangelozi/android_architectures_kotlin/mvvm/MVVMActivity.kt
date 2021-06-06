package com.aleangelozi.android_architectures_kotlin.mvvm

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.aleangelozi.android_architectures_kotlin.R

class MVVMActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mvvm)
        title = "MVVM Activity"
    }
}