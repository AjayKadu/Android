package com.example.app2;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.activity.EdgeToEdge;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class StudentList extends AppCompatActivity {

    RecyclerView  recyView;

    Toolbar toolbar;

    List<Student> studentList;

    StudentAdapter studentAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_list);

        toolbar=findViewById(R.id.toolbar);

        recyView=findViewById(R.id.recyView);

        setSupportActionBar(toolbar);

        studentList= new ArrayList<>();
        studentList.add(new Student(22,"Jatin",60, 6278656,"DMC"));

        studentAdapter= new StudentAdapter(this,studentList);
        recyView.setAdapter(studentAdapter);
        recyView.setLayoutManager(new GridLayoutManager(this,1));
    }

    ActivityResultLauncher launcher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback<ActivityResult>() {
        @Override
        public void onActivityResult(ActivityResult result) {
            if(result.getResultCode()==1) {
                Intent intent = result.getData();
                Student student = (Student) intent.getSerializableExtra("Student");
                studentList.add(student);
            }
        }
    });

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu,menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        Intent intent = new Intent(this, AddStudent.class);
        launcher.launch(intent);
        return super.onOptionsItemSelected(item);
    }
}