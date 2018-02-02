package com.hencoder.hencoderpracticedraw1.practice

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

class Practice3DrawRectView : View {

    constructor(context: Context) : super(context) {}

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {}

    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {}

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        //        练习内容：使用 canvas.drawRect() 方法画矩形
        val paint = Paint()
        val width = width
        val height = height
        canvas.drawRect((width / 2 - 200).toFloat(), (height / 2 - 200).toFloat(), (width / 2 + 200).toFloat(), (height / 2 + 200).toFloat(), paint)
    }
}
