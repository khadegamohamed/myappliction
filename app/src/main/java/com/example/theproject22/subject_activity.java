package com.example.theproject22;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class subject_activity extends AppCompatActivity {

RecyclerView recycle;
ArrayList<Name>subjects=new ArrayList<>();
FloatingActionButton ft_bt;
    Nam_sub_db db=new Nam_sub_db(subject_activity.this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subject_activity);
        recycle=findViewById(R.id.subject_recycler);
        ft_bt=findViewById(R.id.sub_fl_bt);
        ft_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(subject_activity.this,add_subject.class);

                startActivity(i);
            }
        });

subjects.add(db.getName());

Recycle_Adapter adapter =new Recycle_Adapter(subjects, new Recycle_listner() {


    @Override
    public void onRecyclerListner(Name name) {
Intent i=new Intent(subject_activity.this,sub_contact.class);
i.putExtra("sub_name",name.getSub_name());
i.putExtra("lec_Array",name.getLectures());
i.putExtra("phto_Array",name.getPicture());
startActivityForResult(i,1);
    }
});
        RecyclerView.LayoutManager layoutManager= new LinearLayoutManager(subject_activity.this);
        recycle.setLayoutManager(layoutManager);
        recycle.setAdapter(adapter);
       recycle.setHasFixedSize(true);
    }
}
