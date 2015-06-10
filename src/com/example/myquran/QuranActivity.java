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
import android.widget.ListView;

public class QuranActivity extends ActionBarActivity {
	DataBaseHelper dbh;
	UserModel contacts ;
	String[] name,id ;
	ListView myListView;
	String ss,nameq;
	ArraySuraname adapter ;
	ArrayList<String> Qname = new ArrayList<String>();
	ArrayList<String> QID = new ArrayList<String>();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		getSupportActionBar().setDisplayShowHomeEnabled(true);
		getSupportActionBar().setLogo(R.drawable.quranz);
		getSupportActionBar().setDisplayUseLogoEnabled(true);
		setContentView(R.layout.quran);
		myListView=(ListView) findViewById(R.id.my_main_listview);
		name    = getResources().getStringArray(R.array.suranamesList);
		
		for (int i = 0; i < name.length; i++) {
			
			id = name[i].split(",");
			ss = id[1];
			nameq=id[2];
			Qname.add(nameq);
			QID.add(ss);
			System.out.println(Qname);
			System.out.println(QID);
			
		}
		
		 adapter = new ArraySuraname(QuranActivity.this, android.R.layout.simple_list_item_1,Qname,QID);
		myListView.setAdapter(adapter);
		myListView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				// TODO Auto-generated method stub
				String ss = QID.get(position);
				System.out.println(ss+"PPPPPPPPPPPPPPPPP");
				Intent i = new Intent(QuranActivity.this,QuranActivityChapters.class);
				i.putExtra("ID", ss);
				startActivity(i);
				
			}
		});
		
	}

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
			
		default:
			break;
		}
		return super.onOptionsItemSelected(item);
	}

}
