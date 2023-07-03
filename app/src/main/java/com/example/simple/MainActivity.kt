package com.example.simple

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        testTv.setOnClickListener {
            val intent = Intent(this@MainActivity, ShapeActivity::class.java)
            startActivity(intent)
        }

        testTv2.setOnClickListener {
            val intent = Intent(this@MainActivity, ColorActivity::class.java)
            startActivity(intent)
        }


    }

}