package com.example.javier.exam2;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

/**
 * Created by javier on 7/03/16.
 */
public class splash extends Activity {

    /** Duration of wait **/
    private final int SPLASH_DISPLAY_LENGTH = 3000;
    private TextView text, text2;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.splash);
        Typeface custom_font = Typeface.createFromAsset(getAssets(), "fonts/AmaticSC-Regular.ttf");
        text = (TextView) findViewById(R.id.title);
        text2 = (TextView) findViewById(R.id.title2);
        text.setTypeface(custom_font);
        text2.setTypeface(custom_font);
        text.startAnimation(AnimationUtils.loadAnimation(splash.this, R.anim.grow_disappear_animation));
        text2.startAnimation(AnimationUtils.loadAnimation(splash.this, R.anim.grow_disappear_animation));
        /* New Handler to start the Menu-Activity
         * and close this Splash-Screen after some seconds.*/
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                /* Create an Intent that will start the Menu-Activity. */
                Intent mainIntent = new Intent(splash.this, Login.class);
                splash.this.startActivity(mainIntent);
                splash.this.finish();
            }
        }, SPLASH_DISPLAY_LENGTH);
    }

}
