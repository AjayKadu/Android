package com.sunbeam;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText editName,editEmail,editPass;

    TextView textName,textEmail,textPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        editName= findViewById(R.id.editName);
        editEmail=findViewById(R.id.editEmail);
        editPass=findViewById(R.id.editPass);
        textName=findViewById(R.id.textName);
        textEmail=findViewById(R.id.textEmail);
        textPass=findViewById(R.id.textPass);
    }

    public void save(View view){

        String name = editName.getText().toString();
        String email = editEmail.getText().toString();
        String password = editPass.getText().toString();

        Log.e("mainActivity", name);
        Log.e("mainActivity", email);
        Log.e("mainActivity", password);

        textName.setText(name);
        textEmail.setText(email);
        textPass.setText(password);

    }

}