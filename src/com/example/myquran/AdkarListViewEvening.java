package com.example.myquran;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.Toast;

public class AdkarListViewEvening extends ActionBarActivity {

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

		String[] names={"أَصْبَـحْـنا وَأَصْبَـحْ المُـلكُ للَّهِ رَبِّ العـالَمـين ، اللّهُـمَّ إِنِّـي أسْـأَلُـكَ خَـيْرَ هـذا الـيَوْم ، فَـتْحَهُ ، وَنَصْـرَهُ ، وَنـورَهُ وَبَـرَكَتَـهُ ، وَهُـداهُ ، وَأَعـوذُ بِـكَ مِـنْ شَـرِّ ما فـيهِ وَشَـرِّ ما بَعْـدَه",
				"الْحَمْدُ لِلَّهِ الَّذِي أَقَالَنَا يَوْمَنَا هَذَا وَلَمْ يُهْلِكْنَا بِذُنُوبِنَا",
				"كفى بالله بالنسبة لي لا شيء لديه الحق في ان يعبد سواه الله عليه وسلم أنا أعتمد وهو رب العرش العظيم",
				"أعوذ بكلمات الله التامات من شر ما خلق"};
		String[] txt={"The morning has come to me and the whole universe belongs to Allah, the Lord of the worlds, O Allah, I ask of you the good of the day, it's success and aid and it's nur (celestial light) and barakaat (blessings) and seek hidayah (guidance) and seek refuge from the evil in it (this day) and from the evil of that which is to come later.",
				"All praise be to Allah who has forgiven us today and not destroyed us due to our sin.",
				"Allah is sufficient for me, none has the right to be worshiped except him, upon him I rely and he is lord of the exalted throne.(Seven time morning and evening)",
				"I take refuge in Allah's perfect words from the evil He has created.(three times in the evening)"
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
