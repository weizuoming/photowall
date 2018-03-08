package com.example.hello.photowall.activities;

import android.app.Application;

import com.bumptech.glide.request.target.ViewTarget;
import com.example.hello.photowall.R;

/**
 * Created by 韦作铭 on 2018/3/8.
 */

public class App extends Application {
    @Override public void onCreate() {
        super.onCreate();
        ViewTarget.setTagId(R.id.glide_tag);
    }
}
