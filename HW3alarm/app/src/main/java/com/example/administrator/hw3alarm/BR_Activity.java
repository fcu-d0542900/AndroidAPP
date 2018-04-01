package com.example.administrator.hw3alarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * Created by Administrator on 2018/4/1.
 */

public class BR_Activity extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        String msg = intent.getStringExtra("KEY_MSG");

        Intent newIntent = new Intent();
        newIntent.setClass(context,ActivityDialog.class);
        newIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        newIntent.putExtra("KEY_MSG",msg);
        context.startActivity(newIntent);
    }
}
