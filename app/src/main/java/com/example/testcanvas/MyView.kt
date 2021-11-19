package com.example.testcanvas

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.view.MotionEvent
import android.view.View

class MyView(context: Context?) : View(context) {
    val p = Paint();
    var centerX = 50f
    var centerY = 50f
    override fun onDraw(canvas: Canvas?) {
        p.setColor(Color.RED)
        canvas?.apply {
            drawColor(Color.YELLOW)
            drawCircle(centerX,centerY,30f, p)
        }
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        event?.apply {
            centerX = x; centerY = y
        }
        invalidate()

        return true
    }
}