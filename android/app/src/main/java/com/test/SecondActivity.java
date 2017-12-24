package com.test;

import android.os.Bundle;
import android.util.Log;

import com.facebook.react.ReactActivity;

/**
 * Created by sun on 2017/12/17.
 */

public class SecondActivity extends ReactActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("lidexian", "SecondActivity  onCreate start");
        setContentView(R.layout.second_text_activity);
        super.onCreate(savedInstanceState);
        Log.d("lidexian", "SecondActivity  onCreate end");
    }

    /**
     * Returns the name of the main component registered from JavaScript.
     * This is used to schedule rendering of the component.
     */
    @Override
    protected String getMainComponentName() {
        Log.d("lidexian", "SecondActivity getMainComponentName second");
        return "second";
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("lidexian", "SecondActivity onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("lidexian", "SecondActivity onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("lidexian", "SecondActivity onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("lidexian", "SecondActivity onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("lidexian", "SecondActivity onDestroy");
    }
}
