package com.hencoder.hencoderpracticedraw1.practice

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.os.Build
import android.support.annotation.RequiresApi
import android.util.AttributeSet
import android.view.View

class Practice7DrawRoundRectView : View {

    constructor(context: Context) : super(context) {}

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {}

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {}

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        //        练习内容：使用 canvas.drawRoundRect() 方法画圆角矩形
        val paint = Paint()
        paint.flags = Paint.ANTI_ALIAS_FLAG
        canvas.drawRoundRect(((width / 2) - 300).toFloat(), ((height / 2) - 150).toFloat(),
                ((width / 2) + 300).toFloat(), ((height / 2) + 150).toFloat(), 40F, 40F, paint)
    }
}
