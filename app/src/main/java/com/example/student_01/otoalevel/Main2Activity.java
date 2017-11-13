package com.example.student_01.otoalevel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static com.example.student_01.otoalevel.R.id.btnlogin;


public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        final EditText mUsername= (EditText) findViewById(R.id.mUsername);
        TextView tvUsername = (TextView) findViewById(R.id.tvUsername);
        Button mLoginButton= (Button) findViewById(btnlogin);

        mLoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = mUsername.getText().toString();
                startSubjects();
            }
        });

    }
    public void startSubjects(){
        Intent intent = new Intent(this, com.example.student_01.otoalevel.SubjectsActivity.class);
        startActivity(intent);

    }


}
