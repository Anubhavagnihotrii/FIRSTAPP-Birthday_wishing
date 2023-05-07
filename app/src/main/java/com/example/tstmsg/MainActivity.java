package com.example.tstmsg;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.jar.Attributes;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void CreateCard(View view)
    {
//
         EditText Name = findViewById(R.id.Name);
        String name= Name.getText().toString();

        Toast.makeText(this,"hello i made this feature ".toUpperCase()+name.toUpperCase(),Toast.LENGTH_SHORT).show();


    }



}