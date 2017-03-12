package com.grantsome.myviewtestfirst;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.view.View;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by tom on 2017/3/8.
 */

public class MyThirdView extends View {

   private Paint mPaintCirclcImageOne;

    private Paint mPaintCirclcImageTwo;

    private Bitmap mBitmapOne;

    private Paint mPaintOne;

    private Paint mPaintTwo;

    private Paint mPaintThree;

    private Paint mPaintFour;

    private Paint mPaintFive;

    private Paint mPaintLine;

    private BitmapShader mBitmapShaderOne;

    public MyThirdView(Context context) {
        super(context);
    }


    public MyThirdView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView();
    }


    public MyThirdView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initView();
    }

    @Override
    protected void onDraw(Canvas canvas){
        super.onDraw(canvas);
        mPaintCirclcImageOne = new Paint();
        mPaintCirclcImageOne.setAntiAlias(true);
        mPaintCirclcImageOne.setFilterBitmap(true);
        mPaintCirclcImageOne.setDither(true);
        mBitmapShaderOne = new BitmapShader(mBitmapOne, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
        mPaintCirclcImageOne.setShader(mBitmapShaderOne);
        mPaintCirclcImageOne.setColor(Color.WHITE);
        canvas.drawCircle(80, 80, 80, mPaintCirclcImageOne);

        SimpleDateFormat formatter = new SimpleDateFormat ("HH:mm");
        Date curDate = new Date(System.currentTimeMillis());
        String str = formatter.format(curDate);

        canvas.drawText("我一定在终点等你",200,70,mPaintOne);

        canvas.drawText("[WiFi在线]证明:3+4=0+0≠0恒成立",200,120,mPaintTwo);

        canvas.drawText(str,630,65,mPaintThree);

        canvas.drawCircle(660,110,20,mPaintFour);

        canvas.drawText("5",655,115,mPaintFive);

        canvas.drawLine(0,180,720,180,mPaintLine);


        mPaintCirclcImageTwo = new Paint();
        mPaintCirclcImageTwo.setAntiAlias(true);
        mPaintCirclcImageTwo.setFilterBitmap(true);
        mPaintCirclcImageTwo.setDither(true);

        //mBitmapShaderTwo = new BitmapShader(mBitmapTwo, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
        //mPaintCirclcImageTwo.setShader(mBitmapShaderTwo);
        //canvas.drawCircle(80, 280, 80, mPaintCirclcImageTwo);
        canvas.drawText("李亮",200,70+200,mPaintOne);

        canvas.drawText("[离线请留言]",200,120+200,mPaintTwo);

        canvas.drawText(str,630,65+200,mPaintThree);

        canvas.drawCircle(660,110+200,20,mPaintFour);

        canvas.drawText("4",655,115+200,mPaintFive);

        canvas.drawLine(0,180+200,720,180+200,mPaintLine);

        canvas.drawText("zealer.",200,70+200+200,mPaintOne);

        canvas.drawText("[电脑在线]@  吻火/爱心",200,120+200+200,mPaintTwo);

        canvas.drawText(str,630,65+200+200,mPaintThree);

        canvas.drawCircle(660,110+200+200,20,mPaintFour);

        canvas.drawText("3",655,115+200+200,mPaintFive);

        canvas.drawLine(0,180+200+200,720,180+200+200,mPaintLine);

        canvas.drawText("Dancing in the moon",200,70+200+200+200,mPaintOne);

        canvas.drawText("[iphone在线] something old something ...",200,120+200+200+200,mPaintTwo);

        canvas.drawText(str,630,65+200+200+200,mPaintThree);

        canvas.drawCircle(660,110+200+200+200,20,mPaintFour);

        canvas.drawText("2",655,115+200+200+200,mPaintFive);

        canvas.drawLine(0,180+200+200+200,720,180+200+200+200,mPaintLine);

        canvas.drawText("Simonal",200,70+200+200+200+200,mPaintOne);

        canvas.drawText("[4G在线] 被恩爱穿山甲秀了一脸[表..]",200,120+200+200+200+200,mPaintTwo);

        canvas.drawText(str,630,65+200+200+200+200,mPaintThree);

        canvas.drawCircle(660,110+200+200+200+200,20,mPaintFour);

        canvas.drawText("1",655,115+200+200+200+200,mPaintFive);

        canvas.drawLine(0,180+200+200+200+200,720,180+200+200+200+200,mPaintLine);


    }

    private void initView(){
      mBitmapOne = ((BitmapDrawable) getResources().getDrawable(R.drawable.boy_third)).getBitmap();
      mBitmapOne = Bitmap.createScaledBitmap(mBitmapOne,160,160,true);

        mPaintOne = new Paint();
        mPaintOne.setColor(Color.BLACK);
        mPaintOne.setStyle(Paint.Style.FILL);
        mPaintOne.setTextSize(40);

        mPaintTwo = new Paint();
        mPaintTwo.setColor(Color.GRAY);
        mPaintTwo.setStyle(Paint.Style.FILL_AND_STROKE);
        mPaintTwo.setTextSize(22);

        mPaintThree = new Paint();
        mPaintThree.setColor(Color.GRAY);
        mPaintThree.setStyle(Paint.Style.FILL_AND_STROKE);
        mPaintThree.setTextSize(20);

        mPaintFour = new Paint();
        mPaintFour.setColor(Color.RED);
        mPaintFour.setStyle(Paint.Style.FILL_AND_STROKE);
        mPaintFour.setTextSize(20);

        mPaintFive = new Paint();
        mPaintFive.setColor(Color.BLACK);
        mPaintFive.setStyle(Paint.Style.FILL);
        mPaintFive.setTextSize(20);

        mPaintLine = new Paint();
        mPaintLine.setColor(Color.GRAY);
        mPaintLine.setStyle(Paint.Style.FILL_AND_STROKE);
        mPaintLine.setTextSize(15);

    }
}
