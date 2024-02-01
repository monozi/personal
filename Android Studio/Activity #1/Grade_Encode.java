package com.example.com221_basilio_activity7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Grade_Encode extends AppCompatActivity {

    EditText Lname, Fname, score1, score2, score3, score4, score5, score6;

    Button encodeGrade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("ENCODING OF GRADES");
        setContentView(R.layout.activity_grade_encode);
        FloatingActionButton goBack = findViewById(R.id.backsilogz);
        encodeGrade = findViewById(R.id.gradeEncode);
        goBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMenuActivity();
            }
        });

        encodeGrade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Lname = findViewById(R.id.Lname);
                    String lastName = Lname.getText().toString();
                    Fname = findViewById(R.id.Fname);
                    String firstName = Fname.getText().toString();
                    score1 = findViewById(R.id.score1);
                    int attendance = Integer.valueOf(score1.getText().toString());
                    score2 = findViewById(R.id.score2);
                    int firstQ = Integer.valueOf(score2.getText().toString());
                    score3 = findViewById(R.id.score3);
                    int secondQ = Integer.valueOf(score3.getText().toString());
                    score4 = findViewById(R.id.score4);
                    int thirdQ = Integer.valueOf(score4.getText().toString());
                    score5 = findViewById(R.id.score5);
                    int fourthQ = Integer.valueOf(score5.getText().toString());
                    score6 = findViewById(R.id.score6);
                    int exam = Integer.valueOf(score6.getText().toString());


                    if (Lname.getText().toString().isEmpty() || Fname.getText().toString().isEmpty() || score1.getText().toString().isEmpty() || score2.getText().toString().isEmpty()
                            || score3.getText().toString().isEmpty() || score4.getText().toString().isEmpty() || score5.getText().toString().isEmpty() || score6.getText().toString().isEmpty()) {
                        Toast.makeText(Grade_Encode.this, "Please complete all fields", Toast.LENGTH_SHORT).show();
                    } else {
                        if (attendance < 1 || attendance > 100 || firstQ < 1 || firstQ > 100 || secondQ < 1 || secondQ > 100 || thirdQ < 1 || thirdQ > 100
                                || fourthQ < 1 || fourthQ > 100 || exam < 1 || exam > 100) {
                            Toast.makeText(Grade_Encode.this, "Please enter a value between 1 and 100", Toast.LENGTH_SHORT).show();
                        } else {
                            Toast.makeText(Grade_Encode.this, "GRADE ENCODED", Toast.LENGTH_SHORT).show();
                            Intent encoded = new Intent(Grade_Encode.this, Grade_View.class);
                            encoded.putExtra("Surname", lastName);
                            encoded.putExtra("Firstname", firstName);
                            encoded.putExtra("attendance", attendance);
                            encoded.putExtra("quiz1", firstQ);
                            encoded.putExtra("quiz2", secondQ);
                            encoded.putExtra("quiz3", thirdQ);
                            encoded.putExtra("quiz4", fourthQ);
                            encoded.putExtra("exam", exam);
                            startActivity(encoded);
                        }
                    }
                } catch (Exception e ) {
                    Toast.makeText(Grade_Encode.this, "Please fill out all the required details", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    public void openMenuActivity() {
        Intent intent = new Intent(this, Menu_Activity.class);
        startActivity(intent);
    }
}