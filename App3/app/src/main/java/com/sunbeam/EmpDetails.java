package com.sunbeam;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class EmpDetails extends AppCompatActivity {

    TextView empId,empName,empSalary;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emp_details);

        empId=findViewById(R.id.empId);
        empName=findViewById(R.id.empName);
        empSalary=findViewById(R.id.empSalary);

        Intent intent = getIntent();
        Employee emp = (Employee) intent.getSerializableExtra("Employee");
        Log.e( "onCreate: ", emp.getName());
        Log.e( "onCreate: ", String.valueOf(emp.getEmpid()));
        Log.e( "onCreate: ", String.valueOf(emp.getSalary()));
        Toast.makeText(this, emp.toString(), Toast.LENGTH_SHORT).show();
        empId.setText(""+emp.getEmpid());
        empName.setText(emp.getName());
        empSalary.setText(""+emp.getSalary());


    }
}