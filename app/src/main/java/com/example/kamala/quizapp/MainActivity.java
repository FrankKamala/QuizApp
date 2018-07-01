package com.example.kamala.quizapp;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btnSubmit = (Button) findViewById(R.id.btnSubmit);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int score = 0;
                String q5R = "Andy Rubin";
                CheckBox checkboxone = findViewById(R.id.checkBox);
                CheckBox checkboxtwo = findViewById(R.id.checkBox2);
                CheckBox checkboxthree = findViewById(R.id.checkBox3);
                RadioButton radiobutton1 = findViewById(R.id.Q3a);
                RadioButton radiobutton2 = findViewById(R.id.Q4b);
                RadioButton radiobutton3 = findViewById(R.id.Q5b);
                RadioButton radiobutton4 = findViewById(R.id.Q6a);
                if (((RadioButton) findViewById(R.id.Q3a)).isChecked()) {
                    score++;
                }
                if (((RadioButton) findViewById(R.id.Q4b)).isChecked()) {
                    score++;
                }
                if (((RadioButton) findViewById(R.id.Q5b)).isChecked()) {
                    score++;
                }
                if (((RadioButton) findViewById(R.id.Q6a)).isChecked()) {
                    score++;
                }
                if (checkboxtwo.isChecked() && checkboxthree.isChecked()) {
                    score = score + 1;
                }
                EditText questionFive = (EditText) findViewById(R.id.plain_text_input);
                String questionFiveAnswer = questionFive.getText().toString();
                if (questionFiveAnswer.equalsIgnoreCase(q5R)) {
                    score = score + 1;
                }
                if (checkboxtwo.isChecked() && checkboxthree.isChecked()) {
                    checkboxtwo.setEnabled(false);
                    checkboxthree.setEnabled(false);
                } else {
                    checkboxone.setEnabled(true);
                }

                displayResult(score);
            }


        });
    }
/* TODO display toast with score*/
    public void displayResult(int score) {
        String marks = "You scored " + score;
        marks += " out of 5";
        marks += "\ncheck out the correct answers!";
        Toast toast = Toast.makeText(getApplicationContext(),marks, Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
    }
}



