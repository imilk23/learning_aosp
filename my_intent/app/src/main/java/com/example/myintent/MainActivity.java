package com.example.myintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = "MainActivity";
    private static final int REQUEST_CODE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View button1 = findViewById(R.id.button_1);
        View button2 = findViewById(R.id.button_2);
        View button3 = findViewById(R.id.button_3);
        View button4 = findViewById(R.id.button_4);
        View button5 = findViewById(R.id.button_5);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            // TODO your logic to evaluate the indivual button
            case R.id.button_1:
                // start activity
                Intent intent1 = new Intent(this, SecondActivity.class);
                startActivity(intent1);
                break;

            case R.id.button_2:
                // start activity with data
                Intent intent2 = new Intent(this, ThirdActivity.class);
                intent2.putExtra("a", 10);
                intent2.putExtra("b", 10);
                startActivity(intent2);
                break;

            case R.id.button_3:
                // start activity for result
                Intent intent3 = new Intent(this, FourthActivity.class);
                intent3.putExtra("a", 10);
                intent3.putExtra("b", 10);
                startActivityForResult(intent3, REQUEST_CODE);
                break;

            case R.id.button_4:
                // start service
                Intent intent4 = new Intent(this, StartedService.class);
                startService(intent4);
                break;

            case R.id.button_5:
                // stop service
                Intent intent5 = new Intent(this, StartedService.class);
                stopService(intent5);
                break;

            default:
                Log.d(TAG, "onClick: Undefine behaviour");
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (resultCode == RESULT_OK && requestCode == REQUEST_CODE) {
            int result = data.getIntExtra("result", 0);
            Toast.makeText(this, "result = " + result,
                        Toast.LENGTH_SHORT).show();
        }
    }
}