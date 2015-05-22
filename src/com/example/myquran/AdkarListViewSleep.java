package com.example.myquran;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

public class AdkarListViewSleep extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.adkar_home1);
		ListView myListView=(ListView) findViewById(R.id.my_main_listview);

		UserAdapterAdkar myUserAdapter=new UserAdapterAdkar(getApplicationContext(), createDummyUserModels());

		myListView.setAdapter(myUserAdapter);
	}
	public UserModel[] createDummyUserModels(){

		String[] names={"الْحَمْدُ لِلَّهِ الَّذِي يُحْيِي الْمَوْتَى وَهُوَ عَلَى كُلِّ شَيْءٍ قَدِيرٍ",
				"اللهم احمني من العقاب لديك في اليوم الذي بعث عبيد يور",
				"باسمك اللهم إني يعيش ويموت",
				"الحمد لله الذي أطعمنا وقدم لنا الشراب و الذي هو كاف بالنسبة لنا ، و محمية بنا للحصول على كم من لا شيء ل يكون كافيا لهم أو مأوى لهم"};
		String[] txt={"All Praise be to Allah, who raises the dead to life and Who is in control of everything",
				"O Allah, protect me from Your punishment on the day Yor servants are resurrected.(three times)",
				"In your name O Allah, I live and die.",
				"All praise is for Allah, who fed us and gave us drink, and who is sufficient for us and has sheltered us, for how many have none to suffice them or shelter them."
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
