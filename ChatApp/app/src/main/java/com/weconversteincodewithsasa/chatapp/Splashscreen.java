package com.weconversteincodewithsasa.chatapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class Splashscreen extends AppCompatActivity {

    private Intent MainActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);


        Thread thread = new Thread() {
            @Override
            public void run() {


                try {
                    sleep(6000);

                } catch (Exception e) {

                    e.printStackTrace();

                } finally {
                    Intent welcomeIntent = new Intent(Splashscreen.this.MainActivity.class);

                }

            }


               thread.start()
        };
        {
            protected void onPause();
            super.onPause();
            finish();
        }
    }
}