package com.example.myquran;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

public class AdkarListViewMorning extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.adkar_home1);
		ListView myListView=(ListView) findViewById(R.id.my_main_listview);

		UserAdapterAdkar myUserAdapter=new UserAdapterAdkar(getApplicationContext(), createDummyUserModels());

		myListView.setAdapter(myUserAdapter);
	}
	public UserModel[] createDummyUserModels(){

		String[] names={"اللهم بإذن الخاصة بك ونحن قد وصلت صباح اليوم و ترك لكم أننا وصلنا في المساء بإذن الخاصة بك ونحن نعيش ونموت و لكم ما قيامتنا",
				"اللّهُـمَّ بِكَ أَصْـبَحْنا وَبِكَ أَمْسَـينا ، وَبِكَ نَحْـيا وَبِكَ نَمُـوتُ وَإِلَـيْكَ المَصِيْر ",
				"الْحَمْدُ لِلَّهِ الَّذِي أَقَالَنَا يَوْمَنَا هَذَا وَلَمْ يُهْلِكْنَا بِذُنُوبِنَا",
				"يا من أي وقت مضى المعيشة الاقتيات الذاتي و مؤيد وقبل كل شيء رحمتك أعوذ المساعدة اصلح لي كل شؤوني ولا تترك لي لنفسي حتى ل طرفة عين",
				"كيف سبحان الله وأنا الثناء عليه"};
		String[] txt={"O Allah, by your leave we have reached the morning and by Your leave we have reached the evening, by your leave we live and die and unto you is our resurrection.",
				"O Allah we enter the day time and the evening and die with your Qudrat (power) and to You do we return.",
				"All praise be to Allah who has forgiven us today and not destroyed us due to our sin.",
				"O Ever Living, O self-subsisting and supporter of all, by your mercy I seek assistance, rectify for me all of my affairs and do not leave me to myself, even for the blink of an eye",
				"How perfect Allah is and I praise him.(hundred times)"};
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
