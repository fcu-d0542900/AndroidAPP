package lincyu.chapter8_album1;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class GridActivity extends Activity {
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_grid);
		
		Intent intent = getIntent();
		int [] ids = intent.getIntArrayExtra("KEY_IDS");
		int cols = intent.getIntExtra("KEY_COLUMNS", 3);
		
		Integer [] imglist = new Integer[ids.length];
		for (int i = 0; i < ids.length; i++) {
			imglist[i] = Integer.valueOf(ids[i]);
		}

		// 在此設定 grid view 的 column
		GridView gv = (GridView)findViewById(R.id.gv);
		gv.setNumColumns(cols);
		gv.setHorizontalSpacing(4);
		gv.setVerticalSpacing(4);
		gv.setAdapter(new ImageAdapter(this, imglist));
	}
	
	public class ImageAdapter extends ArrayAdapter<Integer> {
	
		private Context mCtx;
		
		public ImageAdapter(Context c, Integer [] imglist) {
			super(c, 0, imglist);
			mCtx = c;
		}

		@Override
		public View getView(int position, View convertView,
				ViewGroup parent) {
			
			ImageView iv = new ImageView(mCtx);
			int resid = getItem(position);
			iv.setImageResource(resid);
			iv.setAdjustViewBounds(true);
			return iv;
		}	
	}
}