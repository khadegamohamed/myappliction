package com.example.theproject22;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.ArrayList;

public class Nam_sub_db extends SQLiteOpenHelper {
    public static final int version=1;
    public static final String DB_NAME="name";
    public static final String TABLE_NAME="subject";
    public static final String sub_name="sub_nam";
    public static final String REC_NAME="name";
    public static final String PIC_NAME="photo";

   public Nam_sub_db(Context context){

       super(context,DB_NAME,null,version);
   }

    @Override
    public void onCreate(SQLiteDatabase db) {
       db.execSQL("CREATE TABLE "+TABLE_NAME + " ( " +sub_name +" text," +REC_NAME+" text," +PIC_NAME +
               "byte)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {



                }
    public boolean insertName(Name name){
       SQLiteDatabase db=getWritableDatabase();
        ContentValues values=new ContentValues();
        values.put(sub_name,name.getSub_name());

         long result=db.insert(TABLE_NAME,null,values);

        return result != -1;
    }
public ArrayList<Name> getName()
{
    ArrayList<Name>names=new ArrayList<>();
    ArrayList<byte[]>pictures=new ArrayList<>();

    SQLiteDatabase db=getReadableDatabase();
    Cursor cursor=db.rawQuery(" SELECT * FROM "+TABLE_NAME,null);
    if (cursor.moveToFirst())
    {
        do {
            String name = cursor.getString(cursor.getColumnIndex(sub_name));
            byte[] img=cursor.getBlob(cursor.getColumnIndex(PIC_NAME));
            pictures.add(img);
            Name nam = new Name(name,pictures,);
            return names;
        }while(cursor.moveToNext());

    }
    return null;
}


}
