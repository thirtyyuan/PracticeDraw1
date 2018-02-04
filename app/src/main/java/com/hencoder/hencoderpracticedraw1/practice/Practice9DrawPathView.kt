package com.hencoder.hencoderpracticedraw1.practice

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.Path
import android.os.Build
import android.support.annotation.RequiresApi
import android.util.AttributeSet
import android.view.View

class Practice9DrawPathView : View {

    constructor(context: Context) : super(context) {}

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {}

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {}

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        //        练习内容：使用 canvas.drawPath() 方法画心形
        val paint = Paint()
        paint.flags = Paint.ANTI_ALIAS_FLAG
        paint.style = Paint.Style.STROKE
        val path = Path();
        val centWidth = width / 2
        val centHeight = height / 2

        path.addArc(centWidth - 100F, centHeight - 100F, centWidth.toFloat(), centHeight.toFloat(), 135F, 225F)
        path.arcTo(centWidth.toFloat(), centHeight - 100F, centWidth + 100F, centHeight.toFloat(), 180F, 225F, false)
        path.lineTo(centWidth.toFloat(), centHeight + 85F)

        // close 到 path 最初的起点
        path.close()
        canvas.drawPath(path, paint)
    }
}
