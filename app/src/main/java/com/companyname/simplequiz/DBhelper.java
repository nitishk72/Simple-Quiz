package com.companyname.simplequiz;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Nitish Kumar Singh on 12-12-2017.
 */

public class DBhelper extends SQLiteOpenHelper{
    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "PROJECT011";
    static final String CREATE = "Create Table "+DBquestion.TABLE_NAME+" (id integer primary key autoincrement ,"
            +DBquestion.QUESTION+" text ,"
            +DBquestion.OPTION_A+" text ,"
            +DBquestion.OPTION_B+" text ,"
            +DBquestion.OPTION_C+" text ,"
            +DBquestion.OPTION_D+" text ,"
            +DBquestion.CORRECT_OPTION+" text);";

    static final String DROP_TABLE = "DROP TABLE if exists"+DBquestion.TABLE_NAME+" ;";

    public DBhelper(Context context) {
        super(context,DATABASE_NAME,null,DATABASE_VERSION);

    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(CREATE);
    }


    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL(DROP_TABLE);
        onCreate(sqLiteDatabase);
    }
    public void SaveQueastion(String Q, String A, String B,String C,String D,String Correct , SQLiteDatabase sqLiteDatabase){
        ContentValues contentValues = new ContentValues();
        contentValues.put(DBquestion.QUESTION,Q);
        contentValues.put(DBquestion.OPTION_A,A);
        contentValues.put(DBquestion.OPTION_B,B);
        contentValues.put(DBquestion.OPTION_C,C);
        contentValues.put(DBquestion.OPTION_D,D);
        contentValues.put(DBquestion.CORRECT_OPTION,Correct);
        sqLiteDatabase.insert(DBquestion.TABLE_NAME,null,contentValues);
    }
    public Cursor ReadQuestion(SQLiteDatabase sqLiteDatabase){
        String[] projections = {"id",DBquestion.QUESTION,DBquestion.OPTION_A,DBquestion.OPTION_B,DBquestion.OPTION_C,DBquestion.OPTION_D,DBquestion.CORRECT_OPTION};
        return (sqLiteDatabase.query(DBquestion.TABLE_NAME,projections,null,null,null,null,null));
    }
}
