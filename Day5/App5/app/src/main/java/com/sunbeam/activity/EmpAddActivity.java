package com.sunbeam.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.sunbeam.R;
import com.sunbeam.entity.Employee;

public class EmpAddActivity extends AppCompatActivity {

    EditText editId,editName,editSalary;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emp_add);

        editId=findViewById(R.id.editId);
        editName=findViewById(R.id.editName);
        editSalary=findViewById(R.id.editSalary);
    }

    public void save(View v){

        Employee emp = new Employee();
        emp.setEmpid(Integer.parseInt(editId.getText().toString()));
        emp.setName(editName.getText().toString());
        emp.setSalary(Double.parseDouble(editSalary.getText().toString()));

        Intent intent = new Intent();
        intent.putExtra("employee",emp);
        setResult(1,intent);
        finish();
    }

    public void cancle(View v){
        finish();
    }

}