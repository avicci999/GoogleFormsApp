package com.example.prototype1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class EnglishTeacher_Login extends AppCompatActivity {
    AppCompatButton login_eng;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english_teacher__login);
        login_eng = findViewById(R.id.loginbutton_eng);
        login_eng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(EnglishTeacher_Login.this, EnglishTeacher_Dashboard.class));
            }
        });
    }
}