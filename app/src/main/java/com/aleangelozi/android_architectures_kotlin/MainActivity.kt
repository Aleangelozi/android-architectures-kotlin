package com.aleangelozi.android_architectures_kotlin

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.aleangelozi.android_architectures_kotlin.mvc.MVCActivity
import com.aleangelozi.android_architectures_kotlin.mvp.MVPActivity
import com.aleangelozi.android_architectures_kotlin.mvvm.MVVMActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "Android Architectures - Kotlin "
    }

    fun onMVC(view: View) {
        val i = Intent(this, MVCActivity::class.java)
        startActivity(i)
    }

    fun onMVP(view: View) {
        val i = Intent(this, MVPActivity::class.java)
        startActivity(i)
    }

    fun onMVVM(view: View) {
        val i = Intent(this, MVVMActivity::class.java)
        startActivity(i)
    }
}