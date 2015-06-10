package com.example.myquran;

import java.util.ArrayList;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.ZoomControls;

public class QuranActivityChapters extends ActionBarActivity {

	ZoomControls zoom;
	ListView lvList;
	String [] ChapterName,idName;
	String Cname,CID,IntentValue;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		getSupportActionBar().setDisplayShowHomeEnabled(true);
		getSupportActionBar().setLogo(R.drawable.quranz);
		getSupportActionBar().setDisplayUseLogoEnabled(true);
		setContentView(R.layout.quran_chapter);
		zoom = (ZoomControls) findViewById(R.id.zoomControls1);
		lvList=(ListView) findViewById(R.id.my_main_listview);
		ChapterName    = getResources().getStringArray(R.array.quranList);
		ArrayList<String> Qname = new ArrayList<String>();
		ArrayList<String> QID = new ArrayList<String>();

		IntentValue  = getIntent().getExtras().getString("ID");
		IntentValue=IntentValue.replace(" ", "");
		int chapterNo=Integer.parseInt(IntentValue);
		int tempChapterNo=0;
		
		zoom.setOnZoomInClickListener(new OnClickListener() {

			@TargetApi(Build.VERSION_CODES.HONEYCOMB)
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				float x = lvList.getScaleX();
				float y = lvList.getScaleY();

				lvList.setScaleX((float) (x+0.50));
				lvList.setScaleY((float) (y+0.50));
			}
		});
		
		zoom.setOnZoomOutClickListener(new View.OnClickListener() {

			@TargetApi(Build.VERSION_CODES.HONEYCOMB)
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub


				float x = lvList.getScaleX();
				float y = lvList.getScaleY();

				lvList.setScaleX((float) (x-0.50));
				lvList.setScaleY((float) (y-0.50));
			}
		});

		for (int i = 0; i < ChapterName.length; i++) {

			idName = ChapterName[i].split(",");
			CID = idName[1];
			CID =CID.replace(" ", "");

			tempChapterNo=Integer.parseInt(CID);
			System.out.println(CID+" vs "+IntentValue);
			if (chapterNo == tempChapterNo )
			{
				Cname=idName[4];
				System.out.println(Cname+"VVVVVVVVVVv");
				Qname.add(Cname);
			}else if(chapterNo < tempChapterNo ){
				break;
			}
		}
		ArrayAdapter<String>	adapter = new ArrayAdapter(QuranActivityChapters.this, android.R.layout.simple_list_item_1,Qname);
		lvList.setAdapter(adapter);
}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.newww, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {

		int id = item.getItemId();
		switch (item.getItemId()) {
		case R.id.action_settings:

			finish();
			startActivity(getIntent());
			Toast.makeText(getApplicationContext(), "Refreshing..", Toast.LENGTH_SHORT).show();
		default:
			break;
		}
		return super.onOptionsItemSelected(item);
	}

}
