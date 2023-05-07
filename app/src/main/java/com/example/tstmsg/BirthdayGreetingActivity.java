package com.example.tstmsg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class BirthdayGreetingActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birthday_greeting);

        Intent intent = getIntent();
        String data = intent.getStringExtra("name");
        TextView tv = findViewById(R.id.birthdayGreetings);
        tv.setText(String.format("Happy Birthday %s", data));
    }



}