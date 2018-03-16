package com.example.user.app1070316;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int luckyNum;
    Button btn_go;
    TextView tv_hello;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_hello = findViewById(R.id.tv_hello);
        btn_go = findViewById(R.id.btn_go);
    }

    public void fn_lucky(View view) {
        Random r = new Random();
        luckyNum = r.nextInt(6)+1;
        Log.i("random",Integer.toString(luckyNum));
        btn_go.setEnabled(true);
        tv_hello.setText(Integer.toString(luckyNum));
    }

    public  void fn_goNext(View view) {
        Intent intent = new Intent(MainActivity.this,GoActivity.class);
        intent.putExtra("n",luckyNum);
        startActivityForResult(intent,111);
    }



}
