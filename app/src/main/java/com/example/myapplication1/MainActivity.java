package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView_fname = findViewById(R.id.textView_fname);
        textView_fname.setText("ΦΩΤΗΣ");

        TextView textView_lname = findViewById(R.id.textView_lname);
        textView_lname.setText("ΖΗΣΟΓΛΟΥ");
    }
}