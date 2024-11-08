package com.example.app2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class StudentDetails extends AppCompatActivity {

    TextView textName,textRollno,textCourse,textMobile,textMarks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_details);

        textName=findViewById(R.id.textName);
        textRollno=findViewById(R.id.textRollno);
        textCourse=findViewById(R.id.textCourse);
        textMobile=findViewById(R.id.textMobile);
        textMarks=findViewById(R.id.textMarks);

        Intent intent = getIntent();
      Student student = (Student) intent.getSerializableExtra("Student");
        textName.setText(student.getName());
        textRollno.setText(""+student.getRollNo());
        textCourse.setText(student.getCourse());
        textMobile.setText(""+student.getMobile());
        textMarks.setText(""+student.getMarks());

    }

    public void back(View view){
     finish();
    }
}