package com.example.finalproject;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import java.io.ByteArrayOutputStream;

public class MainActivity extends AppCompatActivity {

    private static final int CAMERA_PERMISSION_REQUEST_CODE = 1;
    private static final int CAMERA_REQUEST_CODE = 22;

    String relationSelected;
    public static int forChecking;
    private RadioGroup rdgroupGender;
    private RadioGroup rdgroupCivilStatus;
    Bitmap img;
    ImageView imgView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("PERSONAL BACKGROUND");

        imgView = findViewById(R.id.photoImageView);

        Button btnTakephoto = findViewById(R.id.btnPhoto);
        btnTakephoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (camPermission()) {
                    openCamera();
                } else {
                    reqCamPerm();
                }
            }
        });

        Spinner relationship = findViewById(R.id.spinnerRelationship);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(MainActivity.this, R.array.relationships, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        relationship.setAdapter(adapter);

        relationship.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (position > 0) {
                    String chosen = parent.getItemAtPosition(position).toString();
                    Toast.makeText(MainActivity.this, chosen + " chosen", Toast.LENGTH_SHORT).show();
                    relationSelected = parent.getItemAtPosition(position).toString();
                    forChecking = position;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    public void toEduc(View v) {

        try {
            EditText edtTxtFirstname = findViewById(R.id.edtTxtFirstName);
            String firstname = edtTxtFirstname.getText().toString();
            EditText edtTxtLastname = findViewById(R.id.edtTxtLastName);
            String lastname = edtTxtLastname.getText().toString();
            EditText  edtTxtEmail = findViewById(R.id.edtTxtEmail);
            String email = edtTxtEmail.getText().toString();
            EditText edtTxtPhone = findViewById(R.id.edtTxtContact);
            String phone = edtTxtPhone.getText().toString();

            EditText edtTxtHeight = findViewById(R.id.edtTxtHeight);
            String height = (edtTxtHeight.getText().toString());
            EditText edtTxtWeight = findViewById(R.id.edtTxtWeight);
            String weight = (edtTxtWeight.getText().toString());
            EditText edtTxtPagibig = findViewById(R.id.edtTxtPagibig);
            String pagibig = edtTxtPagibig.getText().toString();
            EditText edtTxtPhilhealth = findViewById(R.id.edtTxtPhilhealth);
            String philHealth = (edtTxtPhilhealth.getText().toString());
            EditText edtTxtGsis = findViewById(R.id.edtTxtGSIS);
            String gsis = (edtTxtGsis.getText().toString());
            EditText edtTxtTin = findViewById(R.id.edtTxtTin);
            String tin = (edtTxtTin.getText().toString());

            EditText edtTxtFullname = findViewById(R.id.edtTxtFullname);
            String fullname = edtTxtFullname.getText().toString();
            EditText edtTxtContactNum = findViewById(R.id.edtTxtEmerContact);
            String contactNum = edtTxtContactNum.getText().toString();

            rdgroupGender = findViewById(R.id.rgGender);
            rdgroupCivilStatus = findViewById(R.id.rgCivilStatus);

            if(img != null) {

                if (!firstname.isEmpty() && !lastname.isEmpty() && !email.isEmpty() && !phone.isEmpty() && !height.isEmpty() && !weight.isEmpty()
                        && !fullname.isEmpty() && !contactNum.isEmpty()) {

                    int selectedGender = rdgroupGender.getCheckedRadioButtonId();
                    if (selectedGender != -1) {

                        int selectedCivilStatus = rdgroupCivilStatus.getCheckedRadioButtonId();
                        if (selectedCivilStatus != -1) {

                            if (forChecking > 0) {

                                RadioButton selectedrbGender = findViewById(selectedGender);
                                String gender = selectedrbGender.getText().toString();

                                RadioButton selectedrbCivilStatus = findViewById(selectedCivilStatus);
                                String civilStatus = selectedrbCivilStatus.getText().toString();

                                ByteArrayOutputStream bytes = new ByteArrayOutputStream();
                                img.compress(Bitmap.CompressFormat.JPEG, 100, bytes);
                                byte[] photoByteArray = bytes.toByteArray();

                                Toast.makeText(this, "Submitted, proceeding to the next page.", Toast.LENGTH_LONG).show();
                                Intent nextP = new Intent(this, EducationalBackground.class);
                                nextP.putExtra("photoArray", photoByteArray);
                                nextP.putExtra("firstname", firstname);
                                nextP.putExtra("lastname", lastname);
                                nextP.putExtra("email", email);
                                nextP.putExtra("gender", gender);
                                nextP.putExtra("phone", phone);
                                nextP.putExtra("height", height);
                                nextP.putExtra("weight", weight);
                                nextP.putExtra("civilstatus", civilStatus);
                                nextP.putExtra("pagibig", pagibig);
                                nextP.putExtra("philhealth", philHealth);
                                nextP.putExtra("gsis", gsis);
                                nextP.putExtra("tin", tin);
                                nextP.putExtra("eName", fullname);
                                nextP.putExtra("eContact", contactNum);
                                nextP.putExtra("relationship", relationSelected);
                                startActivity(nextP);
                            }
                        }
                    }
                } else {
                    Toast.makeText(this, "Please fill in all required information!", Toast.LENGTH_SHORT).show();
                }
            }
        } catch (Exception e) {
            Toast.makeText(this, "Please fill in all required information!", Toast.LENGTH_SHORT).show();
        }
    }
    private boolean camPermission() {
        return ContextCompat.checkSelfPermission(this, Manifest.permission.CAMERA) == PackageManager.PERMISSION_GRANTED;
    }
    private void reqCamPerm() {
        ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.CAMERA}, CAMERA_PERMISSION_REQUEST_CODE);
    }
    private void openCamera() {
        Intent camIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(camIntent, CAMERA_REQUEST_CODE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(resultCode == RESULT_OK) {
            imgView = findViewById(R.id.photoImageView);
            img = (Bitmap) data.getExtras().get("data");
            imgView.setImageBitmap(img);
        } else {
            Toast.makeText(this, "The process has been cancelled!", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == CAMERA_PERMISSION_REQUEST_CODE) {
            if(grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                openCamera();
            } else {
                Toast.makeText(MainActivity.this, "Camera permission denied, please allow permission to take picture.", Toast.LENGTH_SHORT).show();
            }
        }
    }
}