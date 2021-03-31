package com.example.lecturetwelve;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {
    Thread tread1 = new Thread(new Flow());

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        goThread();

    }

    private void goThread() {
        Button startFlow = findViewById(R.id.startFlow);
        startFlow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tread1.start();
                Toast.makeText(v.getContext(), "num" + tread1.getState(), Toast.LENGTH_LONG);
            }
        });

    }
}