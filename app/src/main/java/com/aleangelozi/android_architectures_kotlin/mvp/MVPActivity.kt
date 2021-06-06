package com.aleangelozi.android_architectures_kotlin.mvp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.aleangelozi.android_architectures_kotlin.R

class MVPActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mvp)
        title = "MVP Activity"
    }
}