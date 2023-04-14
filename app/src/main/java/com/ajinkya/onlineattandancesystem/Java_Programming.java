package com.ajinkya.onlineattandancesystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Java_Programming extends AppCompatActivity {

    EditText et_java_name, et_java_branch,et_java_roll_number,java_date,java_time;
    Button uploadAttandance;
//    Spinner Spinnerbranch;

    DatabaseReference studentDbRef;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_programming);



    }    public void process(View view)
    {
        et_java_name = findViewById(R.id.java_name);
        et_java_branch = findViewById(R.id.java_branch);
        et_java_roll_number = findViewById(R.id.java_roll_number);
         java_date = findViewById(R.id.java_date);
         java_time = findViewById(R.id.java_time);


        String name=et_java_name.getText().toString().trim();
        String branch=et_java_branch.getText().toString().trim();
        String roll_no=et_java_roll_number.getText().toString().trim();
        String date = java_date.getText().toString().trim();
        String time = java_time.getText().toString().trim();



        Javascript_Student_data javascript_student_data = new Javascript_Student_data(name,branch,roll_no,date,time);


        FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
        DatabaseReference databaseReference = firebaseDatabase.getReference("Java");

        databaseReference.child(name).setValue(javascript_student_data);

        et_java_name.setText(" ");
        et_java_branch.setText(" ");
        et_java_roll_number.setText(" ");
        java_date.setText(" ");
        java_time.setText(" ");

        Toast.makeText(this, "Data Inserted Successfully", Toast.LENGTH_LONG).show();
        Intent i5 = new Intent(Java_Programming.this,MainActivity.class);
        startActivity(i5);
    }

}