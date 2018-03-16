package com.example.user.app1070316;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class GoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_go);

        ImageView img = findViewById(R.id.picBaseball);

        Intent intent = getIntent();
        int luckNum = intent.getIntExtra("n",1);
        Log.i("show lucky",Integer.toString(luckNum));

        switch (luckNum) {
            case 1:
                img.setImageResource(R.drawable.b16);
                break;
            case 2:
                img.setImageResource(R.drawable.b39);
                break;
            case 3:
                img.setImageResource(R.drawable.b58);
                break;
            case 4:
                img.setImageResource(R.drawable.b61);
                break;
            case 5:
                img.setImageResource(R.drawable.b92);
                break;
            case 6:
                img.setImageResource(R.drawable.b93);
                break;
        }
    }

    public void fn_like(View view) {
        Intent i = new Intent();
        i.putExtra("Like",1);
        setResult(RESULT_OK,i);
        finish();
    }

    public void fn_dislike(View view) {
        Intent i = new Intent();
        i.putExtra("Like",0);
        setResult(RESULT_OK,i);
        finish();
    }
}
