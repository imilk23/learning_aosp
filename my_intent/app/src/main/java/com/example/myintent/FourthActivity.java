package com.example.myintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class FourthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        Intent intent = getIntent();
        int a = intent.getIntExtra("a", 0);
        int b = intent.getIntExtra("b", 0);

        int sum = a + b;

        Intent data = new Intent();
        data.putExtra("result", sum);
        // Activity finished ok, return the data
        setResult(RESULT_OK, data);
        finish();
    }
}