package com.test;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by sun on 2017/12/17.
 */

public class SplashActivity extends FragmentActivity implements View.OnClickListener {

    private Button mButton1;
    private Button mButton2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);
        mButton1 = (Button) findViewById(R.id.button1);
        mButton2 = (Button) findViewById(R.id.button2);
        mButton1.setOnClickListener(this);
        mButton2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button1:
                Intent intent2 = new Intent(SplashActivity.this, SecondActivity.class);
                startActivity(intent2);
                break;
            case R.id.button2:
                Intent intent1 = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(intent1);

//                mButton1.postDelayed(new Runnable() {
//                    @Override
//                    public void run() {
//                        Intent intent1 = new Intent(SplashActivity.this, MainActivity.class);
//                        startActivity(intent1);
//                    }
//                },1000);
                break;
        }
    }

}
