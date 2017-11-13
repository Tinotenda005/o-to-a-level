package com.example.student_01.otoalevel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {
    private TextView final_result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        final_result = (TextView)findViewById(R.id.final_result);

        final_result.setText(getIntent().getStringExtra("final_subjects_selection"));


    }
}
