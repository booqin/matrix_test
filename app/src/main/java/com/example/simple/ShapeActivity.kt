package com.example.simple

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_shape.*

class ShapeActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shape)

//        b.scale(100, 100)
//        image.setImageBitmap(b.scale(300, 300))
        // 缩放
        // 平移
        // 旋转
        // 错切


        // 颜色变换

        testTv.setOnClickListener {
            textView.text = image.setScale().toShortString()
        }
        testTv2.setOnClickListener {
            textView.text = image.setTranslate().toShortString()
        }
        testTv3.setOnClickListener {
            textView.text = image.setRotate().toShortString()
        }
        testTv4.setOnClickListener {
            textView.text = image.setSkew().toShortString()
        }

    }
}