package com.hencoder.hencoderpracticedraw1.practice

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

class Practice10HistogramView : View {
    private val mPaint = Paint()
    private val originX = 100F
    private val originY = 500F
    private val columnWidth = 120F

    private val mTextPaint = Paint()
    private val mRectPaint = Paint()

    private var names: Array<String>? = null
    private var heights: IntArray? = null

    private var rectStart: Float = 0.0F
    private var rectEnd: Float = 0.0F
    private var rectTop: Float = 0.0F
    private var rectBottom: Float = 0.0F

    private var textCenterX: Float = 0.0F
    private var textCenterY: Float = 0.0F
    private var gap: Float = 0.0F

    constructor(context: Context) : super(context) {}

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {}

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {}

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        //        综合练习
        //        练习内容：使用各种 Canvas.drawXXX() 方法画直方图
        initData()
        initCanvas(canvas)
        initPaint()
        initPaintPosition()
        drawPicture(canvas)
    }

    private fun initCanvas(canvas: Canvas) {
        mPaint.flags = Paint.ANTI_ALIAS_FLAG
        mPaint.strokeWidth = 2F
        mPaint.color = Color.WHITE

        canvas.drawLine(originX, 20F, originX, originY, mPaint)
        canvas.drawLine(originX, originY, 1000F, originY, mPaint)
    }

    private fun initData() {
        names = arrayOf("Froyo", "GB", "ICS", "JB", "KitKat", "L", "M")
        heights = intArrayOf(3, 30, 30, 240, 340, 400, 220)
    }

    private fun initPaint() {
        mTextPaint.flags = Paint.ANTI_ALIAS_FLAG
        mTextPaint.color = Color.WHITE
        mTextPaint.textSize = 24F
        mTextPaint.textAlign = Paint.Align.CENTER
        mRectPaint.flags = Paint.ANTI_ALIAS_FLAG
        mRectPaint.color = Color.GREEN
    }

    private fun initPaintPosition() {
        rectStart = originX + 20
        rectEnd = rectStart + 100
        rectBottom = originY

        textCenterX = (rectStart + rectEnd) / 2
        textCenterY = originY + 20
    }

    private fun drawPicture(canvas: Canvas) {
        if (names == null || heights == null) {
            return
        }
        for (i in names!!.indices) {
            gap = i * columnWidth
            rectTop = originY - heights!![i]

            canvas.drawText(names?.get(i), textCenterX + gap, textCenterY, mTextPaint)
            canvas.drawRect(rectStart + gap, rectTop, rectEnd + gap, rectBottom, mRectPaint)
        }
    }
}
