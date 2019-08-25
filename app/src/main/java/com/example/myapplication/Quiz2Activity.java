package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Quiz2Activity extends AppCompatActivity {

    EditText edittext;
    TextView tv;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_quiz2);

        tv = findViewById(R.id.question2);
        edittext = findViewById(R.id.answer2);
        btn = findViewById(R.id.submit2);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edittext.getText().toString().equals("progress")){

                    Toast.makeText(Quiz2Activity.this, "정답입니다!", Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent(Quiz2Activity.this, Quiz3Activity.class);

                    startActivity(intent);
                    finish();
                }
                else{
                    Toast.makeText(Quiz2Activity.this, "오답입니다.", Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent(Quiz2Activity.this, Quiz3Activity.class);



                    startActivity(intent);
                    finish();
                }
            }
        });


    }
}

