package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Quiz3Activity extends AppCompatActivity {

    EditText editText;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz3);
        editText = findViewById(R.id.answer3);
        btn = findViewById(R.id.submit3);
        
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText.getText().toString().equals("invest")){
                    Toast.makeText(Quiz3Activity.this, "정답입니다!", Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent(Quiz3Activity.this,Quiz4Activity.class);


                    startActivity(intent);
                    finish();
                }

                else {
                    Toast.makeText(Quiz3Activity.this, "오답입니다.", Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent(Quiz3Activity.this, Quiz4Activity.class);


                    startActivity(intent);
                    finish();
                }
            }
        });
    }
}
