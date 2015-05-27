package com.example.myquran;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class HomePage extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//getActionBar().setHomeButtonEnabled(true);
		setContentView(R.layout.activity_main);
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		
		switch (item.getItemId()) {
		
		case R.id.action_settings:
			Intent i = new Intent(this, LanguageSelect.class);
			startActivity(i);
			finish();

			return true;
		}
		//return super.onOptionsItemSelected(item);
		return false;
	}

	public void quranButton(View v)
	{
		startActivity(new Intent(this, QuranActivity.class));
		//this.finish();
		return;
	}
	public void adkarButton(View v)
	{
		startActivity(new Intent(this, AdkarActivity.class));
		return;
	}
	public void prayerTimebutton(View v)
	{
		startActivity(new Intent(this, PrayerTimeActivity.class));
		//finish();
		return;

	}
	public void zakkathButton(View v)
	{
		startActivity(new Intent(this, ZakkathActivity.class));
		//finish();
		return;
	}
	public void aboutbutton(View v)
	{
		startActivity(new Intent(this, AboutAppActivity.class));
		//finish();
		return;
	}
}



