package com.example.yuru.yuru1070330;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by YURU on 2018/3/30.
 */

public class SleepReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if(intent.getAction().equals("SLEEP"))
            Toast.makeText(context, "收到了，一個小時後去睡覺", Toast.LENGTH_SHORT).show();
        if(intent.getAction().equals(Intent.ACTION_BATTERY_LOW))
            Toast.makeText(context, "沒電了，去睡覺了", Toast.LENGTH_SHORT).show();
    }

}
