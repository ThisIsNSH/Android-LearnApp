package com.nora.nsh.nora;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class one extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            Window w = getWindow(); // in Activity's onCreate() for instance
            w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        }
    final TextView text = (TextView)findViewById(R.id.text);
        final LinearLayout scroll = (LinearLayout) findViewById(R.id.scroll);
        Animation anim2 = AnimationUtils.loadAnimation(one.this, R.anim.translate7);
        Animation a1 = AnimationUtils.loadAnimation(this, R.anim.translate2);
 text.startAnimation(a1);

        scroll.startAnimation(anim2);
        scroll.postDelayed(new Runnable() {
            public void run() {
                scroll.setVisibility(View.VISIBLE);

            }
        }, 0);


    }
}
