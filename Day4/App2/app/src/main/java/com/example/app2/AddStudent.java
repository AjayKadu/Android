package com.example.app2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class AddStudent extends AppCompatActivity {

    EditText editId,editName,editRoll,editMobile,editMarks,editCourse;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_student);


        editName=findViewById(R.id.editName);
        editRoll=findViewById(R.id.editRoll);
        editMobile=findViewById(R.id.editMobile);
        editMarks=findViewById(R.id.editMarks);
        editCourse=findViewById(R.id.editCourse);
    }

    public void save(View view){

        Student st = new Student();
        st.setName(editName.getText().toString());
        st.setCourse(editCourse.getText().toString());
        st.setMarks(Double.parseDouble(editMarks.getText().toString()));
        st.setRollNo(Integer.parseInt(editRoll.getText().toString()));
        st.setMobile(Integer.parseInt(editMobile.getText().toString()));

        Intent intent = new Intent();
        intent.putExtra("Student",st);
        setResult(1,intent);
        finish();
    }

    public void cancle(View view){
        finish();
    }

}