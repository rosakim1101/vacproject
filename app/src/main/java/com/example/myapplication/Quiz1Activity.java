package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Quiz1Activity extends AppCompatActivity {

    EditText edittext;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz1);

        edittext = findViewById(R.id.answer1);
        btn = findViewById(R.id.submit1);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (edittext.getText().toString().equals("protect")){

                    Toast.makeText(Quiz1Activity.this, "정답입니다!", Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent(Quiz1Activity.this, Quiz2Activity.class);


                    startActivity(intent);
                    finish();
                }
                else{
                    Toast.makeText(Quiz1Activity.this, "오답입니다.", Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent(Quiz1Activity.this, Quiz2Activity.class);

                    startActivity(intent);
                    finish();
                }
            }
        });


    }
}
