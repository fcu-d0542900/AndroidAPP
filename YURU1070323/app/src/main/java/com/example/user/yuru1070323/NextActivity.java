package com.example.user.yuru1070323;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

import java.lang.reflect.Field;

public class NextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        ImageView img = findViewById(R.id.imgFood);

        Intent intent = getIntent();
        int position = intent.getIntExtra("n",1);
        Log.i("show position",Integer.toString(position));

        String imgS = "f"+(position+1);
        int imgRid = 0;
        try {
            imgRid = (R.drawable.class.getDeclaredField(imgS)).getInt(R.drawable.class);
        } catch (Exception ex) {
            Log.e("Exception", "" + ex.getMessage());
        }
        img.setImageResource(imgRid);
    }


}
