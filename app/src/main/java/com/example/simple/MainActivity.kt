package com.example.simple

import android.graphics.SurfaceTexture
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.HandlerThread
import android.util.Log
import android.view.FrameMetrics
import android.view.Window
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        testTv.setOnClickListener {
            Toast.makeText(this, "2", Toast.LENGTH_SHORT).show()
        }

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            window.addOnFrameMetricsAvailableListener({ window, frameMetrics, dropCountSinceLastInvocation ->
                val copy = FrameMetrics(frameMetrics)
                val vsycn = copy.getMetric(FrameMetrics.VSYNC_TIMESTAMP)
                val intended = copy.getMetric(FrameMetrics.INTENDED_VSYNC_TIMESTAMP)
                Log.d("FrameStat", "is first frame: ${copy.getMetric(FrameMetrics.FIRST_DRAW_FRAME) == 1L} ")
                Log.d("FrameStat", "measure layout: ${copy.getMetric(FrameMetrics.LAYOUT_MEASURE_DURATION) / 1000000} ms")
                Log.d("FrameStat", "draw: ${copy.getMetric(FrameMetrics.DRAW_DURATION) / 1000000} ms")
                Log.d("FrameStat", "total: ${copy.getMetric(FrameMetrics.TOTAL_DURATION) / 1000000} ms")
                Log.d("FrameStat", "delay draw: ${copy.getMetric(FrameMetrics.INTENDED_VSYNC_TIMESTAMP) > copy.getMetric(FrameMetrics.VSYNC_TIMESTAMP)} ms")
                Log.d("FrameStat", "total draw new : ${(copy.getMetric(FrameMetrics.ANIMATION_DURATION) + copy.getMetric(FrameMetrics.INPUT_HANDLING_DURATION) + copy.getMetric(FrameMetrics.LAYOUT_MEASURE_DURATION) + copy.getMetric(FrameMetrics.DRAW_DURATION)) / 1000000} ms")
                Log.d("FrameStat", "=============")
                // ANIMATION_DURATION
                // INPUT_HANDLING_DURATION
                // LAYOUT_MEASURE_DURATION
                // DRAW_DURATION


            }, Handler(HandlerThread("joj").also { it.start() }.looper))
        }
    }
}