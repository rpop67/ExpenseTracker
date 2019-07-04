package com.example.android.expensetracker.Data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Akanksha_Rajwar on 04-07-2019.
 */

public class ExpenseHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME="shelter.db";
    public static final Integer DATABASE_VERSION=1;
    public ExpenseHelper(Context context){
        super(context,DATABASE_NAME,null,DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
       String SQL_CREATE_TABLE_EXPENSE="CREATE TABLE "+ExpenseContract.ExpenseEntry._Table_Name+" ("
               + ExpenseContract.ExpenseEntry._ExpenseTitle+" TEXT NOT NULL,"
               + ExpenseContract.ExpenseEntry._ExpenseAmount+" INTEGER NOT NULL,"
               + ExpenseContract.ExpenseEntry._Date+" INTEGER NOT NULL,"
               + ExpenseContract.ExpenseEntry._Month+" INTEGER NOT NULL,"
               + ExpenseContract.ExpenseEntry._Year+" INTEGER NOT NULL);";
        db.execSQL(SQL_CREATE_TABLE_EXPENSE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
