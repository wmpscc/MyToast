package com.wmpscc.mytoast;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by wmpscc on 2017/10/9.
 */

public class Toast_ {
    private Toast mToast;
    private Toast_(Context context, CharSequence text, int duration) {
        View v = LayoutInflater.from(context).inflate(R.layout.toast_text, null);
        TextView textView = v.findViewById(R.id.toast_text_tv);
        textView.setText(text);
        mToast = new Toast(context);
        mToast.setDuration(duration);
        mToast.setView(v);
    }

    public static Toast_ makeText(Context context, CharSequence  text, int duration) {
        return new Toast_(context, text, duration);
    }

    public static Toast_ makeText(Context context,CharSequence text,int duration,Drawable imageurl){

        return new Toast_(context,text,duration,imageurl);
    }

    public Toast_(Context context,CharSequence text,int duration,Drawable imageurl){
        View v=LayoutInflater.from(context).inflate(R.layout.toast_text_image,null);
        TextView tv=v.findViewById(R.id.toast_text_image_tv);
        tv.setText(text);
        ImageView iv=v.findViewById(R.id.toast_text_image_iv);
        iv.setImageDrawable(imageurl);
        mToast=new Toast(context);
        mToast.setDuration(duration);
        mToast.setView(v);

    }
    public void show() {
        if (mToast != null) {
            mToast.show();
        }
    }
    public void setGravity(int gravity, int xOffset, int yOffset) {
        if (mToast != null) {
            mToast.setGravity(gravity, xOffset, yOffset);
        }
    }
}
