package com.example.theproject22;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class subject_activity extends AppCompatActivity {
RecyclerView recycle;
ArrayList<String>subjects=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subject_activity);
        recycle=findViewById(R.id.subject_recycler);

        Recycle_Adapter adapter=new Recycle_Adapter(subjects, new Recycle_listner() {
            @Override
            public void onClicklistner() {
                Intent i=new Intent(subject_activity.this,sub_contact.class);
                startActivity(i);
            }
        });
       recycle.setHasFixedSize(true);
    }
}
