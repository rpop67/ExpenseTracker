package com.example.android.expensetracker.DataLoader;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.android.expensetracker.R;

/**
 * Created by Akanksha_Rajwar on 26-04-2019.
 */

public class ExpenseActivity extends AppCompatActivity {


    TextView displayDate;
    String date;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expense);
        Intent incomingIntent=getIntent();
        date=incomingIntent.getStringExtra("date");
        displayDate=findViewById(R.id.dateView);
        displayDate.setText(date);
    }
}
