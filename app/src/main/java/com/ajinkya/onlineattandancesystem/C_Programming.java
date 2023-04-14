package com.ajinkya.onlineattandancesystem;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

import org.checkerframework.checker.units.qual.C;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class C_Programming extends AppCompatActivity {
    private EditText c_name,c_branch,c_roll_no,c_date,c_time;
    private Button uploadAttendanceBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cprogramming);



    }
    public void process(View view)
    {
        c_name = findViewById(R.id.C_name);
        c_branch = findViewById(R.id.C_branch);
        c_roll_no = findViewById(R.id.C_roll_number);
       c_date = findViewById(R.id.c_date);
       c_time = findViewById(R.id.c_time);


        String name=c_name.getText().toString().trim();
        String branch=c_branch.getText().toString().trim();
        String roll_no=c_roll_no.getText().toString().trim();
        String date = c_date.getText().toString().trim();
        String time = c_time.getText().toString().trim();


        Javascript_Student_data javascript_student_data = new Javascript_Student_data(name,branch,roll_no,date,time);


        FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
        DatabaseReference databaseReference = firebaseDatabase.getReference("C");

        databaseReference.child(name).setValue(javascript_student_data);


        c_name.setText(" ");
        c_branch.setText(" ");
        c_roll_no.setText(" ");
        c_date.setText(" ");
        c_time.setText(" ");

        Toast.makeText(this, "Data Inserted Successfully", Toast.LENGTH_LONG).show();
        Intent i3 = new Intent(C_Programming.this,MainActivity.class);
        startActivity(i3);
    }


    }
