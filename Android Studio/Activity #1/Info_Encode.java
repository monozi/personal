package com.example.com221_basilio_activity7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Info_Encode extends AppCompatActivity {
    public static String FirstName = "", LastName = "", Course = "", Email = "", Contact = "";

    public static int Year = 0, Birthyear = 0;

    Button encoder;

    private FloatingActionButton goBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_encode);
        setTitle("ENCODING OF INFORMATION");
        encoder = findViewById(R.id.encode);
        goBack = findViewById(R.id.backer);

        goBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMenuActivity();
            }
        });
    }
    public void encoder(View v) {

        try {
            EditText edtLastname = findViewById(R.id.lastname);
            LastName = edtLastname.getText().toString();

            EditText edtFirstname = findViewById(R.id.firstname);
            FirstName = edtFirstname.getText().toString();

            EditText edtEmail = findViewById(R.id.email);
            Email = edtEmail.getText().toString();

            EditText edtCourse = findViewById(R.id.course);
            Course = edtCourse.getText().toString();

            EditText edtYear = findViewById(R.id.year);
            Year = Integer.parseInt(edtYear.getText().toString());

            EditText edtContact = findViewById(R.id.contact);
            Contact = edtContact.getText().toString();

            EditText edtBirthyear = findViewById(R.id.birthyear);
            Birthyear = Integer.parseInt(edtBirthyear.getText().toString());

            if(TextUtils.isEmpty(LastName) || TextUtils.isEmpty(FirstName) || TextUtils.isEmpty(Email) || TextUtils.isEmpty(Course) || TextUtils.isEmpty(Contact)) {
                Toast.makeText(this, "Please fill out all the required field.", Toast.LENGTH_SHORT).show();
            } else if (Year == 0 || Birthyear == 0) {
                Toast.makeText(this, "Please complete all required fields.", Toast.LENGTH_LONG).show();
            } else {
                Toast.makeText(this, "Information Submitted.", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(this, Info_View.class);
                startActivity(i);
                }
        }  catch (Exception e ) {
            Toast.makeText(this, "Please fill out all the required fields.", Toast.LENGTH_SHORT).show();
        }
    }
    public void openMenuActivity() {
        Intent intent = new Intent(this, Menu_Activity.class);
        startActivity(intent);
    }
}