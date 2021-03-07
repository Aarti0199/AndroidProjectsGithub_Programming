package com.example.aartisharma.truth;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
Handler h;
int t=3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
h=new Handler();
        h.postDelayed(new Runnable() {
                          @Override
                          public void run() {
                              Intent i = new Intent(MainActivity.this, Splash.class);
                              startActivity(i);
                              finish();
                          }
                      }, t
        );


    }
}
