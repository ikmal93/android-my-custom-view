package com.example.androidmycustomview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ExtendedWidget : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.extended_widget_activity)
    }
}