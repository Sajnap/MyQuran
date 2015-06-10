package com.example.myquran;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.Toast;

public class AdkarListViewMosque extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		getSupportActionBar().setDisplayShowHomeEnabled(true);
		getSupportActionBar().setLogo(R.drawable.quranz);
		getSupportActionBar().setDisplayUseLogoEnabled(true);
		setContentView(R.layout.adkar_home1);
		ListView myListView=(ListView) findViewById(R.id.my_main_listview);

		UserAdapterAdkar myUserAdapter=new UserAdapterAdkar(getApplicationContext(), createDummyUserModels());

		myListView.setAdapter(myUserAdapter);
	}
	public UserModel[] createDummyUserModels(){

		String[] names={"رَبِّ اغْفِرْ لِي ذُنُوبِي وَافْتَحْ لِي أَبْوَابَ رَحْمَتِكَ ",
				"اللَّهُمَّ افْتَحْ لِي أَبْوَابَ رَحْمَتِكَ"};
		String[] txt={"O Lord, forgive my sins and open the doors of mercy for me.",
				"O Allah, open the doors of mercy"
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
		getMenuInflater().inflate(R.menu.newww, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			finish();
			startActivity(getIntent());
			Toast.makeText(getApplicationContext(), "Refreshing..", Toast.LENGTH_SHORT).show();
		}
		return super.onOptionsItemSelected(item);
	}
}
