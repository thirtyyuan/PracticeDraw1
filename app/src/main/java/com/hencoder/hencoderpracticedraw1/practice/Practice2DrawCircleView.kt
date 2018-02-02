package com.hencoder.hencoderpracticedraw1.practice

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import android.util.AttributeSet
import android.view.View

class Practice2DrawCircleView : View {

    constructor(context: Context) : super(context) {}

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {}

    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {}

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        //        练习内容：使用 canvas.drawCircle() 方法画圆
        //        一共四个圆：1.实心圆 2.空心圆 3.蓝色实心圆 4.线宽为 20 的空心圆
        val fillPaint = Paint(Paint.ANTI_ALIAS_FLAG)
        canvas.drawCircle(350f, 180f, 150f, fillPaint)

        val hollowPaint = Paint(Paint.ANTI_ALIAS_FLAG)
        hollowPaint.style = Paint.Style.STROKE
        hollowPaint.strokeWidth = 4f
        canvas.drawCircle(700f, 180f, 150f, hollowPaint)

        val bluePaint = Paint(Paint.ANTI_ALIAS_FLAG)
        bluePaint.color = Color.BLUE
        canvas.drawCircle(350f, 520f, 150f, bluePaint)

        val doublePaint = Paint(Paint.ANTI_ALIAS_FLAG)
        val path = Path()
        path.addCircle(700f, 520f, 150f, Path.Direction.CW)
        path.addCircle(700f, 520f, 100f, Path.Direction.CW)
        path.fillType = Path.FillType.EVEN_ODD
        canvas.drawPath(path, doublePaint)
    }
}
