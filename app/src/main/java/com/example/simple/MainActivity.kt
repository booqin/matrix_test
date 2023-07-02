package com.example.simple

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.Matrix
import android.graphics.SurfaceTexture
import android.graphics.drawable.Drawable
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.HandlerThread
import android.util.Log
import android.view.FrameMetrics
import android.view.Window
import android.widget.Toast
import androidx.core.graphics.scale
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        b.scale(100, 100)
//        image.setImageBitmap(b.scale(300, 300))
        // 缩放
        // 平移
        // 旋转
        // 错切


        // 颜色变换

//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
//            window.addOnFrameMetricsAvailableListener({ window, frameMetrics, dropCountSinceLastInvocation ->
//                val copy = FrameMetrics(frameMetrics)
//                val vsycn = copy.getMetric(FrameMetrics.VSYNC_TIMESTAMP)
//                val intended = copy.getMetric(FrameMetrics.INTENDED_VSYNC_TIMESTAMP)
//                Log.d("FrameStat", "is first frame: ${copy.getMetric(FrameMetrics.FIRST_DRAW_FRAME) == 1L} ")
//                Log.d("FrameStat", "measure layout: ${copy.getMetric(FrameMetrics.LAYOUT_MEASURE_DURATION) / 1000000} ms")
//                Log.d("FrameStat", "draw: ${copy.getMetric(FrameMetrics.DRAW_DURATION) / 1000000} ms")
//                Log.d("FrameStat", "total: ${copy.getMetric(FrameMetrics.TOTAL_DURATION) / 1000000} ms")
//                Log.d("FrameStat", "delay draw: ${copy.getMetric(FrameMetrics.INTENDED_VSYNC_TIMESTAMP) > copy.getMetric(FrameMetrics.VSYNC_TIMESTAMP)} ms")
//                Log.d("FrameStat", "total draw new : ${(copy.getMetric(FrameMetrics.ANIMATION_DURATION) + copy.getMetric(FrameMetrics.INPUT_HANDLING_DURATION) + copy.getMetric(FrameMetrics.LAYOUT_MEASURE_DURATION) + copy.getMetric(FrameMetrics.DRAW_DURATION)) / 1000000} ms")
//                Log.d("FrameStat", "=============")
//                // ANIMATION_DURATION
//                // INPUT_HANDLING_DURATION
//                // LAYOUT_MEASURE_DURATION
//                // DRAW_DURATION
//
//
//            }, Handler(HandlerThread("joj").also { it.start() }.looper))
//        }
        testTv.setOnClickListener {
            image.setScale()
        }
        testTv2.setOnClickListener {
            image.setTranslate()
        }
        testTv3.setOnClickListener {
            image.setRotate()
        }
        testTv4.setOnClickListener {
            image.setSkew()
        }
    }

}