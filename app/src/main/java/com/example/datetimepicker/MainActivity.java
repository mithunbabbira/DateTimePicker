package com.example.datetimepicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

import java.sql.Date;
import java.sql.Time;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
   // TimePicker timePicker;
    TextView textView;
    DatePicker datePicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // timePicker = findViewById(R.id.timepicker);
        textView = findViewById(R.id.textid);
        datePicker = findViewById(R.id.datepicker);


        Calendar calendar = Calendar.getInstance();


        datePicker.init(
                calendar.get(Calendar.YEAR),
                calendar.get(Calendar.DAY_OF_MONTH),
                calendar.get(Calendar.DAY_OF_MONTH),

                new DatePicker.OnDateChangedListener() {
                    @Override
                    public void onDateChanged(DatePicker view, int year, int month, int day) {
                        textView.setText("you seleted:"+ day+"-" +month+"-"+year);
                    }
                }
        );







//        timePicker.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
//            @Override
//            public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {
//                textView.setText("hour: "+ hourOfDay +"\n minutes" + minute);
//            }
//        });
    }
}
