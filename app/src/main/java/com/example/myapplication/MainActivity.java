package com.example.myapplication;

import android.annotation.SuppressLint;
import android.util.Log;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @SuppressLint({"WrongConstant", "ResourceType"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv = new TextView(this);
        String s = "fff";
        tv.setText(s);
        System.out.println();
        System.out.println(123213);
        Log.i(s,s);
    }
}
