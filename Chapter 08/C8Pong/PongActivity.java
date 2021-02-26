package com.gamecodeschool.pong;

import android.app.Activity;
import android.view.Window;

import android.os.Bundle;

public class PongActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
    }
}