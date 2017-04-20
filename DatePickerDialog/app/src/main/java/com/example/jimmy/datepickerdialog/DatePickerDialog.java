package com.example.jimmy.datepickerdialog;

import android.icu.util.Calendar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Date;
import java.util.Locale;

public class DatePickerDialog extends AppCompatActivity {
    private TextView showdate;
    private Button setdate;
    private int year;
    private int month;
    private int day;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        showdate = (TextView) this.findViewById(R.id.showdate);
        setdate = (Button) this.findViewById(R.id.setdate);

        Calendar c = Calendar.getInstance(Locale.CHINA);
        Date mydate = new Date();
        c.setTime(mydate);

        year=c.get(Calendar.YEAR);
        month=c.get(Calendar.MONTH);
        day=c.get(Calendar.DAY_OF_MONTH);
        showdate.setText("当前日期："+year+"-"(month+1)+"-"day);

        setdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DatePickerDialog my_datePickerDialog=new DatePickerDialog(DatePickerDialog.this,Datelistener,year,month,day);

            }
        });

    }
}
