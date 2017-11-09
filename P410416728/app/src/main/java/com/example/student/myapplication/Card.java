package com.example.student.myapplication;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.Gravity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

/**
 * Created by student on 2017/11/9.
 */

public class Card extends FrameLayout {
    public Card(@NonNull Context context) {
        super(context);
        int w=20;
        FrameLayout.LayoutParams lp = new FrameLayout.LayoutParams(w-10 ,w-10);
        lp.setMargins(5,5,5,5);

        View view = new View(context);
        view.setBackgroundColor(0x33ff00ff);
        addView(view,lp);

        tv= new TextView(context);
        // tv.setText(Integer.toString(0));
        tv.setTextSize(48);
        tv.setGravity(Gravity.CENTER);
        addView(tv,lp);



    }
    TextView tv;
    char value;

    public char getValue(){return value;}

    public void setNum( char cha )
    {
        value = cha;

             tv.setText(Integer.toString(cha));




        switch(cha)
        {
            case 'A':
                tv.setBackgroundColor(0xffcdc1b4);
                break;

            case 'B':
                tv.setBackgroundColor(0xffeee4da);
                tv.setTextColor(0xff000000);

                break;
            case 'C':
                tv.setBackgroundColor(0xffede0c8);
                tv.setTextColor(0xff000000);


                break;
            case 'D':
                tv.setBackgroundColor(0xfff2b179);
                tv.setTextColor(0xffffffff);

                break;


        }

        //   tv.setTextColor(0xffffffff);

    }
}
