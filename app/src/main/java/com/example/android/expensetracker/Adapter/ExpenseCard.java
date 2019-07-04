package com.example.android.expensetracker.Adapter;

import java.util.Date;

/**
 * Created by Akanksha_Rajwar on 26-04-2019.
 */

public class ExpenseCard {
    private int amount;
    private String desc;
    private Date date;

    public ExpenseCard(int amt,String description,Date date)
    {
        amount=amt;
        desc=description;
    }

    public int getExpenseAmount()
    {
        return amount;
    }

    public String getStringDescription()
    {
        return desc;
    }

    public Date getDate()
    {
        return date;
    }
}
