package com.sunbeam;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainActivity2 extends AppCompatActivity {

    Spinner spinner;
    List<String> contries;

    ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        contries = new ArrayList<String>();
        spinner= findViewById(R.id.spinner);
        Collections.addAll(contries,"India","Australia","UK","USA","Japan");

       adapter= new ArrayAdapter(this, android.R.layout.simple_list_item_1,contries);
       spinner.setAdapter(adapter);

       spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
           @Override
           public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
               //Toast.makeText(MainActivity2.this,"Contry Selected: "+ contries.get(position), Toast.LENGTH_SHORT).show();
               Snackbar.make(MainActivity2.this,view,"Contry Selected: "+ contries.get(position),Snackbar.LENGTH_SHORT).show();
           }

           @Override
           public void onNothingSelected(AdapterView<?> parent) {

           }
       });




    }
}