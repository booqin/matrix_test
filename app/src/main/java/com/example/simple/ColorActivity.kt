package com.example.simple

import android.graphics.ColorMatrix
import android.graphics.ColorMatrixColorFilter
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_color.*

class ColorActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_color)



        testTv.setOnClickListener {

            //4x5矩阵
            val cm = ColorMatrix()
            cm.setSaturation(0f)

            imageView.colorFilter = ColorMatrixColorFilter(cm)
            textView.text = cm.array.contentToString()
        }

        testTv2.setOnClickListener {
            val mArray = FloatArray(20)
            mArray[0] = 1f
            mArray[6] = 0f
            mArray[12] = 0f
            mArray[18] = 1f
            //4x5矩阵
            //[ 1, 0, 0, 0, 0
            //  0, 0, 0, 0, 0
            //  0, 0, 0, 0, 0
            //  0, 0, 0, 1, 0 ]
            val cm = ColorMatrix(mArray)
//            cm.setSaturation(0f)

            imageView.colorFilter = ColorMatrixColorFilter(cm)
            textView.text = cm.array.contentToString()
        }

        testTv3.setOnClickListener {
            val mArray = FloatArray(20)
            mArray[0] = 0f
            mArray[6] = 1f
            mArray[12] = 0f
            mArray[18] = 1f
            //4x5矩阵
            //[ 0, 0, 0, 0, 0
            //  0, 1, 0, 0, 0
            //  0, 0, 0, 0, 0
            //  0, 0, 0, 1, 0 ]
            val cm = ColorMatrix(mArray)
//            cm.setSaturation(0f)

            imageView.colorFilter = ColorMatrixColorFilter(cm)
            textView.text = cm.array.contentToString()
        }

        testTv4.setOnClickListener {
            val mArray = FloatArray(20)
            mArray[0] = 0f
            mArray[6] = 0f
            mArray[12] = 1f
            mArray[18] = 1f
            //4x5矩阵
            //[ 0, 0, 0, 0, 0
            //  0, 0, 0, 0, 0
            //  0, 0, 1, 0, 0
            //  0, 0, 0, 1, 0 ]
            val cm = ColorMatrix(mArray)
//            cm.setSaturation(0f)

            imageView.colorFilter = ColorMatrixColorFilter(cm)
            textView.text = cm.array.contentToString()
        }

    }
}