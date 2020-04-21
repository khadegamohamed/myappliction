package com.example.theproject22;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class subject_activity extends AppCompatActivity {
RecyclerView recycle;
ArrayList<Name>subjects=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subject_activity);
        recycle=findViewById(R.id.subject_recycler);
        subjects.add(new Name("logic"));
        subjects.add(new Name("machine"));
        subjects.add(new Name("lab"));
        subjects.add(new Name("control"));

Recycle_Adapter adapter =new Recycle_Adapter(subjects, new Recycle_listner() {
    @Override
    public void onRecyclerListner(Name name) {
        Intent i=new Intent(subject_activity.this,sub_contact.class);
        startActivity(i);
    }

    @Override
    public void onClicklistner(Name name1) {
        Intent intent=new Intent(subject_activity.this,sub_contact.class);
        startActivity(intent);
    }
});
        RecyclerView.LayoutManager layoutManager= new LinearLayoutManager(subject_activity.this);
        recycle.setLayoutManager(layoutManager);
        recycle.setAdapter(adapter);
       recycle.setHasFixedSize(true);
    }
}
