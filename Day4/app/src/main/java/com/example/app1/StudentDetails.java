package com.example.app1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class StudentDetails extends AppCompatActivity {

    ImageView courseImage;

    TextView courseId,courseName,courseDesc,courseFees,courseEligib;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_details);

        courseImage=findViewById(R.id.courseImage);
        courseId=findViewById(R.id.courseId);
        courseName=findViewById(R.id.courseName);
        courseDesc=findViewById(R.id.courseDesc);
        courseFees=findViewById(R.id.courseFees);
        courseEligib=findViewById(R.id.courseEligib);

        Intent intent =getIntent();
       Course c = (Course) intent.getSerializableExtra("Course");

       courseImage.setImageResource(c.getImage());
       courseId.setText("Id: "+c.getId());
       courseName.setText("Name: "+c.getName());
       courseDesc.setText("Desc: "+c.getDesc());
       courseEligib.setText("Eligibility: "+c.getEligibility());
       courseFees.setText("Fees: "+c.getFees());

    }
}