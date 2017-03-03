package com.openxu.svg;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Drawable drawable = getResources().getDrawable(R.drawable.animatedvectordrawable);
        if (drawable instanceof Animatable) { ((Animatable) drawable).start(); }
    }
}
