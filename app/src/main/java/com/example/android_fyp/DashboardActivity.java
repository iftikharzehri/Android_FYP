package com.example.android_fyp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;


public class DashboardActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        Button btn = (Button) findViewById(R.id.loginbtn);
        btn.setOnClickListener(view -> {
            Intent intent  = new Intent(DashboardActivity.this, LoginActivity.class);
            startActivity(intent);
        });


    }
}