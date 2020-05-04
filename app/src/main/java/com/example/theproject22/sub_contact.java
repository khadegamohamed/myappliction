package com.example.theproject22;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class sub_contact extends AppCompatActivity {
TabLayout tabLayout;
ViewPager viewPager;
    ImageView img;
 Toolbar toolbar;
 TextView textView;
 ArrayList<String>lectures;
 ArrayList<Integer>pictures;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_contact);
        textView=findViewById(R.id.txt_nam_sub);
        Intent intent=new Intent();
        textView.setText(intent.getStringExtra("sub_name"));
         lectures=intent.getStringArrayListExtra("lec_Array");
         pictures=intent.getIntegerArrayListExtra("phto_Array");
        tabLayout=findViewById(R.id.main_tab);
        viewPager=findViewById(R.id.view_pager);
        img=findViewById(R.id.img_back);
        toolbar=findViewById(R.id.toolbar);
        setSupportActionBar( toolbar);
        tabLayout.setupWithViewPager(viewPager);
      Pager_Adater adapter=new Pager_Adater(getSupportFragmentManager());
      adapter.addTab(new MyTab("videoes",  new Vid_frag()));
        adapter.addTab(new MyTab("lectures",  new lec_frag()));
        adapter.addTab(new MyTab("sheets",new sheet_frag()));
        viewPager.setAdapter(adapter);

        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(sub_contact.this,subject_activity.class);
                startActivityForResult(i,2);
            }
        });
    }
    }

