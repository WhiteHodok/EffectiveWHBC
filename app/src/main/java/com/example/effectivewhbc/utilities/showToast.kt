package com.example.effectivewhbc.utilities

import android.widget.Toast
import com.example.effectivewhbc.App

fun showToast(message: String) {
    Toast.makeText(App.INSTANCE.applicationContext, message, Toast.LENGTH_SHORT).show()
}