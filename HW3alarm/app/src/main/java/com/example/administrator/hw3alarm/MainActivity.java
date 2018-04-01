package com.example.administrator.hw3alarm;

import android.app.AlarmManager;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    TimePicker timePick;
    Button btnSet;

    PendingIntent pendingintent;
    AlarmManager alarm ;
    Calendar calendar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        timePick = findViewById(R.id.timePicker);
        btnSet = findViewById(R.id.btn_setAlarm);

        Intent intent = new Intent();
        intent.setClass(MainActivity.this, BR_Activity.class);

        pendingintent = PendingIntent.getBroadcast(MainActivity.this, 1, intent, 0);
        alarm = (AlarmManager)getSystemService(ALARM_SERVICE);

    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    public void fn_setAlarm(View view) {
        int hour = timePick.getHour();
        int min = timePick.getMinute();

        calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        calendar.set(Calendar.HOUR_OF_DAY,hour);
        calendar.set(Calendar.MINUTE,min);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);

        alarm.set(AlarmManager.RTC_WAKEUP,calendar.getTimeInMillis(),pendingintent);

        Toast.makeText(MainActivity.this,"Set time: "+hour+":"+min,Toast.LENGTH_LONG).show();

    }
}
