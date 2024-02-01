package com.example.com221_basilio_activity7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.Calendar;

public class Info_View extends AppCompatActivity {

    private TextView Age;
    private FloatingActionButton backer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_view);
        setTitle("YOUR INFORMATION");
        backer = findViewById(R.id.backsilog);

        backer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openInfoEncode();
            }
        });
            TextView Lastname2 = findViewById(R.id.txtLastName);
            Lastname2.setText("Last Name: " + Info_Encode.LastName);
            TextView Firstname2 = findViewById(R.id.txtFirstName);
            Firstname2.setText("First Name: " + Info_Encode.FirstName);
            TextView Email2 = findViewById(R.id.txtEmail);
            Email2.setText("Email: " + Info_Encode.Email);
            TextView Course2 = findViewById(R.id.txtCourse);
            Course2.setText("Course: " + Info_Encode.Course);

            String year = String.valueOf(Info_Encode.Year);
            TextView txtViewYear = findViewById(R.id.txtYear);
            txtViewYear.setText("Year: " + year + "st");

            String contact = String.valueOf(Info_Encode.Contact);
            TextView txtViewContact = findViewById(R.id.txtContact);
            txtViewContact.setText("Contact #: " + contact);

            String birthyear = String.valueOf(Info_Encode.Birthyear);
            TextView txtViewBirthyear = findViewById(R.id.txtBirthyear);
            txtViewBirthyear.setText("Birth Year: " + birthyear);

            String age = String.valueOf((2023 - Info_Encode.Birthyear));
            TextView txtViewAge = findViewById(R.id.txtAge);
            txtViewAge.setText("Age: " + age);
    }

    public void openInfoEncode() {
        Intent intent = new Intent(this, Info_Encode.class);
        startActivity(intent);
    }

}