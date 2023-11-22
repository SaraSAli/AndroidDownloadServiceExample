package com.example.loginexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 *         String downloadUrl = "https://example.com/file/sample.pdf";
 */
public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent i = getIntent();
        String message = i.getStringExtra(MainActivity.EXTRA_MESSAGE);

        TextView textView = findViewById(R.id.text_message);
        textView.setText(message);
    }

    public void navigateServiceScreen(View view) {
        startActivity(new Intent(this, DownloadActivity.class));
    }
}

/**
 * Start Service >> Unbound Service >> No interaction
 *  startService, stopService
 *      Start media player
 * Bound Service >> Bind with component
 *  bindService, unboundService
 *      to get Information
 */