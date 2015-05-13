package com.example.myquran;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class HomePage extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	public void quranButton(View v)
	{
		startActivity(new Intent(this, QuranActivity.class));
		//this.finish();
		return;
	}
	public void adkarButton(View v)
	{
		Toast.makeText(getApplicationContext(), "clicked", Toast.LENGTH_SHORT).show();
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
		Toast.makeText(getApplicationContext(), "clicked", Toast.LENGTH_SHORT).show();
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

			startActivity(new Intent(this,PrefsActivity.class));
			//return true;
			break;
		case R.id.action_settings1:
			break;

		default:
			break;
		}
		//return false;

		return super.onOptionsItemSelected(item);

	}
	private void displaySharedPreferences() {  
		SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(HomePage.this);  

		String listPrefs = prefs.getString("listpref", "Default list prefs");  

		StringBuilder builder = new StringBuilder();  

		builder.append("List preference: " + listPrefs);  
		//textView.setText(builder.toString());  

	}  

}

