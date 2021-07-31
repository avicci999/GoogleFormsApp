package com.example.prototype1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class EnglishPortal extends AppCompatActivity {
    RelativeLayout teach, stud;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english_portal);
        teach = findViewById(R.id.teacher_english);
        stud = findViewById(R.id.student_english);
        teach.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(EnglishPortal.this, EnglishTeacher_Login.class));
            }
        });
        stud.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(EnglishPortal.this, EnglishStudent_Dashboard.class));
            }
        });
    }
}