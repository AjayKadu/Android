package com.sunbeam;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    FrameLayout frameLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        frameLayout=findViewById(R.id.frameLayout);

    }

    public void first(View v){
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.frameLayout,new FirstFragment())
                .commit();
    }

    public void second(View v){
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.frameLayout, new SecondFragment())
                .commit();
    }

    public void third(View v){
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.frameLayout,new ThirdFragment())
                .commit();
    }

}