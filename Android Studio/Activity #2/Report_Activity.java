package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Report_Activity extends AppCompatActivity {

    TextView txtFirstname, txtLastname, txtEmail, txtGender, txtContact, txtHeight, txtWeight, txtCivilstatus,
                txtPagibig, txtPhilhealth, txtGsis, txtTin, txtFullname, txtContactNum, txtRelationship;
    TextView txtElemSchool, txtElemProg, txtSecondarySchool, txtSecondaryProg, txtVocationalSchool, txtVocationalProg,
                txtCollegeSchool, txtCollegeProgram, txtGraduateSchool, txtGraduateProgram;
    TextView txtFirstAnswer, txtSecondAnswer, txtThirdAnswer, txtFourthAnswer, txtFifthAnswer, txtSixthAnswer;
    Bitmap img;
    ImageView test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report);
        getSupportActionBar().setTitle("PERSONAL INFORMATION");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        test = findViewById(R.id.photoImageView);
        Bundle testing = getIntent().getExtras();
        byte[] photoByteArray = testing.getByteArray("photoArray");
        img = BitmapFactory.decodeByteArray(photoByteArray, 0, photoByteArray.length);
        test.setImageBitmap(img);

        txtFirstname = findViewById(R.id.firstNameTextView);
        String firstname = getIntent().getStringExtra("firstname");
        txtFirstname.setText("First Name: " + firstname);
        txtLastname = findViewById(R.id.lastNameTextView);
        String lastname = getIntent().getStringExtra("lastname");
        txtLastname.setText("Last Name: " + lastname);
        txtEmail = findViewById(R.id.emailTextView);
        String email = getIntent().getStringExtra("email");
        txtEmail.setText("Email: " + email);
        txtGender = findViewById(R.id.genderTextView);
        String gender = getIntent().getStringExtra("gender");
        txtGender.setText("Gender: " + gender);
        txtContact = findViewById(R.id.contactNumberTextView);
        String phone = getIntent().getStringExtra("phone");
        txtContact.setText("Phone: " + phone);
        txtHeight = findViewById(R.id.heightTextView);
        String height = getIntent().getStringExtra("height");
        txtHeight.setText("Height: " + height);
        txtWeight = findViewById(R.id.weightTextView);
        String weight = getIntent().getStringExtra("weight");
        txtWeight.setText("Weight: " + weight);
        txtCivilstatus = findViewById(R.id.civilStatusTextView);
        String civilStatus = getIntent().getStringExtra("civilstatus");
        txtCivilstatus.setText("Civil Status: " + civilStatus);
        txtPagibig = findViewById(R.id.pagibigNoTextView);
        String pagibig = getIntent().getStringExtra("pagibig");
        txtPagibig.setText("Pag-IBIG No.: " + pagibig);
        txtPhilhealth = findViewById(R.id.philhealthNoTextView);
        String philHealth = getIntent().getStringExtra("philhealth");
        txtPhilhealth.setText("Philhealth No.: " + philHealth);
        txtGsis = findViewById(R.id.gsisNoTextView);
        String gsis = getIntent().getStringExtra("gsis");
        txtGsis.setText("GSIS No.: " + gsis);
        txtTin = findViewById(R.id.tinNoTextView);
        String tin = getIntent().getStringExtra("tin");
        txtTin.setText("Philhealth No.: " + tin);
        txtFullname = findViewById(R.id.emergencyContactNameTextView);
        String fullName = getIntent().getStringExtra("eName");
        txtFullname.setText("Name: " + fullName);
        txtContactNum = findViewById(R.id.emergencyContactNumberTextView);
        String contactNum = getIntent().getStringExtra("eContact");
        txtContactNum.setText("Contact No.: " + contactNum);
        txtRelationship = findViewById(R.id.emergencyContactRelationshipTextView);
        String relationship = getIntent().getStringExtra("relationship");
        txtRelationship.setText("Relationship: " + relationship);

        txtElemSchool = findViewById(R.id.elementarySchoolTextView);
        String elemSchool = getIntent().getStringExtra("elementaryschool");
        txtElemSchool.setText("Elementary School Name: " + elemSchool);
        txtElemProg = findViewById(R.id.elementaryProgramTextView);
        String elemProg = getIntent().getStringExtra("elementaryprogram");
        txtElemProg.setText("Educational Program: " + elemProg);

        txtSecondarySchool = findViewById(R.id.secondarySchoolTextView);
        String secSchool = getIntent().getStringExtra("secondaryschool");
        txtSecondarySchool.setText("Secondary School Name: " + secSchool);
        txtSecondaryProg = findViewById(R.id.secondaryProgramTextView);
        String secProg = getIntent().getStringExtra("secondaryprogram");
        txtSecondaryProg.setText("Educational Program: " + secProg);

        txtVocationalSchool = findViewById(R.id.vocationalSchoolTextView);
        String vocSchool = getIntent().getStringExtra("vocationalschool");
        txtVocationalSchool.setText("Vocational School Name: " + vocSchool);
        txtVocationalProg = findViewById(R.id.vocationalProgramTextView);
        String vocProg = getIntent().getStringExtra("vocationalprogram");
        txtVocationalProg.setText("Educational Program: " + vocProg);

        txtCollegeSchool = findViewById(R.id.collegeSchoolTextView);
        String collegeSchool = getIntent().getStringExtra("collegeschool");
        txtCollegeSchool.setText("College School Name: " + collegeSchool);
        txtCollegeProgram = findViewById(R.id.collegeProgramTextView);
        String collegeProg = getIntent().getStringExtra("collegeprogram");
        txtCollegeProgram.setText("Course or Degree: " + collegeProg);

        txtGraduateSchool = findViewById(R.id.graduateSchoolTextView);
        String gradSchool = getIntent().getStringExtra("graduateschool");
        txtGraduateSchool.setText("Graduate Studies Name: " + gradSchool);
        txtGraduateProgram = findViewById(R.id.graduateProgramTextView);
        String gradProg = getIntent().getStringExtra("graduateprogram");
        txtGraduateProgram.setText("Course or Degree: " + gradProg);

        txtFirstAnswer = findViewById(R.id.txtFirstQuestion);
        String firstAnswer = getIntent().getStringExtra("firstQuestionYes");
        String firstAnswerNo = getIntent().getStringExtra("firstQuestionNo");

        txtSecondAnswer = findViewById(R.id.txtSecondQuestion);
        String secondAnswer = getIntent().getStringExtra("secondQuestionYes");
        String secondAnswerNo = getIntent().getStringExtra("secondQuestionNo");

        txtThirdAnswer = findViewById(R.id.txtThirdQuestion);
        String thirdAnswer = getIntent().getStringExtra("thirdQuestionYes");
        String thirdAnswerNo = getIntent().getStringExtra("thirdQuestionNo");

        txtFourthAnswer = findViewById(R.id.txtFourthQuestion);
        String fourthAnswer = getIntent().getStringExtra("fourthAQuestionYes");
        String fourthAnswerNo = getIntent().getStringExtra("fourthAQuestionNo");

        txtFifthAnswer = findViewById(R.id.txtFifthQuestion);
        String fifthAnswer = getIntent().getStringExtra("fourthBQuestionYes");
        String fifthAnswerNo = getIntent().getStringExtra("fourthBQuestionNo");

        txtSixthAnswer = findViewById(R.id.txtSixthQuestion);
        String sixthAnswer = getIntent().getStringExtra("fourthCQuestionYes");
        String sixthAnswerNo = getIntent().getStringExtra("fourthCQuestionNo");

        if (!firstAnswer.isEmpty()) {
            txtFirstAnswer.setText("Yes, " + firstAnswer);
        } else {
            txtFirstAnswer.setText(firstAnswerNo);
        }

        if (!secondAnswer.isEmpty()) {
            txtSecondAnswer.setText("Yes, " + secondAnswer);
        } else {
            txtSecondAnswer.setText(secondAnswerNo);
        }

        if (!thirdAnswer.isEmpty()) {
            txtThirdAnswer.setText("Yes, " + thirdAnswer);
        } else {
            txtThirdAnswer.setText(thirdAnswerNo);
        }

        if (!fourthAnswer.isEmpty()) {
            txtFourthAnswer.setText("Yes, " + fourthAnswer);
        } else {
            txtFourthAnswer.setText(fourthAnswerNo);
        }

        if (!fifthAnswer.isEmpty()) {
            txtFifthAnswer.setText("Yes, " + fifthAnswer);
        } else {
            txtFifthAnswer.setText(fifthAnswerNo);
        }

        if (!sixthAnswer.isEmpty()) {
            txtSixthAnswer.setText("Yes, " + sixthAnswer);
        } else {
            txtSixthAnswer.setText(sixthAnswerNo);
        }
    }
}