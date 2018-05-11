package lincyu.chapter8_album1;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends ListActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		ArrayList<String> albumlist = new ArrayList<String>();

		albumlist.add("台北美景");
		albumlist.add("台中美景");
		albumlist.add("台中美女");
		albumlist.add("台中帥哥");
		albumlist.add("台中美食");
		albumlist.add("台中之光");


		ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(
				this,
				R.layout.listitem,
				R.id.tv_item,
				albumlist);

//		ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(
//				this,
//				android.R.layout.simple_list_item_1,
//				albumlist);

		setListAdapter(adapter1);
	}

	@Override
	protected void onListItemClick(ListView l, View v,
			int position, long id) {

		super.onListItemClick(l, v, position, id);

		int [] imageIds = null;
		int columns = 1;
		switch(position) {
			case 0:
			imageIds = new int[6];
			imageIds[0] = R.drawable.h01;
			imageIds[1] = R.drawable.h02;
			imageIds[2] = R.drawable.h03;
			imageIds[3] = R.drawable.h04;
			imageIds[4] = R.drawable.h05;
			imageIds[5] = R.drawable.h06;
			columns = 2;
			break;
			case 1:default:
			imageIds = new int[5];
			imageIds[0] = R.drawable.sc001;
			imageIds[1] = R.drawable.sc002;
			imageIds[2] = R.drawable.sc003;
			imageIds[3] = R.drawable.sc004;
			imageIds[4] = R.drawable.sc005;
			break;
		}
		Intent intent = new Intent();
		intent.setClass(MainActivity.this, GridActivity.class);
		intent.putExtra("KEY_IDS", imageIds);
		intent.putExtra("KEY_COLUMNS", columns);
		startActivity(intent);
	}
}
