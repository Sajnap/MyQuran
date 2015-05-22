package com.example.myquran;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class AdkarActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.adkar_home);
	}
	public void MorningDua(View v)
	{
		startActivity(new Intent(this, AdkarListViewMorning.class));
		//this.finish();
		return;
	}
	public void EveningDua(View v)
	{
		startActivity(new Intent(this, AdkarListViewEvening.class));
		//this.finish();
		return;
	}
	
	public void SleepDua(View v)
	{
		startActivity(new Intent(this, AdkarListViewSleep.class));
		//this.finish();
		return;
	}
	public void WakingUpDua(View v)
	{
		startActivity(new Intent(this, AdkarListViewWakingUp.class));
		//this.finish();
		return;
	}
	
	public void EnterMosqueDua(View v)
	{
		startActivity(new Intent(this, AdkarListViewMosque.class));
		//this.finish();
		return;
	}
	
	public void AfterPrayer(View v)
	{
		startActivity(new Intent(this, AdkarListViewAfterPrayer.class));
		//this.finish();
		return;
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
		switch (item.getItemId()) {
		case R.id.action_settings:
			startActivity(new Intent(getApplicationContext(),LanguageSelect.class));
			break;
//		case R.id.action_settings1:
//			break;
			
		default:
			break;
		}
		return super.onOptionsItemSelected(item);
	}
}
