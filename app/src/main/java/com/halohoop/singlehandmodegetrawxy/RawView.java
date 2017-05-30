package com.halohoop.singlehandmodegetrawxy;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by Pooholah on 2017/5/30.
 */

public class RawView extends View {
    public RawView(Context context) {
        super(context);
    }

    public RawView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public RawView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    private float rawX = 0;
    private float rawY = 0;
    private float radius = 200;
    private Paint paint = new Paint();

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_MOVE:
                rawX = event.getRawX();
                rawY = event.getRawY();
                invalidate();
                break;
        }
        return true;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawCircle(rawX, rawY, radius, paint);
    }
}
