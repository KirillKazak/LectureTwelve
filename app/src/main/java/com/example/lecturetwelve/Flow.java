package com.example.lecturetwelve;

import android.util.Log;

public class Flow implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            Log.i("TAG", String.valueOf(i));
        }
    }
}
