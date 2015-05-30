package com.example.myquran;

import java.util.ArrayList;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class QuranActivityChapters extends ActionBarActivity {
	
ListView lvList;
String [] ChaperName,idName;
String Cname,CID,IntentValue;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.quran);
		lvList=(ListView) findViewById(R.id.my_main_listview);
		ChaperName    = getResources().getStringArray(R.array.quranList);
		ArrayList<String> Qname = new ArrayList<String>();
		ArrayList<String> QID = new ArrayList<String>();
		
			IntentValue  = getIntent().getExtras().getString("ID");
		
			
				for (int i = 0; i < ChaperName.length; i++) {
					
					idName = ChaperName[i].split(",");
					CID = idName[1];
					
					
					if (CID.contains(IntentValue))
					{
						Cname=idName[4];
						System.out.println(Cname+"VVVVVVVVVVv");
						Qname.add(Cname);
						
					}
					
					
					}
			ArrayAdapter<String>	adapter = new ArrayAdapter(QuranActivityChapters.this, android.R.layout.simple_list_item_1,Qname);
			lvList.setAdapter(adapter);
		
		
		//new MyDBLoaderAsync().execute();
	}
/*
	private class MyDBLoaderAsync extends AsyncTask<Void, Void, String>{
		ListView myListView;
		ArrayList<String> data;

		@Override
		protected void onPreExecute() {
			myListView=(ListView) findViewById(R.id.my_main_listview);
			dbh=new DataBaseHelper(getApplicationContext());
		}

		@Override
		protected String doInBackground(Void... params) {
			try {
				dbh.onCreate(null);
				Cursor c=null;
				data=new ArrayList<String>();
				dbh.openDataBase();
				c=dbh.viewdata();
				if(c!=null)
				{
					if(c.moveToFirst())
					{
						int n, p;
						String m;
						do {
							n=c.getInt(c.getColumnIndex("LanguageNo"));
							p=c.getInt(c.getColumnIndex("chapterID"));
							m=c.getString(c.getColumnIndex("SuraName"));
							data.add("Language: "+n+"\n Chapter: "+p+"\nSura Name: "+m);
						}while(c.moveToNext());
					} else {
						runOnUiThread(new Runnable() {
							public void run() {
								Toast.makeText(getApplicationContext(),"Empty database",Toast.LENGTH_SHORT).show();
							}
						});
					}
				} else {
					runOnUiThread(new Runnable() {
						public void run() {
							Toast.makeText(getApplicationContext(),"No Such table found!!",Toast.LENGTH_SHORT).show();
						}
					});
				}		
			} catch (final Exception e) {
				runOnUiThread(new Runnable() {
					public void run() {
						Toast.makeText(getApplicationContext(),"Exception\n -- No database",Toast.LENGTH_LONG).show();
						e.printStackTrace();
					}
				});
			}

			return null;
		}

		@Override
		protected void onPostExecute(String result) {
			if (result!=null) {
				ArrayAdapter<String> adapter=new ArrayAdapter<String>(QuranActivity.this,android.R.layout.simple_list_item_1,data);
				myListView.setAdapter(adapter);	
			}
		}

	}*/
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {

		int id = item.getItemId();
		switch (item.getItemId()) {
		case R.id.action_settings:
			startActivity(new Intent(getApplicationContext(),LanguageSelect.class));
			break;
			//		case R.id.action_settings1:
			//			break;

		default:
			break;
		}
		return super.onOptionsItemSelected(item);
	}

}
