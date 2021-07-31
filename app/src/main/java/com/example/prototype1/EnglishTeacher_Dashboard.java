package com.example.prototype1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class EnglishTeacher_Dashboard extends AppCompatActivity {
    AppCompatButton b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english_teacher__dashboard);
        b1 = findViewById(R.id.continue_teach_eng);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(EnglishTeacher_Dashboard.this, EnglishTeacher_Select.class));
            }
        });
    }
}