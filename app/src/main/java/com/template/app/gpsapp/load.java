package com.template.app.gpsapp;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

/**
 * Created by pirate on 2017-05-25.
 */

public class load extends AppCompatActivity {

    private Handler mHandler;
    private Runnable mRunnable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_load);
        Intent intent = new Intent(getApplicationContext(), main.class);
        startActivity(intent);
/*        mRunnable = new Runnable() {
            @Override
            public void run() {


            }
        };
        mHandler = new Handler();
        Log.d("test", "onCreateOptionsMenu - 최초 메뉴키를 눌렀을 때 호출됨");

        mHandler.postDelayed(mRunnable, 3000);*/
    }
}
