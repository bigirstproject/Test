package com.test;

import android.util.Log;

import com.facebook.react.ReactActivity;

/**
 * Created by sun on 2017/12/17.
 */

public class ThirdActivity extends ReactActivity {

    /**
     * Returns the name of the main component registered from JavaScript.
     * This is used to schedule rendering of the component.
     */
    @Override
    protected String getMainComponentName() {
        Log.d("lidexian","ThirdActivity");
        return "third";
    }
}
