package com.sunbeam.activity;

import android.app.LauncherActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


import androidx.activity.EdgeToEdge;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.sunbeam.R;
import com.sunbeam.adapter.MyAdapter;
import com.sunbeam.entity.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmpListActivity extends AppCompatActivity {

    Toolbar toolbar;

    RecyclerView recyclerView;

    List<Employee> empList;

    MyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emp_list);

        toolbar=findViewById(R.id.toolbar);
        recyclerView=findViewById(R.id.recyclerView);

        setSupportActionBar(toolbar);

        empList = new ArrayList<>();
        empList.add(new Employee(1,"Anil",10000));
        empList.add(new Employee(2,"Mukesh",20000));

        adapter= new MyAdapter(this,empList);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new GridLayoutManager(this,1));

    }

    ActivityResultLauncher launcher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback<ActivityResult>() {
        @Override
        public void onActivityResult(ActivityResult result) {
            if(result.getResultCode() == 1) {
                Employee emp = (Employee) result.getData().getSerializableExtra("employee");
                empList.add(emp);
            }
        }
    });

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add("Add").setIcon(R.drawable.add).setShowAsAction(MenuItem.SHOW_AS_ACTION_ALWAYS);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        Intent intent = new Intent(this, EmpAddActivity.class);
        launcher.launch(intent);
        return super.onOptionsItemSelected(item);
    }
}