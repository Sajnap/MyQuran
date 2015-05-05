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
		setContentView(R.layout.activity_main);
	}
	public void islamButton(View v)
	{
		Toast.makeText(getApplicationContext(), "clicked", Toast.LENGTH_SHORT).show();
	}
	public void eimanButton(View v)
	{
		Toast.makeText(getApplicationContext(), "clicked", Toast.LENGTH_SHORT).show();
	}
	public void quranButton(View v)
	{
		Toast.makeText(getApplicationContext(), "clicked", Toast.LENGTH_SHORT).show();
	}
	public void adkarButton(View v)
	{
		Toast.makeText(getApplicationContext(), "clicked", Toast.LENGTH_SHORT).show();
	}
	public void prayerTimebutton(View v)
	{
		Toast.makeText(getApplicationContext(), "clicked", Toast.LENGTH_SHORT).show();
		startActivity(new Intent(this, PrayerTimeActivity.class));
		finish();
		return;
	}
	public void zakkathButton(View v)
	{
		//Toast.makeText(getApplicationContext(), "clicked", Toast.LENGTH_SHORT).show();
		startActivity(new Intent(this, ZakkathActivity.class));
		finish();
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
