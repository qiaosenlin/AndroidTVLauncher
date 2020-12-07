package com.jacky.launcher.detail;

import android.app.Activity;
import android.os.Bundle;

import com.jacky.launcher.R;


public class MediaDetailsActivity extends Activity {

    public static final String MEDIA = "Media";
    public static final String SHARED_ELEMENT_NAME = "hero";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
    }
}