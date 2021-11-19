package com.example.testcanvas

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.view.MotionEvent
import android.view.View
import java.util.*

class MyView(context: Context?) : View(context) {
    val p = Paint(); val r = Random()
    // массив из логических значений  4*4
    val tiles = Array(4) { BooleanArray(4) { r.nextBoolean() } }
    var centerX = 50f
    val rect = Rect(0.1f, 0.1f, 0.1f, 0.1f)
    var centerY = 50f
    var w = 1000
    var h = 1000

    override fun onDraw(canvas: Canvas?) {
        p.setColor(Color.RED);
        // TODO: нарисовать плитки двух цветов, состояния которых заданы в массиве tiles
        canvas?.apply {
            w = width; h = height
            drawColor(Color.YELLOW)
            drawCircle(centerX,centerY,30f, p)
            drawRect(rect.x * width, rect.y * height, (rect.x + rect.width)* width, (rect.y + rect.height)*height, p)
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