package com.example.prototype1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MararthiTeacher_Dashboard extends AppCompatActivity {
    AppCompatButton b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mararthi_teacher__dashboard);
        b1 = findViewById(R.id.continue_teach_mar);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MararthiTeacher_Dashboard.this, MarathiTeacher_Select.class));
            }
        });
    }
}