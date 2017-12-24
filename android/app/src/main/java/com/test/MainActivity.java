package com.test;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends FragmentActivity implements View.OnClickListener {

    private Button mButton1;
    private Button mButton2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("lidexian", "MainActivity onCreate start");
        setContentView(R.layout.second_activity);
        Log.d("lidexian", "MainActivity onCreate end");
        mButton1 = (Button) findViewById(R.id.button1);
        mButton2 = (Button) findViewById(R.id.button2);
        mButton1.setOnClickListener(this);
        mButton2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button1:
                Intent intent1 = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent1);
//                break;
//            case R.id.button2:
                Intent intent2 = new Intent(MainActivity.this, ThirdActivity.class);
                startActivity(intent2);
                break;
        }
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.d("lidexian", "MainActivity onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("lidexian", "MainActivity onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("lidexian", "MainActivity onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("lidexian", "MainActivity onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("lidexian", "MainActivity onDestroy");
    }

}
