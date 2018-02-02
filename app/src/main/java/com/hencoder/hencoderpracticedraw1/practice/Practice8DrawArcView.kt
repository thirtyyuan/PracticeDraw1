package com.hencoder.hencoderpracticedraw1.practice

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.os.Build
import android.support.annotation.RequiresApi
import android.util.AttributeSet
import android.view.View

class Practice8DrawArcView : View {

    constructor(context: Context) : super(context) {}

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {}

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {}

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        //        练习内容：使用 canvas.drawArc() 方法画弧形和扇形
        val height = height
        val width = width
        val start = ((width / 2) - 180).toFloat()
        val top = ((height / 2) - 100).toFloat()
        val end  = ((width / 2) + 180).toFloat()
        val bottom = ((height / 2) + 100).toFloat()
        val paint1 = Paint()
        paint1.flags = Paint.ANTI_ALIAS_FLAG

        // Notice: The startAngle is coincides with the positive y-axis.
        canvas.drawArc(start, top, end, bottom, -110F, 100F, true, paint1)

        val paint2 = Paint()
        paint2.style = Paint.Style.STROKE
        paint2.flags = Paint.ANTI_ALIAS_FLAG
        canvas.drawArc(start, top, end, bottom, -180F, 60F, false, paint2)

        val paint3 = Paint()
        paint3.flags = Paint.ANTI_ALIAS_FLAG
        canvas.drawArc(start, top, end, bottom, 20F, 140F, false, paint3)
    }
}
