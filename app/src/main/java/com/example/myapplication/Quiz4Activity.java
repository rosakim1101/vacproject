package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Quiz4Activity extends AppCompatActivity {

    EditText editText;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz4);

        editText = findViewById(R.id.answer4);
        btn = findViewById(R.id.submit4);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(editText.getText().toString().equals("forehead")){
                    Toast.makeText(Quiz4Activity.this, "정답입니다!", Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent(Quiz4Activity.this,Quiz5Activity.class);

                    startActivity(intent);
                    finish();
                }

                else{
                    Toast.makeText(Quiz4Activity.this, "오답입니다.", Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent(Quiz4Activity.this, Quiz5Activity.class);


                    startActivity(intent);
                    finish();
                }
            }
        });


    }
}
