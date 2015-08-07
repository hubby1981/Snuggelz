package com.games.biitworx.snuggelz.views;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;

import com.games.biitworx.snuggelz.R;

/**
 * Created by WEIS on 07.08.2015.
 */
public class GameView extends View {
    public GameView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }


    @Override
    protected void onDraw(Canvas canvas)
    {


             Bitmap bm1 = BitmapFactory.decodeResource(getContext().getResources(), R.drawable.snuggel_front_green);
             Bitmap bm2 = BitmapFactory.decodeResource(getContext().getResources(), R.drawable.snuggel_front_blue);
             Bitmap bm3 = BitmapFactory.decodeResource(getContext().getResources(), R.drawable.snuggel_front_red);
             Bitmap bm4 = BitmapFactory.decodeResource(getContext().getResources(), R.drawable.snuggel_front_orange);
             Bitmap bm5 = BitmapFactory.decodeResource(getContext().getResources(), R.drawable.snuggel_front_yellow);
             Bitmap bm6 = BitmapFactory.decodeResource(getContext().getResources(), R.drawable.snuggel_front_black);
             Bitmap bm7 = BitmapFactory.decodeResource(getContext().getResources(), R.drawable.snuggel_front_pink);
             Bitmap bm8 = BitmapFactory.decodeResource(getContext().getResources(), R.drawable.snuggel_front_violett);
             Bitmap bm9 = BitmapFactory.decodeResource(getContext().getResources(), R.drawable.snuggel_front_aqua);


                canvas.drawBitmap(bm1,100,100,null);
                canvas.drawBitmap(bm2,300,100,null);
                canvas.drawBitmap(bm3,500,100,null);
                canvas.drawBitmap(bm4,100,300,null);
                canvas.drawBitmap(bm5,300,300,null);
                canvas.drawBitmap(bm6,500,300,null);
                canvas.drawBitmap(bm7,100,500,null);
                canvas.drawBitmap(bm8,300,500,null);
                canvas.drawBitmap(bm9,500,500,null);

    }
}
