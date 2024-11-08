package com.example.app1;

import android.os.Bundle;
import android.widget.Adapter;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyview;

    List<Course> courseList;

    CourseAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyview=findViewById(R.id.recyview);

        courseList=new ArrayList<>();

        courseList.add(new Course(1, "Android Development", 85000.0,
                "Master the art of building native and hybrid mobile applications",
                "Graduate in any discipline", R.drawable.dmc));

        courseList.add(new Course(2, "Data Science Fundamentals", 70000.0,
                "Learn the basics of data analysis and manipulation",
                "Open to all graduates", R.drawable.dbda));

        courseList.add(new Course(3, "Web Development Bootcamp", 65000.0,
                "Become a full-stack developer with this comprehensive course",
                "No prior experience required", R.drawable.dac));

        adapter=new CourseAdapter(this,courseList);
        recyview.setAdapter(adapter);
        recyview.setLayoutManager(new GridLayoutManager(this,1));


    }
}