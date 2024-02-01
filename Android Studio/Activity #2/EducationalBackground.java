package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class EducationalBackground extends AppCompatActivity {

    private CheckBox cbElementary, cbSecondary, cbVocational, cbCollege, cbGraduatestudies;
    private EditText edtTxtElem, edtTxtSecondary, edtTxtVocational, edtTxtCollege, edtTxtGraduatestudies,
            edtTxtProgram1, edtTxtProgram2, edtTxtProgram3, edtTxtProgram4, edtTxtProgram5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_educational_background);
        getSupportActionBar().setTitle("EDUCATIONAL BACKGROUND");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

         cbElementary = findViewById(R.id.chckboxElementary);
         cbSecondary = findViewById(R.id.chckboxSecondary);
         cbVocational = findViewById(R.id.chckboxVocational);
         cbCollege = findViewById(R.id.chckboxCollege);
         cbGraduatestudies = findViewById(R.id.chckboxGraduateStudies);

         edtTxtElem = findViewById(R.id.edtTxtSchoolname1);
         edtTxtSecondary = findViewById(R.id.edtTxtSchoolname2);
         edtTxtVocational = findViewById(R.id.edtTxtSchoolname3);
         edtTxtCollege = findViewById(R.id.edtTxtSchoolname4);
         edtTxtGraduatestudies = findViewById(R.id.edtTxtSchoolname5);

         edtTxtProgram1 = findViewById(R.id.edtTxtProgram1);
         edtTxtProgram2 = findViewById(R.id.edtTxtProgram2);
         edtTxtProgram3 = findViewById(R.id.edtTxtProgram3);
         edtTxtProgram4 = findViewById(R.id.edtTxtProgram4);
         edtTxtProgram5 = findViewById(R.id.edtTxtProgram5);

        disableFields();

        cbElementary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                enableFields();
            }
        });

        cbSecondary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                enableFields();
            }
        });

        cbVocational.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                enableFields();
            }
        });

        cbCollege.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                enableFields();
            }
        });

        cbGraduatestudies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                enableFields();
            }
        });

    }

    public void nextPage(View v) {
        try {
            if(!validatingForm()) {
                Toast.makeText(getApplicationContext(), "Fill in empty fields", Toast.LENGTH_SHORT).show();
            } else {
                validatingForm();
                Toast.makeText(EducationalBackground.this, "Submitted, proceeding to the next page.", Toast.LENGTH_SHORT).show();
                Intent toCrim = new Intent(EducationalBackground.this, CriminalBackground.class);

                Intent fromPersonalInfo = getIntent();
                byte[] img = fromPersonalInfo.getByteArrayExtra("photoArray");
                String firstname = fromPersonalInfo.getStringExtra("firstname");
                String lastname = fromPersonalInfo.getStringExtra("lastname");
                String email = fromPersonalInfo.getStringExtra("email");
                String gender = fromPersonalInfo.getStringExtra("gender");
                String phone = fromPersonalInfo.getStringExtra("phone");
                String height = fromPersonalInfo.getStringExtra("height");
                String weight = fromPersonalInfo.getStringExtra("weight");
                String civilStatus = fromPersonalInfo.getStringExtra("civilstatus");
                String pagibig = fromPersonalInfo.getStringExtra("pagibig");
                String philhealth = fromPersonalInfo.getStringExtra("philhealth");
                String gsis = fromPersonalInfo.getStringExtra("gsis");
                String tin = fromPersonalInfo.getStringExtra("tin");
                String fullname = fromPersonalInfo.getStringExtra("eName");
                String contactNum = fromPersonalInfo.getStringExtra("eContact");
                String relationship = fromPersonalInfo.getStringExtra("relationship");

                toCrim.putExtra("photoArray", img);
                toCrim.putExtra("firstname", firstname);
                toCrim.putExtra("lastname", lastname);
                toCrim.putExtra("email", email);
                toCrim.putExtra("gender", gender);
                toCrim.putExtra("phone", phone);
                toCrim.putExtra("height", height);
                toCrim.putExtra("weight", weight);
                toCrim.putExtra("civilstatus", civilStatus);
                toCrim.putExtra("pagibig", pagibig);
                toCrim.putExtra("philhealth", philhealth);
                toCrim.putExtra("gsis", gsis);
                toCrim.putExtra("tin", tin);
                toCrim.putExtra("eName", fullname);
                toCrim.putExtra("eContact", contactNum);
                toCrim.putExtra("relationship", relationship);

                toCrim.putExtra("elementaryschool", edtTxtElem.getText().toString());
                toCrim.putExtra("elementaryprogram", edtTxtProgram1.getText().toString());
                toCrim.putExtra("secondaryschool", edtTxtSecondary.getText().toString());
                toCrim.putExtra("secondaryprogram", edtTxtProgram2.getText().toString());
                toCrim.putExtra("vocationalschool", edtTxtVocational.getText().toString());
                toCrim.putExtra("vocationalprogram", edtTxtProgram3.getText().toString());
                toCrim.putExtra("collegeschool", edtTxtCollege.getText().toString());
                toCrim.putExtra("collegeprogram", edtTxtProgram4.getText().toString());
                toCrim.putExtra("graduateschool", edtTxtGraduatestudies.getText().toString());
                toCrim.putExtra("graduateprogram", edtTxtProgram5.getText().toString());
                startActivity(toCrim);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private void disableFields() {
        edtTxtElem.setEnabled(false);
        edtTxtProgram1.setEnabled(false);

        edtTxtSecondary.setEnabled(false);
        edtTxtProgram2.setEnabled(false);

        edtTxtVocational.setEnabled(false);
        edtTxtProgram3.setEnabled(false);

        edtTxtCollege.setEnabled(false);
        edtTxtProgram4.setEnabled(false);

        edtTxtGraduatestudies.setEnabled(false);
        edtTxtProgram5.setEnabled(false);
    }
    private void enableFields() {
        boolean elemSelected = cbElementary.isChecked();
        boolean secondarySelected = cbSecondary.isChecked();
        boolean vocationalSelected = cbVocational.isChecked();
        boolean collegeSelected = cbCollege.isChecked();
        boolean graduateStudiesSelected = cbGraduatestudies.isChecked();

        edtTxtElem.setEnabled(elemSelected);
        edtTxtSecondary.setEnabled(secondarySelected);
        edtTxtVocational.setEnabled(vocationalSelected);
        edtTxtCollege.setEnabled(collegeSelected);
        edtTxtGraduatestudies.setEnabled(graduateStudiesSelected);

        edtTxtProgram1.setEnabled(elemSelected);
        edtTxtProgram2.setEnabled(secondarySelected);
        edtTxtProgram3.setEnabled(vocationalSelected);
        edtTxtProgram4.setEnabled(collegeSelected);
        edtTxtProgram5.setEnabled(graduateStudiesSelected);
    }

    private boolean validatingForm() {
        if (cbElementary.isChecked() && (edtTxtElem.getText().toString().trim().isEmpty() || edtTxtProgram1.getText().toString().trim().isEmpty())) {
            return false;
        } else if (cbSecondary.isChecked() && (edtTxtSecondary.getText().toString().trim().isEmpty() || edtTxtProgram2.getText().toString().trim().isEmpty())) {
            return false;
        } else if (cbVocational.isChecked() && (edtTxtVocational.getText().toString().trim().isEmpty() || edtTxtProgram3.getText().toString().trim().isEmpty())) {
            return false;
        } else if (cbCollege.isChecked() && (edtTxtCollege.getText().toString().trim().isEmpty() || edtTxtProgram4.getText().toString().trim().isEmpty())) {
            return false;
        } else if (cbGraduatestudies.isChecked() && (edtTxtGraduatestudies.getText().toString().trim().isEmpty() || edtTxtProgram5.getText().toString().trim().isEmpty())) {
            return false;
        } else {
            return true;
        }
    }
}