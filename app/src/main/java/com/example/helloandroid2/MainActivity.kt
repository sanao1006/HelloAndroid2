package com.example.helloandroid2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    private  inner class  HelloListner: View.OnClickListener {
        override fun onClick(v: View?) {
            TODO("Not yet implemented")
        }
    }
}