package com.example.theproject22;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import java.util.ArrayList;

public class add_subject extends AppCompatActivity {
ImageView img;
EditText add_sub,add_rec;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_subject);
        Button bt_save =findViewById(R.id.save);
        img=findViewById(R.id.imge_back);

        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(add_subject.this,subject_activity.class);
                startActivityForResult(i,3);
            }
        });
      bt_save.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Nam_sub_db db=new Nam_sub_db(add_subject.this);
              String sub_nam=add_sub.getText().toString();
              String rec_name=add_rec.getText().toString();
              Name name=new Name(sub_nam,rec_name);
              db.insertName(name);
          }
      });
    }
}
