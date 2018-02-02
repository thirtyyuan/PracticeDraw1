package com.hencoder.hencoderpracticedraw1.practice

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.os.Build
import android.support.annotation.RequiresApi
import android.util.AttributeSet
import android.view.View

class Practice5DrawOvalView : View {

    constructor(context: Context) : super(context) {}

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {}

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {}

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        //        练习内容：使用 canvas.drawOval() 方法画椭圆
        val height = height
        val width = width
        val start = ((width / 2) - 200).toFloat()
        val top = ((height / 2) - 100).toFloat()
        val end  = ((width / 2) + 200).toFloat()
        val bottom = ((height / 2) + 100).toFloat()
        val paint = Paint()
        paint.flags = Paint.ANTI_ALIAS_FLAG
        canvas.drawOval(start, top, end, bottom, paint)
    }
}
