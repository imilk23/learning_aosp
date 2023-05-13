package com.example.myintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class ThirdActivity extends AppCompatActivity {
    private static final String TAG = "ThirdActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        Intent intent = getIntent();
        int a = intent.getIntExtra("a", 0);
        int b = intent.getIntExtra("b", 0);

        int sum = a + b;
        Log.d(TAG, "a + b =  " + sum);
        Toast.makeText(this, "a+b= " + sum, Toast.LENGTH_SHORT).show();
    }
}