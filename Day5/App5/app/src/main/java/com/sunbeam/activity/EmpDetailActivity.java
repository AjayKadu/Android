package com.sunbeam.activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.sunbeam.R;
import com.sunbeam.entity.Employee;

public class EmpDetailActivity extends AppCompatActivity {

    TextView textId,textName,textSalary;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emp_detail);

        textId=findViewById(R.id.textId);
        textName=findViewById(R.id.textName);
        textSalary=findViewById(R.id.textSalary);


        Intent intent  = getIntent();
       Employee emp = (Employee) intent.getSerializableExtra("employee");
       textId.setText("Id: "+emp.getEmpid());
       textName.setText("Name: "+emp.getName());
       textSalary.setText("Salary: "+emp.getSalary());
    }
}