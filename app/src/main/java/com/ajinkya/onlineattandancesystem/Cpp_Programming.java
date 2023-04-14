package com.ajinkya.onlineattandancesystem;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Cpp_Programming extends AppCompatActivity {

     EditText cpp_name,cpp_branch,cpp_roll_number,cpp_date,cpp_time;
     Button uploadAttendancebtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cpp_programming);


    }

        public void process(View view)
        {
            cpp_name = findViewById(R.id.Cpp_name);
            cpp_branch = findViewById(R.id.Cpp_branch);
            cpp_roll_number = findViewById(R.id.Cpp_roll_number);
            cpp_date = findViewById(R.id.cpp_date);
            cpp_time = findViewById(R.id.cpp_time);


            String name=cpp_name.getText().toString().trim();
            String branch=cpp_branch.getText().toString().trim();
            String roll_no=cpp_roll_number.getText().toString().trim();
            String date = cpp_date.getText().toString().trim();
            String time = cpp_time.getText().toString().trim();

            Javascript_Student_data javascript_student_data = new Javascript_Student_data(name,branch,roll_no,date,time);


            FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
            DatabaseReference databaseReference = firebaseDatabase.getReference("Cpp");

            databaseReference.child(name).setValue(javascript_student_data);

            cpp_name.setText(" ");
            cpp_branch.setText(" ");
            cpp_roll_number.setText(" ");
            cpp_date.setText(" ");
            cpp_time.setText(" ");

            Toast.makeText(this, "Data Inserted Successfully", Toast.LENGTH_LONG).show();
 Intent i = new Intent(Cpp_Programming.this,MainActivity.class);
 startActivity(i);
        }

    }