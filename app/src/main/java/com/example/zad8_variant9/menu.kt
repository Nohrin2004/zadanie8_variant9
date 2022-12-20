package com.example.zad8_variant9

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
    }

    fun but1(view: View) {
        var intent = Intent(this,collection_screen::class.java)
//            intent.putExtra("pas", pas1.text.toString())
//            intent.putExtra("log",log1.text.toString())

        startActivity(intent)
    }
}