package com.example.prototype1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class HindiStudent_Select extends AppCompatActivity implements  AdapterView.OnItemSelectedListener{
    Spinner std, subject;
    String[] subHinArr = {"English", "Hindi", "Marathi", "Geography", "History", "Science"};
    String[] stdHinArr = {"1st Standard", "2nd Standard", "3rd Standard", "4th Standard", "5th Standard", "6th Standard", "7th Standard", "8th Standard", "9th Standard", "10th Standard"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hindi_student__select);
        std = findViewById(R.id.std_hin);
        subject = findViewById(R.id.sub_hin);
        std.setOnItemSelectedListener(this);
        ArrayAdapter adapter_std = new ArrayAdapter(this, android.R.layout.simple_spinner_item, stdHinArr);
        adapter_std.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        std.setAdapter(adapter_std);
        subject.setOnItemSelectedListener(this);
        ArrayAdapter adapter_sub = new ArrayAdapter(this, android.R.layout.simple_spinner_item, subHinArr);
        adapter_std.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        subject.setAdapter(adapter_sub);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String substring = (String) subject.getSelectedItem();
        String stdstring = (String) std.getSelectedItem();
        String query = stdstring+", "+substring;
        Toast.makeText(getApplicationContext(), query, Toast.LENGTH_LONG).show();

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}