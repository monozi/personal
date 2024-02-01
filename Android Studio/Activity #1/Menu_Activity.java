package com.example.com221_basilio_activity7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Menu_Activity extends AppCompatActivity {

    private Button btnLogout;
    private Button btnGrade;
    private Button btnInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        btnLogout = findViewById(R.id.logout);
        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity();
            }
        });

        btnGrade = findViewById(R.id.grade);
        btnGrade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGradeEncode();
            }
        });

        btnInfo = findViewById(R.id.info);
        btnInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openInfoEncode();
            }
        });

    }

    public void openMainActivity() {
        Toast.makeText(Menu_Activity.this, "You have successfully logged out.", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void openGradeEncode() {
        Intent intent = new Intent(this, Grade_Encode.class);
        startActivity(intent);
    }

    public void openInfoEncode() {
        Intent intent = new Intent(this, Info_Encode.class);
        startActivity(intent);
    }
}