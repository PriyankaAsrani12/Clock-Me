package com.example.periodtracker;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.github.sundeepk.compactcalendarview.CompactCalendarView;
import com.github.sundeepk.compactcalendarview.domain.Event;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Cal extends AppCompatActivity {
    CompactCalendarView compactCalendar;

    private SimpleDateFormat dateFormatMonth=new SimpleDateFormat("MMMM- yyyy", Locale.getDefault());


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cal);
        final ActionBar actionBar=getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(false);
        actionBar.setTitle(null);

        compactCalendar=(CompactCalendarView) findViewById(R.id.compactcalendar_view);
        compactCalendar.setUseThreeLetterAbbreviation(true);

        Event ev1=new Event(Color.RED,86400000 , "Periods Day");
        compactCalendar.addEvent(ev1);

        compactCalendar.setListener(new CompactCalendarView.CompactCalendarViewListener() {
            @Override
            public void onDayClick(Date dateClicked) {
                Context context=getApplicationContext();
                Log.d("hello",dateClicked.toString());

                if (dateClicked.toString().compareTo("Sat Mar 20 00:00:00 GMT+05:30 2021")==0){
                    Toast.makeText(context,"Periods Day",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(context," No Periods Day",Toast.LENGTH_SHORT).show();
                }
            }



            @Override
            public void onMonthScroll(Date firstDayOfNewMonth) {
                actionBar.setTitle(dateFormatMonth.format(firstDayOfNewMonth));
            }
        });


    }
}
