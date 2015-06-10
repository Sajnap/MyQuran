package com.example.myquran;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.Toast;

public class Islamactivity extends ActionBarActivity {


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		getSupportActionBar().setDisplayShowHomeEnabled(true);
		getSupportActionBar().setLogo(R.drawable.quranz);
		getSupportActionBar().setDisplayUseLogoEnabled(true);
		setContentView(R.layout.islam_activity);

		final ListView myListView=(ListView) findViewById(R.id.my_main_listview);

		UserAdapterAdkar myUserAdapter=new UserAdapterAdkar(getApplicationContext(), createDummyUserModels());

		myListView.setAdapter(myUserAdapter);


	}
	public UserModel[] createDummyUserModels(){

		String[] names={"Islam is not a new religion because ‘submission to the will of God’, has always been the only acceptable religion in the sight of God.",
				"The word ‘Muslim’ means one who submits to the will of God, regardless of their race, nationality or ethnic background.",
				"The word ‘Islam’ is an Arabic word which means ‘submission to the will of God’. This word comes from the same root as the Arabic word ‘salam’, which means ‘peace’.",
				"He who desires a religion other than Islam, never will it be accepted of him; and in the Hereafter he/she will be among the losers.(Quran 3:85)",
				"The most important truth that God revealed to mankind is that there is nothing divine or worthy of being worshipped except for Almighty God, thus all human beings should submit to Him.",
				"Muslims neither worship Muhammad nor pray through him. Muslims solely worship the Unseen and Omniscient Creator, Allah."
				,"The Qur'an was not authored by Muhammad. It was authored by God, revealed to Muhammad (through angel Gabriel) and written into physical form by his companions.",
				"Being a Muslim entails willful submission and active obedience to God, and living in accordance with His message.",
				"The hajj is an annual pilgrimage to the Kaaba made by about 3 million Muslims from all corners of the Earth. It is performed to fulfill one of the pillars of Islam."};
		String[] txt={"الإسلام ليس دين جديد بسبب الخضوع لإرادة الله كانت دائما الدين الوحيد المقبول في نظر الله",
				"كلمة مسلم تعني الشخص الذي يسلم لإرادة الله بغض النظر عن الجنسية عرقهم أو الخلفية العرقية",
				"كلمة الإسلام هي الكلمة العربية التي تعنيكلمة الإسلام هي الكلمة العربية التي تعني الخضوع لإرادة الله . هذه الكلمة تأتي من نفس جذر الكلمة العربية سلام التي تعني السلام",
				"وقال انه يرغب دين آخر غير الإسلام ولن تكون أبدا يقبل منه و إنه في الآخرة أو انها سوف تكون من الخاسرين (القرآن الكريم 3:85 )",
				"الحقيقة الأكثر أهمية أن الله أنزل للبشرية هو أنه لا يوجد شيء إلهي أو يستحق أن يعبد إلا عن الله سبحانه وتعالى وبالتالي جميع البشر يجب أن تقدم له",
				"المسلمون لا يعبدون محمد ولا نصلي من خلاله. المسلمون يعبدون الغيب و العليم الخالق الله وحده",
				"لم يكن تأليف القرآن لمحمد . وكان من تأليف الله أنزل على محمد و مكتوبة في شكل مادي من قبل أصحابه",
				"كونه مسلم يستلزم تقديم العمد و الطاعة النشطة إلى الله والعيش وفقا ل رسالته",
				"الحج هو الحج إلى الكعبة التي أدلى بها عن مليون مسلم من كل ركن من أركان الأرض . يتم تنفيذ ذلك ل تحقيق واحد من أركان الإسلام"
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

