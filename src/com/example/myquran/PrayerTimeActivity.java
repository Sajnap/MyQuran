package com.example.myquran;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class PrayerTimeActivity extends ActionBarActivity {
	TextView textView1;
	TextView textView8;
	TextView textView9;
	TextView textView10;
	TextView textView11;
	TextView textView12;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.prayer_time);
		TextView fajrtxt = (TextView) findViewById(R.id.textView1);
		TextView subhtxt = (TextView) findViewById(R.id.textView8);
		TextView zohrtxt = (TextView) findViewById(R.id.textView9);
		TextView asrtxt = (TextView) findViewById(R.id.textView10);
		TextView magtxt = (TextView) findViewById(R.id.textView11);
		TextView ishatxt = (TextView) findViewById(R.id.textView12);

	}
	// onClick method for the button
	public void getTime(View v) {
		// Retrive lat, lng using location API
		double latitude = 23.7;
		double longitude = 90.3833;
		double timezone = (Calendar.getInstance().getTimeZone()
				.getOffset(Calendar.getInstance().getTimeInMillis()))
				/ (1000 * 60 * 60);
		PrayTime prayers = new PrayTime();

		prayers.setTimeFormat(prayers.Time12);
		prayers.setCalcMethod(prayers.Makkah);
		prayers.setAsrJuristic(prayers.Shafii);
		prayers.setAdjustHighLats(prayers.AngleBased);
		int[] offsets = { 0, 0, 0, 0, 0, 0, 0 }; // {Fajr,Sunrise,Dhuhr,Asr,Sunset,Maghrib,Isha}
		prayers.tune(offsets);

		Date now = new Date();
		Calendar cal = Calendar.getInstance();
		cal.setTime(now);

		ArrayList prayerTimes = prayers.getPrayerTimes(cal, latitude,
				longitude, timezone);
		ArrayList prayerNames = prayers.getTimeNames();

		for (int i = 0; i < prayerTimes.size(); i++) {
			
			textView1.append("\n" + prayerTimes.get(i));
			textView8.append("\n" + prayerTimes.get(i));
			textView9.append("\n" + prayerTimes.get(i));
			textView10.append("\n" + prayerTimes.get(i));
			textView11.append("\n" + prayerTimes.get(i));
			textView12.append("\n" + prayerTimes.get(i));
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
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
