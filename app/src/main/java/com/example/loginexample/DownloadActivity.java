package com.example.loginexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DownloadActivity extends AppCompatActivity {

    Button buttonStart, buttonStop, buttonHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_download);

        buttonStart = findViewById(R.id.buttonStart);
        buttonStop = findViewById(R.id.buttonStop);
        buttonHome = findViewById(R.id.buttonHome);
    }

    public void navigateHomeFunction(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void stopActivityFunction(View view) {
        stopService(new Intent(this, MyService.class));

    }

    public void startActivityFunction(View view) {
        startService(new Intent(this, MyService.class));
    }
}