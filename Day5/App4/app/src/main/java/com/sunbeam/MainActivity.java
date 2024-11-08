package com.sunbeam;

import android.os.Bundle;
import android.widget.Switch;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity extends AppCompatActivity {

    TabLayout tabLayout;

    ViewPager2 viewPager2;

    MyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout=findViewById(R.id.tabLayout);

        viewPager2=findViewById(R.id.viewPager2);

        adapter=new MyAdapter(this);
        viewPager2.setAdapter(adapter);

        new TabLayoutMediator(tabLayout, viewPager2, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {

                switch(position){
                    case 0:
                        //tab.setText("First");
                        tab.setIcon(R.drawable.list);
                        break;
                    case 1:
                       // tab.setText("Second");
                        tab.setIcon(R.drawable.person);
                        break;
                    case 2:
                        //tab.setText("Third");
                        tab.setIcon(R.drawable.contact);
                        break;
                    case 3:
                       // tab.setText("Fourth");
                        tab.setIcon(R.drawable.setting);
                        break;
                }
            }
        }).attach();

    }
}