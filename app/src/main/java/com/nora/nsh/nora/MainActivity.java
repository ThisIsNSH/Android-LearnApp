package com.nora.nsh.nora;

import android.Manifest;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.os.Build;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            Window w = getWindow(); // in Activity's onCreate() for instance
            w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        }
        final Button button = (Button) findViewById(R.id.button);
        final LinearLayout linear = (LinearLayout) findViewById(R.id.box);
        final TextView top = (TextView) findViewById(R.id.top);
        final LinearLayout top1 = (LinearLayout) findViewById(R.id.top1);
        final TextView top2 = (TextView) findViewById(R.id.textView);
        final Button one = (Button) findViewById(R.id.one);
        final Button two = (Button) findViewById(R.id.two);
        final Button three = (Button) findViewById(R.id.third);
        final Button four = (Button) findViewById(R.id.four);
        final Button five = (Button) findViewById(R.id.five);



        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                Animation anim2 = AnimationUtils.loadAnimation(MainActivity.this, R.anim.translate5);
               // Animation anim = AnimationUtils.loadAnimation(MainActivity.this, R.anim.translate1);
                Animation anim1 = AnimationUtils.loadAnimation(MainActivity.this, R.anim.translate4);

                ObjectAnimator anim4 = ObjectAnimator.ofFloat(one,"alpha",0,1).setDuration(500);
                ObjectAnimator anim5 = ObjectAnimator.ofFloat(two,"alpha",0,1).setDuration(500);
                ObjectAnimator anim6 = ObjectAnimator.ofFloat(three,"alpha",0,1).setDuration(500);
                ObjectAnimator anim7 = ObjectAnimator.ofFloat(four,"alpha",0,1).setDuration(500);
                ObjectAnimator anim8 = ObjectAnimator.ofFloat(five,"alpha",0,1).setDuration(500);


                anim2.setDuration(500);
                anim1.setDuration(500);
               // anim.setDuration(500);

                top.startAnimation(anim2);
                top1.startAnimation(anim2);
                top2.startAnimation(anim2);
                button.startAnimation(anim1);





                //linear.startAnimation(anim);


                button.postDelayed(new Runnable() {
                    public void run() {
                        button.setVisibility(View.INVISIBLE);

                    }
                }, 0);

                top.postDelayed(new Runnable() {
                    public void run() {
                        top.setVisibility(View.INVISIBLE);

                    }
                }, 00);

                top1.postDelayed(new Runnable() {
                    public void run() {
                        top1.setVisibility(View.INVISIBLE);

                    }
                }, 00);

                top2.postDelayed(new Runnable() {
                    public void run() {
                        top2.setVisibility(View.INVISIBLE);
                        linear.setVisibility(View.VISIBLE);
                    }
                }, 00);

