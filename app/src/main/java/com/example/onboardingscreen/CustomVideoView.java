package com.example.onboardingscreen;

import android.content.Context;
import android.graphics.drawable.shapes.RectShape;
import android.util.AttributeSet;
import android.widget.VideoView;

public class CustomVideoView extends VideoView {

    private int width;
    private int height;
    public CustomVideoView(Context context, int width, int height) {
        super(context);
        this.width = width;
        this.height = height;
        setCornerRadius(context);

    }

    public CustomVideoView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setCornerRadius(context);
    }

    public CustomVideoView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        setCornerRadius(context);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        setMeasuredDimension(width, height);
    }

    private void setCornerRadius(Context context) {
        // Create a custom rounded background drawable
        RoundedCornerDrawable roundedCornerDrawable = new RoundedCornerDrawable(context);
        setBackground(roundedCornerDrawable);
    }
}
