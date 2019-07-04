package com.example.android.expensetracker;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CalendarView;

import com.example.android.expensetracker.DataLoader.ExpenseActivity;

public class MainActivity extends AppCompatActivity {

        private static final String TAG=
                "CalendarActivity";
        private CalendarView mCalendarView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mCalendarView =(CalendarView)findViewById(R.id.calendarView);

        mCalendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener(){
            @Override
            public void onSelectedDayChange(@NonNull CalendarView calendarView, int i, int i1, int i2) {
                String date=(i2)+" - "+(i1+1)+" - "+i; //i+1 is for month
                Intent intent =new Intent(MainActivity.this,ExpenseActivity.class);
                intent.putExtra("date",date);
                startActivity(intent);
            }
        });

    }
}

