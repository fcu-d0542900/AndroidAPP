package com.example.yuru.yuru1070330;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public  void fn_sleep(View view) {
        Intent intent = new Intent();
        intent.setAction("SLEEP");
        sendBroadcast(intent);
    }


}
