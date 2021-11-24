package com.example.testcanvas

data class Rect(val x: Float, val y: Float, val width: Float, val height: Float) {
// TODO: добавить поле для отражения состояния (цвета) прямоугольника

    fun isInto(pointX: Float, pointY: Float ): Boolean = false

}