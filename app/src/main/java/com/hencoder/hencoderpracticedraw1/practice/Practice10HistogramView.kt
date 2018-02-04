package com.hencoder.hencoderpracticedraw1.practice

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

class Practice10HistogramView : View {

    constructor(context: Context) : super(context) {}

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {}

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {}

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        //        综合练习
        //        练习内容：使用各种 Canvas.drawXXX() 方法画直方图
        val mPaint = Paint()
        mPaint.flags = Paint.ANTI_ALIAS_FLAG
        mPaint.strokeWidth = 3F
        mPaint.color = Color.WHITE
        val originX = 100F
        val originY = 500F
        val xAxis = 700F
        val yAxis = 100F
        val columnWidth = 100F
        canvas.drawLine(originX, 20F, originX, originY, mPaint)
        canvas.drawLine(originX, originY, 1000F,originY, mPaint)
    }
}
