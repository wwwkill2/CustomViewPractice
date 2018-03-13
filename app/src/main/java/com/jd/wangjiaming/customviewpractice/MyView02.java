package com.jd.wangjiaming.customviewpractice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Author: WangJiaming
 * Time: 18/3/13
 * Description:
 */

public class MyView02 extends View{

    Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);

    public MyView02(Context context) {
        super(context);
    }

    public MyView02(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public MyView02(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        // Paint的API大致分四种：颜色、效果、drawText相关、初始化
        // 颜色：分两种，一种是setColor，一种是setShader
        Shader shader = new LinearGradient(100, 100, 500, 500, Color.RED, Color.BLUE, Shader.TileMode.CLAMP);
        paint.setShader(shader);
        canvas.drawCircle(300, 300, 200, paint);
        shader = new RadialGradient(800, 300, 200, Color.RED, Color.BLUE, Shader.TileMode.CLAMP);
        paint.setShader(shader);
        canvas.drawCircle(800, 300, 200, paint);
        shader = new SweepGradient(300, 800, Color.RED, Color.BLUE);
        paint.setShader(shader);
        canvas.drawCircle(300, 800, 200, paint);
    }
}
