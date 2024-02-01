package com.example.com221_basilio_activity7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText edtTxtName;
    private EditText edtTxtPass;
    private Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("STUDENT GRADING SYSTEM");
        edtTxtName = findViewById(R.id.edtTxtName);
        edtTxtPass = findViewById(R.id.edtTxtPass);
        loginButton = (Button) findViewById(R.id.loginButton);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = edtTxtName.getText().toString();
                String password = edtTxtPass.getText().toString();

                if(username.equals("Student") && password.equals("password123")) {
                    showToast("LOGIN SUCCESSFUL!");
                    Intent intent = new Intent(MainActivity.this, Menu_Activity.class);
                    startActivity(intent);
                    finish();
                } else if (username.isEmpty() || password.isEmpty()){
                    showToast("Please enter both username and password");
                } else {
                    showToast("Invalid username or password!");
                }
            }
        });
    }

    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}