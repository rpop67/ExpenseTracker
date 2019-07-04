package com.example.android.expensetracker.Data;
import android.provider.BaseColumns;

import java.util.Date;

/**
 * Created by Akanksha_Rajwar on 04-07-2019.
 */

public class ExpenseContract {

    //emptyContructor
    private ExpenseContract(){}

    public static final class ExpenseEntry implements BaseColumns{

        public final static String _Table_Name="expenses";
        public final static String _ExpenseTitle="expenseTitle";
        public final static String _Date="date";
        public final static String _Month="month";
        public final static String _Year="year";
        public final static String _ExpenseAmount="expenseAmount";

    }
}
