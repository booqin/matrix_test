package com.example.simple;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

public class MyBitmapView extends View {
    private int width;
    private int height;
    private Paint paint;
    private Matrix matrix;
    private int BitmapWidth;
    private int BitmapHeight;
    private Bitmap bitmap;

    public MyBitmapView(Context context, AttributeSet attrs) {
        super(context, attrs);
        paint=new Paint();
        paint.setAlpha(150);
        bitmap= BitmapFactory.decodeResource(getResources(), R.mipmap.test_bitmap_320);
        BitmapHeight=bitmap.getHeight();
        BitmapWidth=bitmap.getWidth();
        matrix=new Matrix();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        canvas.drawBitmap(bitmap, 0, 0, paint);

        //缩放
//        matrix.reset();
//        matrix.postScale(2, 2) ;
//        canvas.drawBitmap(bitmap, matrix, paint);

        //平移
//        matrix.reset();
//        matrix.postTranslate(BitmapWidth/2, BitmapHeight/2);
//        canvas.drawBitmap(bitmap, matrix, paint);

        //旋转180°,平移
//        matrix.reset();
//        matrix.postRotate(10);
//        matrix.preTranslate(0, BitmapHeight / 3);
//        matrix.postTranslate(0, BitmapHeight / 3);
//        canvas.drawBitmap(bitmap, matrix, paint);
//
        //侧切
//        matrix.reset();
//        matrix.preSkew(0, 1);
//        canvas.drawBitmap(bitmap, matrix, paint);
//
//        //水平对称
//        matrix.reset();
//        float matrix_values[]={1f,0f,0f,0f,-1f,0f,0f,0f,1f};
//        matrix.setValues(matrix_values);
//        matrix.postTranslate(0, BitmapHeight * 3);
//        canvas.drawBitmap(bitmap, matrix, paint);
//
//        //垂直对称
//        matrix.reset();
//        float matrix_values2[]={-1f,0f,0f,0f,1f,0f,0f,0f,1f};
//        matrix.setValues(matrix_values2);
//        matrix.postTranslate(BitmapWidth*3,0);
//        canvas.drawBitmap(bitmap,matrix,paint);


        canvas.drawBitmap(bitmap, matrix, paint);


    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        width = getDefaultSize(getSuggestedMinimumWidth(), widthMeasureSpec);
        height = getDefaultSize(getSuggestedMinimumHeight(), heightMeasureSpec);
        setMeasuredDimension(width, height);


    }

    public Matrix setTranslate(){
        matrix.reset();
        matrix.postTranslate(BitmapWidth/4, BitmapHeight/4);
        Log.d("BQ", matrix.toShortString());
        invalidate();
        return matrix;
    }
    public Matrix setRotate(){
        matrix.reset();
        matrix.postRotate(10);
        Log.d("BQ", matrix.toShortString());
        invalidate();
        return matrix;
    }
    public Matrix setScale(){
        matrix.reset();
        matrix.postScale(0.8f, 0.8f) ;
        Log.d("BQ", matrix.toShortString());
        invalidate();
        return matrix;
    }
    public Matrix setSkew(){
        matrix.reset();
        matrix.preSkew(0, 1);
        Log.d("BQ", matrix.toShortString());
        invalidate();
        return matrix;
    }
}
