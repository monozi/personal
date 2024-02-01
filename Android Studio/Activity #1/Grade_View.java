package com.example.com221_basilio_activity7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Grade_View extends AppCompatActivity {
    private TextView fullName, attendance2, q1, q2, q3, q4, exam2, average, status, remarks;
    private String strLname, strFname, strAverage, strStatus, strRemarks;
    private double dblAve;
    private FloatingActionButton backing;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("YOUR GRADES");
        setContentView(R.layout.activity_grade_view);

        fullName = findViewById(R.id.fullName);

        Intent encoded = getIntent();
        strLname = encoded.getStringExtra("Surname");
        strFname = encoded.getStringExtra("Firstname");

        attendance2 = findViewById(R.id.attendance2);
        int intAtte = encoded.getIntExtra("attendance", 0);
        q1 = findViewById(R.id.q1);
        int intQ1 = encoded.getIntExtra("quiz1", 0);
        q2 = findViewById(R.id.q2);
        int intQ2 = encoded.getIntExtra("quiz2", 0);
        q3 = findViewById(R.id.q3);
        int intQ3 = encoded.getIntExtra("quiz3", 0);
        q4 = findViewById(R.id.q4);
        int intQ4 = encoded.getIntExtra("quiz4", 0);
        exam2 = findViewById(R.id.exam2);
        int intExam = encoded.getIntExtra("exam", 0);
        average = findViewById(R.id.average);
        status = findViewById(R.id.status);
        remarks = findViewById(R.id.remarks);

        fullName.setText(strLname + ", " + strFname + "'s Grades");

        try {
            dblAve = (intAtte * 0.2) + ((intQ1 + intQ2 + intQ3 + intQ4) / 4.0*0.3) + (intExam + 0.5);
            strAverage = String.valueOf(dblAve);
            if (dblAve >= 60) {
                strStatus = "PASSED!";
            }else {
                strStatus = "FAILED!";
            }

            if (dblAve >= 96 && dblAve <= 100) {
                strRemarks = "4.00";
            } else if (dblAve >= 90 && dblAve <= 95) {
                strRemarks = "3.50";
            } else if (dblAve >= 84 && dblAve <= 89) {
                strRemarks = "3.00";
            } else if (dblAve >= 78 && dblAve <= 83) {
                strRemarks = "2.50";
            } else if (dblAve >= 72 && dblAve <= 77) {
                strRemarks = "2.00";
            } else if (dblAve >= 66 && dblAve <= 71) {
                strRemarks = "1.50";
            } else if (dblAve >= 60 && dblAve <= 65) {
                strRemarks = "1.00";
            } else {
                strRemarks = "INC";
            }

            attendance2.setText("Attendance: " + intAtte);
            q1.setText("Quiz 1: " + intQ1);
            q2.setText("Quiz 2: " + intQ2);
            q3.setText("Quiz 3: " + intQ3);
            q4.setText("Quiz 4: " + intQ4);
            exam2.setText("Exam: " + intExam);
            average.setText("Average: " + strAverage);
            status.setText("Status: " + strStatus);
            remarks.setText("Remarks: " + strRemarks);
        } catch (Exception e) {
                    e.printStackTrace();
        }

        backing = findViewById(R.id.back2);
        backing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGradeEncode();
            }
        });
    }
    private void openGradeEncode() {
        Intent i = new Intent(this, Grade_Encode.class);
        startActivity(i);
    }
}