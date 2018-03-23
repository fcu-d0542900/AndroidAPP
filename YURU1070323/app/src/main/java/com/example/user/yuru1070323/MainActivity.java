package com.example.user.yuru1070323;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends ListActivity {

    ArrayList<HashMap<String,String>> list = new ArrayList<HashMap<String,String>>();
    private SimpleAdapter adapter;

    private  static  final String[] mPlace = new String[] {
            "台北", "淡水", "新竹", "新竹", "新埔",
            "台中", "台中", "南投", "鹿港", "彰化",
            "嘉義", "麻豆", "台南", "台南", "高雄",
            "萬巒", "宜蘭", "新竹", "大湖", "台中",
            "南投", "台南安平", "高雄美濃", "花蓮", "澎湖"
    };

    private static final String[] mFoods = new String[] {
            "刈包", "阿給", "貢丸", "米粉", "柿餅",
            "大麵焿", "蔴芛湯","意麵", "麵線糊", "肉圓",
            "火雞肉飯","碗粿","棺材板","擔仔麵","黑輪",
            "豬腳","牛舌餅","貢丸","草莓","太陽餅",
            "日月潭紅茶","蝦餅","粄條","剝皮辣椒","黑糖糕"
    };

//    String[] data = {"台北","台中","高雄"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for(int i=0;i<mPlace.length;i++) {
            HashMap<String,String> item = new HashMap<String,String>();
            item.put("food",mFoods[i]);
            item.put("place",mPlace[i]);
            list.add(item);
        }

        adapter = new SimpleAdapter(
                this,
                list,
                android.R.layout.simple_list_item_2,
                new String[]{"food","place"},
                new int[]{android.R.id.text1,android.R.id.text2});

        /*ArrayAdapter adapter = new ArrayAdapter<>(this,
               android.R.layout.simple_list_item_1,
                R.layout.list_item,
                R.id.tv_item,
                data);*/


        setListAdapter(adapter);


    }

    protected void onListItemClick(ListView l,View v,int position,long id) {
        super.onListItemClick(l,v,position,id);

        Intent intent = new Intent(MainActivity.this,NextActivity.class);
        intent.putExtra("n",position);
        startActivityForResult(intent,111);

        /*String msg = "我喜歡"+mPlace[position]+"的"+mFoods[position];
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show();*/
    }

}