anim4.setStartDelay(300);
                anim4.start();
                anim4.addListener(new AnimatorListenerAdapter() {
                    public void onAnimationStart(Animator animation) {
                        one.setVisibility(View.VISIBLE);

                    }});

                one.postDelayed(new Runnable() {
                    public void run() {
                        //enterReveal();

                        top.setText("Menu");
                        Animation anim3 = AnimationUtils.loadAnimation(MainActivity.this, R.anim.translate6);
                        anim3.setDuration(500);
                        anim3.setStartOffset(00);

                        top.startAnimation(anim3);



                        top.postDelayed(new Runnable() {
                            public void run() {
                                top.setVisibility(View.VISIBLE);

                            }
                        }, 00);
                        top1.startAnimation(anim3);

                        top1.postDelayed(new Runnable() {
                            public void run() {
                                top1.setVisibility(View.VISIBLE);

                            }
                        }, 00);
                        top2.startAnimation(anim3);
                        top2.postDelayed(new Runnable() {
                            public void run() {
                                top2.setVisibility(View.VISIBLE);

                            }
                        }, 00);



                    }
                }, 0);

            anim5.setStartDelay(600);
            anim5.start();
                anim5.addListener(new AnimatorListenerAdapter() {
                    public void onAnimationStart(Animator animation) {
                        two.setVisibility(View.VISIBLE);

                    }});


                anim6.setStartDelay(900);
                anim6.start();

                anim6.addListener(new AnimatorListenerAdapter() {
                    public void onAnimationStart(Animator animation) {
                        three.setVisibility(View.VISIBLE);

                    }});

                anim7.setStartDelay(1200);
                anim7.start();
                anim7.addListener(new AnimatorListenerAdapter() {
                    public void onAnimationStart(Animator animation) {
                        four.setVisibility(View.VISIBLE);

                    }});

                anim8.setStartDelay(1500);
                anim8.start();
                anim8.addListener(new AnimatorListenerAdapter() {
                    public void onAnimationStart(Animator animation) {
                        five.setVisibility(View.VISIBLE);

                    }});

            }
        });



        Animation a = AnimationUtils.loadAnimation(this, R.anim.translate);
        button.startAnimation(a);
        Animation a1 = AnimationUtils.loadAnimation(this, R.anim.translate2);


        top.startAnimation(a1);
        top1.startAnimation(a1);
        top2.startAnimation(a1);


    }

   /* private void enterReveal() {
        LinearLayout rootLayout = (LinearLayout) findViewById(R.id.box);
        int cx = rootLayout.getWidth() / 2;
        int cy = rootLayout.getHeight() / 2;

        float finalRadius = Math.max(rootLayout.getWidth(), rootLayout.getHeight());

        // create the animator for this view (the start radius is zero)
        Animator circularReveal = ViewAnimationUtils.createCircularReveal(rootLayout, cx, cy, 0, finalRadius);
        circularReveal.setDuration(600);

        // make the view visible and start the animation
        rootLayout.setVisibility(View.VISIBLE);
        circularReveal.start();
    }
*/

    public void one(View view)
    {// Ordinary Intent for launching a new activity
        Intent intent = new Intent(this, one.class);

        // Get the transition name from the string
        String transitionName = getString(R.string.string1);

        // Define the view that the animation will start from
        View viewStart = findViewById(R.id.one);

        ActivityOptionsCompat options =

                ActivityOptionsCompat.makeSceneTransitionAnimation(this,
                        viewStart,   // Starting view
                        transitionName    // The String
                );
        //Start the Intent
        ActivityCompat.startActivity(this, intent, options.toBundle());
        }
    public void two(View view)
    {// Ordinary Intent for launching a new activity
        Intent intent = new Intent(this, two.class);

        // Get the transition name from the string
        String transitionName = getString(R.string.string2);

        // Define the view that the animation will start from
        View viewStart = findViewById(R.id.two);

        ActivityOptionsCompat options =

                ActivityOptionsCompat.makeSceneTransitionAnimation(this,
                        viewStart,   // Starting view
                        transitionName    // The String
                );
        //Start the Intent
        ActivityCompat.startActivity(this, intent, options.toBundle());
    }
    public void third(View view)
    {// Ordinary Intent for launching a new activity
        Intent intent = new Intent(this, third.class);

        // Get the transition name from the string
        String transitionName = getString(R.string.string3);

        // Define the view that the animation will start from
        View viewStart = findViewById(R.id.third);

        ActivityOptionsCompat options =

                ActivityOptionsCompat.makeSceneTransitionAnimation(this,
                        viewStart,   // Starting view
                        transitionName    // The String
                );
        //Start the Intent
        ActivityCompat.startActivity(this, intent, options.toBundle());
    }
    public void four(View view)
    {// Ordinary Intent for launching a new activity
        Intent intent = new Intent(this, four.class);

        // Get the transition name from the string
        String transitionName = getString(R.string.string4);

        // Define the view that the animation will start from
        View viewStart = findViewById(R.id.four);

        ActivityOptionsCompat options =

                ActivityOptionsCompat.makeSceneTransitionAnimation(this,
                        viewStart,   // Starting view
                        transitionName    // The String
                );
        //Start the Intent
        ActivityCompat.startActivity(this, intent, options.toBundle());
    }
    public void five(View view)
    {// Ordinary Intent for launching a new activity
        Intent intent = new Intent(this, five.class);

        // Get the transition name from the string
        String transitionName = getString(R.string.string5);

        // Define the view that the animation will start from
        View viewStart = findViewById(R.id.five);

        ActivityOptionsCompat options =

                ActivityOptionsCompat.makeSceneTransitionAnimation(this,
                        viewStart,   // Starting view
                        transitionName    // The String
                );
        //Start the Intent
        ActivityCompat.startActivity(this, intent, options.toBundle());
    }

}
