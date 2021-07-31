package com.example.prototype1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;

public class HindiPortal extends AppCompatActivity {
    RelativeLayout teach_hin, stud_hin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hindi_portal);
        teach_hin = findViewById(R.id.teacher_hindi);
        stud_hin = findViewById(R.id.student_hindi);
        teach_hin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HindiPortal.this, HindiTeacher_Login.class));
            }
        });
        stud_hin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HindiPortal.this, HindiStudent_Dashboard.class));
            }
        });
    }
}