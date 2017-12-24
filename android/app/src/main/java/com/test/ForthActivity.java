package com.test;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.facebook.react.ReactActivity;

/**
 * Created by sun on 2017/12/24.
 */

public class ForthActivity extends ReactActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    private static final String TAG = ForthActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "ForthActivity ");
    }

    /**
     * Returns the name of the main component registered from JavaScript.
     * This is used to schedule rendering of the component.
     */
    @Override
    protected String getMainComponentName() {
        Log.d("lidexian", "ThirdActivity");
        return "third";
    }


    public void testOne() {
        Toast.makeText(ForthActivity.this, "34234test", Toast.LENGTH_LONG).show();
        Toast.makeText(ForthActivity.this, "testOne", Toast.LENGTH_LONG).show();
        Toast.makeText(ForthActivity.this, "", Toast.LENGTH_LONG).show();
    }
}