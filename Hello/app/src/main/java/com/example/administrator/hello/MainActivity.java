package com.example.administrator.hello;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bt = findViewById(R.id.btn_hi);
        bt.setOnClickListener(listener);

    }

    View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            EditText et = findViewById(R.id.editTextName);
            String textName = et.getText().toString();
            Log.i("message","Hello");
            Toast.makeText(MainActivity.this,"Hello, "+textName,Toast.LENGTH_LONG).show();

        }
    };
}
