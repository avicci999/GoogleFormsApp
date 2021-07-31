package com.example.prototype1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MarathiStudent_Dashboard extends AppCompatActivity {
    AppCompatButton b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marathi_student__dashboard);
        b1 = findViewById(R.id.continue_mar);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MarathiStudent_Dashboard.this, MarathiStudent_Select.class));
            }
        });
    }
}