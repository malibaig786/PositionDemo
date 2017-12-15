package com.malibaig.positiondemo;

import android.animation.Animator;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final String LOG_TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv1, tv2;
        tv1 = (TextView) findViewById(R.id.tv_1);
        tv2 = (TextView) findViewById(R.id.tv_2);

        Log.d(LOG_TAG, "TV1:getLeft:" + tv1.getLeft());
        Log.d(LOG_TAG, "TV1:getTop:" + tv1.getTop());
        Log.d(LOG_TAG, "TV1:getY:" + tv1.getY());
        Log.d(LOG_TAG, "TV1:getX:" + tv1.getX());
        Log.d(LOG_TAG, "TV1:getWidth:" + tv1.getWidth());
        Log.d(LOG_TAG, "TV1:getHeight:" + tv1.getHeight());
        Log.d(LOG_TAG, "TV1:getRight:" + tv1.getRight());
        Log.d(LOG_TAG, "TV1:getBottom:" + tv1.getBottom());

        Log.d(LOG_TAG, "");
        Log.d(LOG_TAG, "");
        Log.d(LOG_TAG, "");

        Log.d(LOG_TAG, "TV2:getLeft:" + tv2.getLeft());
        Log.d(LOG_TAG, "TV2:getTop:" + tv2.getTop());
        Log.d(LOG_TAG, "TV2:getY:" + tv2.getY());
        Log.d(LOG_TAG, "TV2:getX:" + tv2.getX());
        Log.d(LOG_TAG, "TV2:getWidth:" + tv2.getWidth());
        Log.d(LOG_TAG, "TV2:getHeight:" + tv2.getHeight());
        Log.d(LOG_TAG, "TV2:getRight:" + tv2.getRight());
        Log.d(LOG_TAG, "TV2:getBottom:" + tv2.getBottom());
    }

    public void onButtonClicked(View view) {
        TextView tv1, tv2;
        tv1 = (TextView) findViewById(R.id.tv_1);
        tv2 = (TextView) findViewById(R.id.tv_2);

        Log.d(LOG_TAG, "TV1:getLeft:" + tv1.getLeft());
        Log.d(LOG_TAG, "TV1:getTop:" + tv1.getTop());
        Log.d(LOG_TAG, "TV1:getY:" + tv1.getY());
        Log.d(LOG_TAG, "TV1:getX:" + tv1.getX());
        Log.d(LOG_TAG, "TV1:getWidth:" + tv1.getWidth());
        Log.d(LOG_TAG, "TV1:getHeight:" + tv1.getHeight());
        Log.d(LOG_TAG, "TV1:getRight:" + tv1.getRight());
        Log.d(LOG_TAG, "TV1:getBottom:" + tv1.getBottom());

        Log.d(LOG_TAG, "");
        Log.d(LOG_TAG, "");
        Log.d(LOG_TAG, "");

        Log.d(LOG_TAG, "TV2:getLeft:" + tv2.getLeft());
        Log.d(LOG_TAG, "TV2:getTop:" + tv2.getTop());
        Log.d(LOG_TAG, "TV2:getY:" + tv2.getY());
        Log.d(LOG_TAG, "TV2:getX:" + tv2.getX());
        Log.d(LOG_TAG, "TV2:getWidth:" + tv2.getWidth());
        Log.d(LOG_TAG, "TV2:getHeight:" + tv2.getHeight());
        Log.d(LOG_TAG, "TV2:getRight:" + tv2.getRight());
        Log.d(LOG_TAG, "TV2:getBottom:" + tv2.getBottom());

        int cx = tv2.getRight() - (tv2.getWidth() / 2);
        int cy = tv2.getBottom() - (tv2.getHeight() / 2);

        View layout = findViewById(R.id.layout);
        int layoutCx = layout.getWidth() / 2;
        int layoutCy = layout.getHeight() / 2;

        float finalRadius = (float) Math.max(layoutCx, layoutCy);


        final Animator valueAnimator = ViewAnimationUtils.createCircularReveal(layout, cx, cy, 0, layout.getHeight());
        valueAnimator.setDuration(600);
        layout.setVisibility(View.VISIBLE);
        valueAnimator.start();

    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);

        TextView tv1;
        tv1 = (TextView) findViewById(R.id.tv_1);

        Log.d(LOG_TAG, "TV1:getLeft:" + tv1.getLeft());
        Log.d(LOG_TAG, "TV1:getTop:" + tv1.getTop());
        Log.d(LOG_TAG, "TV1:getY:" + tv1.getY());
        Log.d(LOG_TAG, "TV1:getX:" + tv1.getX());
    }
}
