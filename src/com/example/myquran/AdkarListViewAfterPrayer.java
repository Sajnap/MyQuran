package com.example.myquran;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

public class AdkarListViewAfterPrayer extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.adkar_home1);
		ListView myListView=(ListView) findViewById(R.id.my_main_listview);

		UserAdapterAdkar myUserAdapter=new UserAdapterAdkar(getApplicationContext(), createDummyUserModels());

		myListView.setAdapter(myUserAdapter);
	}
	public UserModel[] createDummyUserModels(){

		String[] names={"اللهم إني أسألك المعرفة التي تعود بالنفع ومؤازرته وهو أمر جيد والأفعال التي هي مقبولة",
				"اللَّهُمَّ أَجِرْنِي مِنَ النَّارِ",
				"اللَّهُمَّ بِكَ أَحُولُ وَبِكَ أَصُولُ وَبِكَ أُقَاتِلُ "};
		String[] txt={"O Allah,  I ask You for knowledge which is beneficial and sustenance which is good, and deeds which are acceptable.(To be said after giving salam for the fajr prayer)",
				"O Allah, save me from the fire.",
				"O Allah, grant me the achievements of my goals for it is only with Your aid that I can attack the enemy and with Your assistance that I can declare Jihaad on them(After forenoon prayer)"
				};
		UserModel[] userlist=new UserModel[names.length];
		for (int i = 0; i < txt.length; i++) {
			userlist[i]=new UserModel(names[i],txt[i]);
		}
		return userlist;
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
