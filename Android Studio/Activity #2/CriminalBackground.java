package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.app.NotificationCompat;
import androidx.core.content.ContextCompat;
import androidx.core.content.PackageManagerCompat;

import android.Manifest;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Toast;

public class CriminalBackground extends AppCompatActivity {

    private CheckBox cbFirstYes, cbSecondYes, cbThirdYes, cbFourthAYes, cbFourthBYes, cbFourthCYes,
                    cbFirstNo, cbSecondNo, cbThirdNo, cbFourthANo, cbFourthBNo, cbFourthCNo;
    private EditText edtTxtFirst, edtTxtSecond, edtTxtThird, edtTxtFourthA, edtTxtFourthB, edtTxtFourthC;
    Button btnNotif;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_criminal_background);
        getSupportActionBar().setTitle("CRIMINAL BACKGROUND");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        cbFirstYes = findViewById(R.id.chckboxYes1);
        cbFirstNo = findViewById(R.id.chckboxNo1);
        cbSecondYes = findViewById(R.id.chckboxYes2);
        cbSecondNo = findViewById(R.id.chckboxNo2);
        cbThirdYes = findViewById(R.id.chckboxYes3);
        cbThirdNo = findViewById(R.id.chckboxNo3);
        cbFourthAYes = findViewById(R.id.chckboxYes4);
        cbFourthANo = findViewById(R.id.chckboxNo4);
        cbFourthBYes = findViewById(R.id.chckboxYes5);
        cbFourthBNo = findViewById(R.id.chckboxNo5);
        cbFourthCYes = findViewById(R.id.chckboxYes6);
        cbFourthCNo = findViewById(R.id.chckboxNo6);

        edtTxtFirst = findViewById(R.id.edtTxtNumber1);
        edtTxtSecond = findViewById(R.id.edtTxtNumber2);
        edtTxtThird = findViewById(R.id.edtTxtNumber3);
        edtTxtFourthA = findViewById(R.id.edtTxtNumber4A);
        edtTxtFourthB = findViewById(R.id.edtTxtNumber4B);
        edtTxtFourthC = findViewById(R.id.edtTxtNumber4C);
        btnNotif = findViewById(R.id.btnNext);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            if (ContextCompat.checkSelfPermission(CriminalBackground.this,
                    Manifest.permission.POST_NOTIFICATIONS) != PackageManager.PERMISSION_GRANTED) {

                ActivityCompat.requestPermissions(CriminalBackground.this, new String[]{Manifest.permission.POST_NOTIFICATIONS}, 101);
            }
        }

        btnNotif.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeNotif();
            }
        });

        cbFirstYes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cbFirstYes.isChecked()) {
                    edtTxtFirst.setEnabled(true);
                    cbFirstNo.setEnabled(false);

                } else {
                    edtTxtFirst.setEnabled(false);
                    cbFirstNo.setEnabled(true);
                }
            }
        });

        cbFirstNo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cbFirstNo.isChecked()) {
                    edtTxtFirst.setEnabled(false);
                    cbFirstYes.setEnabled(false);
                } else {
                    edtTxtFirst.setEnabled(false);
                    cbFirstYes.setEnabled(true);
                }
            }
        });

        cbSecondYes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cbSecondYes.isChecked()) {
                    edtTxtSecond.setEnabled(true);
                    cbSecondNo.setEnabled(false);
                } else {
                    edtTxtSecond.setEnabled(false);
                    cbSecondNo.setEnabled(true);
                }
            }
        });

        cbSecondNo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cbSecondNo.isChecked()) {
                    edtTxtSecond.setEnabled(false);
                    cbSecondYes.setEnabled(false);
                } else {
                    edtTxtSecond.setEnabled(false);
                    cbSecondYes.setEnabled(true);
                }
            }
        });

        cbThirdYes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cbThirdYes.isChecked()) {
                    edtTxtThird.setEnabled(true);
                    cbThirdNo.setEnabled(false);
                } else {
                    edtTxtThird.setEnabled(false);
                    cbThirdNo.setEnabled(true);
                }
            }
        });

        cbThirdNo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cbThirdNo.isChecked()) {
                    edtTxtThird.setEnabled(false);
                    cbThirdYes.setEnabled(false);
                } else {
                    edtTxtThird.setEnabled(false);
                    cbThirdYes.setEnabled(true);
                }
            }
        });

        cbFourthAYes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cbFourthAYes.isChecked()) {
                    edtTxtFourthA.setEnabled(true);
                    cbFourthANo.setEnabled(false);
                } else {
                    edtTxtFourthA.setEnabled(false);
                    cbFourthANo.setEnabled(true);
                }
            }
        });

        cbFourthANo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cbFourthANo.isChecked()) {
                    edtTxtFourthA.setEnabled(false);
                    cbFourthAYes.setEnabled(false);
                } else {
                    edtTxtFourthA.setEnabled(false);
                    cbFourthAYes.setEnabled(true);
                }
            }
        });

        cbFourthBYes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cbFourthBYes.isChecked()) {
                    edtTxtFourthB.setEnabled(true);
                    cbFourthBNo.setEnabled(false);

                } else {
                    edtTxtFourthB.setEnabled(false);
                    cbFourthBNo.setEnabled(true);
                }
            }
        });

        cbFourthBNo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cbFourthBNo.isChecked()) {
                    edtTxtFourthB.setEnabled(false);
                    cbFourthBYes.setEnabled(false);
                } else {
                    edtTxtFourthB.setEnabled(false);
                    cbFourthBYes.setEnabled(true);
                }
            }
        });

        cbFourthCYes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cbFourthCYes.isChecked()) {
                    edtTxtFourthC.setEnabled(true);
                    cbFourthCNo.setEnabled(false);

                } else {
                    edtTxtFourthC.setEnabled(false);
                    cbFourthCNo.setEnabled(true);
                }
            }
        });

        cbFourthCNo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cbFourthCNo.isChecked()) {
                    edtTxtFourthC.setEnabled(false);
                    cbFourthCYes.setEnabled(false);
                } else {
                    edtTxtFourthC.setEnabled(false);
                    cbFourthCYes.setEnabled(true);
                }
            }
        });

    }

    public void makeNotif() {

            if (!ifEmpty()) {
                Toast.makeText(this, "Please fill-in needed information", Toast.LENGTH_SHORT).show();
            } else {

                String channelID = "CHANNEL_ID_NOTIFICATION";
                NotificationCompat.Builder builder = new NotificationCompat.Builder(getApplicationContext(), channelID);

                builder.setSmallIcon(R.drawable.ic_notification)
                        .setContentTitle("NEW INFORMATION CODED")
                        .setContentText("Check your information here!")
                        .setAutoCancel(true)
                        .setPriority(NotificationCompat.PRIORITY_DEFAULT);

                Toast.makeText(this, "INFORMATION SUBMITTED! \nPlease check your notification.", Toast.LENGTH_LONG).show();
                Intent toRep = new Intent(getApplicationContext(), Report_Activity.class);
                toRep.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                toRep.putExtra("firstQuestionYes", edtTxtFirst.getText().toString());
                toRep.putExtra("firstQuestionNo", cbFirstNo.getText().toString());
                toRep.putExtra("secondQuestionYes", edtTxtSecond.getText().toString());
                toRep.putExtra("secondQuestionNo", cbSecondNo.getText().toString());
                toRep.putExtra("thirdQuestionYes", edtTxtThird.getText().toString());
                toRep.putExtra("thirdQuestionNo", cbThirdNo.getText().toString());
                toRep.putExtra("fourthAQuestionYes", edtTxtFourthA.getText().toString());
                toRep.putExtra("fourthAQuestionNo", cbFourthANo.getText().toString());
                toRep.putExtra("fourthBQuestionYes", edtTxtFourthB.getText().toString());
                toRep.putExtra("fourthBQuestionNo", cbFourthBNo.getText().toString());
                toRep.putExtra("fourthCQuestionYes", edtTxtFourthC.getText().toString());
                toRep.putExtra("fourthCQuestionNo", cbFourthCNo.getText().toString());

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

                toRep.putExtra("photoArray", img);
                toRep.putExtra("firstname", firstname);
                toRep.putExtra("lastname", lastname);
                toRep.putExtra("email", email);
                toRep.putExtra("gender", gender);
                toRep.putExtra("phone", phone);
                toRep.putExtra("height", height);
                toRep.putExtra("weight", weight);
                toRep.putExtra("civilstatus", civilStatus);
                toRep.putExtra("pagibig", pagibig);
                toRep.putExtra("philhealth", philhealth);
                toRep.putExtra("gsis", gsis);
                toRep.putExtra("tin", tin);
                toRep.putExtra("eName", fullname);
                toRep.putExtra("eContact", contactNum);
                toRep.putExtra("relationship", relationship);

                Intent fromEducBack = getIntent();
                String elemSchool = fromEducBack.getStringExtra("elementaryschool");
                String elemProg = fromEducBack.getStringExtra("elementaryprogram");
                String secSchool = fromEducBack.getStringExtra("secondaryschool");
                String secProg = fromEducBack.getStringExtra("secondaryprogram");
                String vocSchool = fromEducBack.getStringExtra("vocationalschool");
                String vocProg = fromEducBack.getStringExtra("vocationalprogram");
                String collegeSchool = fromEducBack.getStringExtra("collegeschool");
                String collegeProg = fromEducBack.getStringExtra("collegeprogram");
                String gradSchool = fromEducBack.getStringExtra("graduateschool");
                String gradProg = fromEducBack.getStringExtra("graduateprogram");

                toRep.putExtra("elementaryschool", elemSchool);
                toRep.putExtra("elementaryprogram", elemProg);
                toRep.putExtra("secondaryschool", secSchool);
                toRep.putExtra("secondaryprogram", secProg);
                toRep.putExtra("vocationalschool", vocSchool);
                toRep.putExtra("vocationalprogram", vocProg);
                toRep.putExtra("collegeschool", collegeSchool);
                toRep.putExtra("collegeprogram", collegeProg);
                toRep.putExtra("graduateschool", gradSchool);
                toRep.putExtra("graduateprogram", gradProg);

                PendingIntent pendingIntent = PendingIntent.getActivity(getApplicationContext(),
                        0, toRep, PendingIntent.FLAG_UPDATE_CURRENT);
                builder.setContentIntent(pendingIntent);
                NotificationManager notifManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);

                if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
                    NotificationChannel notificationChannel = notifManager.getNotificationChannel(channelID);
                    if (notificationChannel == null) {
                        int importance = NotificationManager.IMPORTANCE_HIGH;
                        notificationChannel = new NotificationChannel(channelID, "Some description", importance);
                        notificationChannel.setLightColor(Color.GREEN);
                        notificationChannel.enableVibration(true);
                        notifManager.createNotificationChannel(notificationChannel);
                    }
                }
                notifManager.notify(0, builder.build());
            }
    }

    private boolean ifEmpty() {
        if (cbFirstYes.isChecked() && (edtTxtFirst.getText().toString().trim().isEmpty())) {
            return false;
        } else if (cbSecondYes.isChecked() && (edtTxtSecond.getText().toString().trim().isEmpty())) {
            return false;
        } else if (cbThirdYes.isChecked() && (edtTxtThird.getText().toString().trim().isEmpty())) {
            return false;
        } else if (cbFourthAYes.isChecked() && (edtTxtFourthA.getText().toString().trim().isEmpty())) {
            return false;
        } else if (cbFourthBYes.isChecked() && (edtTxtFourthB.getText().toString().trim().isEmpty())) {
            return false;
        } else if (cbFourthCYes.isChecked() && (edtTxtFourthC.getText().toString().trim().isEmpty())) {
            return false;
        } else {
            return true;
        }
    }
}