package com.example.theproject22;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;

import java.io.FileNotFoundException;
import java.io.InputStream;

public class add_picture extends AppCompatActivity {
ImageButton img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_picture);
        img=findViewById(R.id.imageButton);

    }
    public void openMenuOfSheets(View v)
    {
        Intent intent=new Intent(Intent.ACTION_GET_CONTENT) ;
        intent.setType("image/*");
        startActivityForResult(intent,50);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(resultCode==RESULT_OK && requestCode == 50)

        {
            Uri uri=data.getData();
            try {


                InputStream inputStream = getContentResolver().openInputStream(uri);
                Bitmap bm= BitmapFactory.decodeStream(inputStream);
                img.setImageBitmap(bm);
            }
          catch (Exception e)
          {
             Log.e("ex"," file not found ");
          }
        }
    }
}
