package com.project.assistant.sliit;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper
{
    private static final String DATABASE_NAME = "slide.db";
    private static final String TABLE_NAME = "slides";
    private static final String COLUMN_SLIDEID = "slideid";
    private static final String COLUMN_SLIDES = "slides";
    private static final String COLUMN_SUBJECTTYPE = "subjecttype";
    private static final String COLUMN_YEAR = "year";

    public DBHelper(Context context)
    {
        super(context,DATABASE_NAME,null,1);
        SQLiteDatabase db = this.getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db)
    {
        db.execSQL("CREATE TABLE "+ TABLE_NAME + "(slideid TEXT PRIMARY KEY,slides TEXT,subjecttype TEXT,year INT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME);
        onCreate(db);
    }

    public boolean onAdd(String slideid, String slides, String subjecttype, int year)
    {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();


        values.put(COLUMN_SLIDEID,slideid);
        values.put(COLUMN_SLIDES,slides);
        values.put(COLUMN_SUBJECTTYPE,subjecttype);
        values.put(COLUMN_YEAR,year);

        long result = db.insert(TABLE_NAME, null, values);

        if(result == -1)
        {
            return false;
        }
        else
        {
            return true;
        }
    }

    public Cursor viewAllData()
    {
        SQLiteDatabase db = this.getWritableDatabase();

        Cursor result = db.rawQuery("SELECT * FROM "+TABLE_NAME, null);
        return result;
    }


    public boolean onUpdate(String slideid, String slides, String subjecttype, int year)
    {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();

        values.put(COLUMN_SLIDEID,slideid);
        values.put(COLUMN_SLIDES,slides);
        values.put(COLUMN_SUBJECTTYPE,subjecttype);
        values.put(COLUMN_YEAR,year);

        long result = db.update(TABLE_NAME, values, "slideid", new String[]{slideid});

        if(result == -1)
        {
            return false;
        }
        else
        {
            return true;
        }
    }

}