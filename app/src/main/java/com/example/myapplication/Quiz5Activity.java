
package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Quiz5Activity extends AppCompatActivity {
    
    EditText editText;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz5);
        
        editText = findViewById(R.id.answer5);
        btn =findViewById(R.id.submit5);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText.getText().toString().equals("intake")) {
                    Toast.makeText(Quiz5Activity.this, "정답입니다!", Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent(Quiz5Activity.this, MainActivity.class);

                    startActivity(intent);
                    finish();

                }
                else{
                    Toast.makeText(Quiz5Activity.this, "오답입니다.", Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent(Quiz5Activity.this, MainActivity.class);

                    startActivity(intent);
                    finish();
                }



            }
        });


    }
}
