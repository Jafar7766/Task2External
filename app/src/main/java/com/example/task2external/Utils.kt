package com.example.task2external

import android.content.Context
import android.widget.Toast

object Utils {
    fun fireToast(context: Context, text: String) {
        Toast.makeText(context, text, Toast.LENGTH_SHORT).show()
    }
}