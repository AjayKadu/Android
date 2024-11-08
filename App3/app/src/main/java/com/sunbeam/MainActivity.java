package com.sunbeam;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    List<Employee> emp;

    ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=findViewById(R.id.listView);

        emp = new ArrayList<>();

        emp.add(new Employee(1,"Jack",2000.00));
        emp.add(new Employee(11,"Smith",4000.00));
        emp.add(new Employee(22,"Tim",500.00));
        emp.add(new Employee(33,"Mitchel",1500.00));
        emp.add(new Employee(44,"Travis",3000.00));
        emp.add(new Employee(55,"Pat",4500.00));

        adapter= new ArrayAdapter(this, android.R.layout.simple_list_item_1,emp);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(MainActivity.this, "Emp Selected: "+emp.get(position).getName(), Toast.LENGTH_SHORT).show();
                Employee e = emp.get(position);

                Intent intent = new Intent(MainActivity.this,EmpDetails.class);
                intent.putExtra("Employee", e);
                startActivity(intent);
            }
        });


    }
}