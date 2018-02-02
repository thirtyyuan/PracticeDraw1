package com.hencoder.hencoderpracticedraw1.practice

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

class Practice4DrawPointView : View {

    constructor(context: Context) : super(context) {}

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {}

    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {}

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        //        练习内容：使用 canvas.drawPoint() 方法画点
        //        一个圆点，一个方点
        //        圆点和方点的切换使用 paint.setStrokeCap(cap)：`ROUND` 是圆点，`BUTT` 或 `SQUARE` 是方点
        val circlePaint = Paint(Paint.ANTI_ALIAS_FLAG)
        circlePaint.strokeCap = Paint.Cap.ROUND
        circlePaint.strokeWidth = 50F
        canvas.drawPoint(250F, 250F, circlePaint)

        val squarePaint = Paint(Paint.ANTI_ALIAS_FLAG)
        squarePaint.strokeCap = Paint.Cap.SQUARE
        squarePaint.strokeWidth = 50F
        canvas.drawPoint(750F, 250F, squarePaint)
    }
}
