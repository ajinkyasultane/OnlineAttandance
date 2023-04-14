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

public class PHP_Activity extends AppCompatActivity {

    EditText php_name,php_branch,php_roll_no,php_date,php_time;
    Button mbtn_php_upload_attandancebtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_php);
    }
    public void process(View view)
    {
        php_name = findViewById(R.id.php_name);
        php_branch = findViewById(R.id.php_branch);
        php_roll_no = findViewById(R.id.php_roll_number);
        php_date  = findViewById(R.id.php_date);
        php_time = findViewById(R.id.php_time);


        String name=php_name.getText().toString().trim();
        String branch=php_branch.getText().toString().trim();
        String roll_no=php_roll_no.getText().toString().trim();
        String date = php_date.getText().toString().trim();
        String time = php_time.getText().toString().trim();

        Javascript_Student_data javascript_student_data = new Javascript_Student_data(name,branch,roll_no,date,time);


        FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
        DatabaseReference databaseReference = firebaseDatabase.getReference("PHP");

        databaseReference.child(name).setValue(javascript_student_data);

        php_name.setText(" ");
        php_branch.setText(" ");
        php_roll_no.setText(" ");
        php_date.setText(" ");
        php_time.setText(" ");

        Toast.makeText(this, "Data Inserted Successfully", Toast.LENGTH_LONG).show();
        Intent i4 = new Intent(PHP_Activity.this,MainActivity.class);
        startActivity(i4);
    }

}