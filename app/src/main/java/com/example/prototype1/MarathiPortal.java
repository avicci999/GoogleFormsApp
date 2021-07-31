package com.example.prototype1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;

public class MarathiPortal extends AppCompatActivity {
    RelativeLayout teach_mar, stud_mar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marathi_portal);
        teach_mar = findViewById(R.id.teacher_marathi);
        stud_mar = findViewById(R.id.student_marathi);
        teach_mar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MarathiPortal.this, MarathiTeacher_Login.class));
            }
        });
        stud_mar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MarathiPortal.this, MarathiStudent_Dashboard.class));
            }
        });
    }
}