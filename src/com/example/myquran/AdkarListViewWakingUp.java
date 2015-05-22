package com.example.myquran;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

public class AdkarListViewWakingUp extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.adkar_home1);
		ListView myListView=(ListView) findViewById(R.id.my_main_listview);

		UserAdapterAdkar myUserAdapter=new UserAdapterAdkar(getApplicationContext(), createDummyUserModels());

		myListView.setAdapter(myUserAdapter);
	}
	public UserModel[] createDummyUserModels(){

		String[] names={"الحمد لله الذي منحنا الحياة بعد أن يؤخذ منا و إنا إليه هو القيامة","الحمد لله الذي أعاد لي صحتي وعاد نفسي و سمحت لي أن تذكر له"};
		String[] txt={"All praise is for Allah who gave us life after having taken it from us and unto Him is the resurrection.",
				"All praise is for Allah who restored to me my health and returned my soul and has allowed me to remember Him."
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
