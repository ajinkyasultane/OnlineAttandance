package com.ajinkya.onlineattandancesystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Advance_java_Programming extends AppCompatActivity {

    EditText advance_java_name,advance_java_branch,advance_java_roll_no,advance_java_date,advance_java_time;
    Button mbtn_advance_java_upload_attancebtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advance_java_programming);
    }
    public void process(View view)
    {
        advance_java_name = findViewById(R.id.advance_java_name);
        advance_java_branch = findViewById(R.id.advance_java_branch);
        advance_java_roll_no = findViewById(R.id.advance_java_roll_number);
        advance_java_date = findViewById(R.id.advance_java_date);
        advance_java_time = findViewById(R.id.advance_java_time);

        String name=advance_java_name.getText().toString().trim();
        String branch=advance_java_branch.getText().toString().trim();
        String roll_no=advance_java_roll_no.getText().toString().trim();
        String date =advance_java_date.getText().toString().trim();
        String time = advance_java_time.getText().toString().trim();

        Javascript_Student_data javascript_student_data = new Javascript_Student_data(name,branch,roll_no,date,time);


        FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
        DatabaseReference databaseReference = firebaseDatabase.getReference("Advance Java");

       databaseReference.child(name).setValue(javascript_student_data);

        advance_java_name.setText(" ");
        advance_java_branch.setText(" ");
        advance_java_roll_no.setText(" ");
        advance_java_date.setText(" ");
        advance_java_time.setText(" ");

        Toast.makeText(this, "Data Inserted Successfully", Toast.LENGTH_LONG).show();
        Intent i2 = new Intent(Advance_java_Programming.this,MainActivity.class);
        startActivity(i2);
    }

}