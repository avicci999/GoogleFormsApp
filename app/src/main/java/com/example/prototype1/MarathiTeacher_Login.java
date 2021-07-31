package com.example.prototype1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MarathiTeacher_Login extends AppCompatActivity {
    AppCompatButton b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marathi_teacher__login);
        b1 = findViewById(R.id.loginbutton_mar);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MarathiTeacher_Login.this, MararthiTeacher_Dashboard.class));
            }
        });
    }
}