package com.example.loginexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 *
 * Intent >> 1. Explicit Intent >> target component
 *           2. Implicit Intent >> action
 */
public class MainActivity extends AppCompatActivity {

    private static final String LOG_TAG = "LIFECYCLE";
    public static final String EXTRA_MESSAGE = "EXTRA_MESSAGE";
    EditText mMessageEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mMessageEditText = findViewById(R.id.editText_main);

        Log.d(LOG_TAG, "onCreate");
    }

    public void launchSecondActivity(View view) {
        String message = mMessageEditText.getText().toString();

        /*Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("smsto: +20013545842"));
        intent.putExtra("sms_body", "Hello from the android");*/

        /*Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel: +200534845321"));*/

        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:"));

        intent.putExtra(Intent.EXTRA_TEXT, "Hello World its the body");
        intent.putExtra(Intent.EXTRA_SUBJECT, "Subject");


        startActivity(intent);
    }
}

/**
 * Activity >> back-stack
 * last in first out
 *
 * startActivity
 * startService
 * sendBroadcast
 * Pass data
 *
 */