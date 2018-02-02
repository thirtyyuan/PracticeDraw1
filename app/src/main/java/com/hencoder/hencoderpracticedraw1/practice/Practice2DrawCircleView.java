package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice2DrawCircleView extends View {

    public Practice2DrawCircleView(Context context) {
        super(context);
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawCircle() 方法画圆
//        一共四个圆：1.实心圆 2.空心圆 3.蓝色实心圆 4.线宽为 20 的空心圆
        Paint fillPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        canvas.drawCircle(350, 180, 150, fillPaint);

        Paint hollowPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        hollowPaint.setStyle(Paint.Style.STROKE);
        hollowPaint.setStrokeWidth(4);
        canvas.drawCircle(700, 180, 150, hollowPaint);

        Paint bluePaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        bluePaint.setColor(Color.BLUE);
        canvas.drawCircle(350, 520, 150, bluePaint);

        Paint doublePaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        Path path = new Path();
        path.addCircle(700, 520, 150, Path.Direction.CW);
        path.addCircle(700, 520, 100, Path.Direction.CW);
        path.setFillType(Path.FillType.EVEN_ODD);
        canvas.drawPath(path, doublePaint);
    }
}
