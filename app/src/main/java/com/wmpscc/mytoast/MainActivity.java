package com.wmpscc.mytoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Toast_ mToast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mToast=Toast_.makeText(this,getString(R.string.ToastTittle),Toast.LENGTH_LONG,getResources().getDrawable(R.drawable.pic02_icon));

        mToast.setGravity(Gravity.TOP|Gravity.CENTER,0,0);
        mToast.show();
    }
}
