package com.grantsome.myviewtestfirst;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by tom on 2017/3/9.
 */

public class QQItemViewFirst extends View {

    private  Bitmap sBitmapOne;

    private BitmapShader sBitmapShader;

    private  Paint sPaint;

    private Drawable mDrawable;

    public QQItemViewFirst(Context context) {
        super(context);
    }


    public QQItemViewFirst(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        TypedArray typedArray = context.getTheme().obtainStyledAttributes(attrs,R.styleable.QQItemViewFirst,0,0);
        try{
            mDrawable = typedArray.getDrawable(R.styleable.QQItemViewFirst_drawable);
        }finally {
            typedArray.recycle();
        }
        initView();
    }

    public QQItemViewFirst(Context context, AttributeSet attrs) {
        super(context, attrs);
        TypedArray typedArray = context.getTheme().obtainStyledAttributes(attrs,R.styleable.QQItemViewFirst,0,0);
        try{
            mDrawable = typedArray.getDrawable(R.styleable.QQItemViewFirst_drawable);
        }finally {
            typedArray.recycle();
        }
        initView();
    }

    private void initView(){
        sBitmapOne = ((BitmapDrawable) mDrawable).getBitmap();
        sBitmapOne = Bitmap.createScaledBitmap(sBitmapOne,160,160,true);
        sBitmapShader = new BitmapShader(sBitmapOne, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
    }

    @Override
    protected void onDraw(Canvas canvas){
        sPaint = new Paint();
        sPaint.setAntiAlias(true);
        sPaint.setFilterBitmap(true);
        sPaint.setDither(true);
        sPaint.setColor(Color.BLUE);
        sPaint.setShader(sBitmapShader);
        canvas.drawCircle(80,80, 80, sPaint);
    }

}
