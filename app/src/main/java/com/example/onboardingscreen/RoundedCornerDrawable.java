package com.example.onboardingscreen;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PixelFormat;
import android.graphics.RectF;
import android.graphics.drawable.ShapeDrawable;

public class RoundedCornerDrawable extends ShapeDrawable {
    private final Paint paint;
    private final RectF rectF;

    public RoundedCornerDrawable(Context context) {
        paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        rectF = new RectF();
        // Set the background color as needed
        int backgroundColor = context.getResources().getColor(android.R.color.transparent); // Change this to the desired background color
        paint.setColor(backgroundColor);
    }

    @Override
    public void draw(Canvas canvas) {
        canvas.drawRoundRect(rectF, 20, 20, paint); // You can adjust the corner radius here
    }

    @Override
    public void setAlpha(int alpha) {
        paint.setAlpha(alpha);
    }

    @Override
    public void setColorFilter(ColorFilter cf) {
        paint.setColorFilter(cf);
    }

    @Override
    public int getOpacity() {
        return PixelFormat.TRANSLUCENT;
    }
}
