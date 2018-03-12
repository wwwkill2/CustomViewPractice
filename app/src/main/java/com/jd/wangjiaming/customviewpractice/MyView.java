package com.jd.wangjiaming.customviewpractice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Author: WangJiaming
 * Time: 18/3/12
 * Description:
 */

public class MyView extends View {

    Paint paint = new Paint();

    {
        paint.setStyle(Paint.Style.STROKE);// 设置绘制模式
        paint.setColor(Color.RED);// 设置颜色
        paint.setStrokeWidth(20);// 设置线条宽度
        paint.setTextSize(20);// 设置文字大小
        paint.setAntiAlias(true);// 抗锯齿开关
    }

    public MyView(Context context) {
        super(context);
    }

    public MyView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public MyView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        canvas.drawColor(Color.GREEN);
        canvas.drawCircle(300, 0, 200, paint);
        // 画点
        // 圆点
        paint.setStrokeCap(Paint.Cap.ROUND);
        canvas.drawPoint(300, 300, paint);
        // 方点 Cap.BUTT也可以
        paint.setStrokeCap(Paint.Cap.SQUARE);
        canvas.drawPoint(400, 300, paint);
        // 批量画点
        float[] points = {500, 500, 600, 500, 500, 600, 600, 600};
//        canvas.drawPoints(points, paint);
        canvas.drawPoints(points, 2, 6, paint);
        // 椭圆
        canvas.drawOval(700, 700, 800, 900, paint);
        // 画线：drawLine drawLines
        // 圆角矩形：drawRoundRect
        // 弧形：useCenter = false
        canvas.drawArc(300, 300, 400, 500, -45f, 90f, false, paint);
        // 扇形：useCenter = true
        canvas.drawArc(300, 300, 400, 500, -225f, 90f, true, paint);
        // 自定义图形
        // drawPath

    }
}
