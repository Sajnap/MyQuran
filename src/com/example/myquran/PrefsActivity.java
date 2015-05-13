package com.example.myquran;  

import java.util.Locale;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.view.View;
import android.widget.Toast;
import android.widget.ToggleButton;

public class PrefsActivity extends PreferenceActivity{  
	@Override  
	protected void onCreate(Bundle savedInstanceState) {  
		super.onCreate(savedInstanceState);  
		addPreferencesFromResource(R.xml.prefs);  
		
	} 
	private void setLocale (String localeCode){
		Locale locale = new Locale(localeCode);
		Locale.setDefault(locale);
		Configuration config = new Configuration();
		config.locale = locale;
		getBaseContext().getResources().updateConfiguration(config, getBaseContext().getResources().getDisplayMetrics());
		getApplicationContext().getResources().updateConfiguration(config, getBaseContext().getResources().getDisplayMetrics());
		PrefsActivity.this.getResources().updateConfiguration(config, getBaseContext().getResources().getDisplayMetrics());
	}

	public void onToggleClicked(View view) {

		boolean on = ((ToggleButton) view).isChecked();
		//boolean off= ((ToggleButton) view).isChecked();

		if (on) {
			setLocale("ar"); 

		} else {
			setLocale("en-us");
			Toast.makeText(getApplicationContext(), "Off button mode", Toast.LENGTH_SHORT).show();

		}
		startActivity(new Intent(this, HomePage.class));
		finish();

	}

}  
