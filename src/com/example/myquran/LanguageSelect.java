package com.example.myquran;

import java.util.Locale;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.ToggleButton;

public class LanguageSelect extends ActionBarActivity {

	boolean toggleState;
	TextView text1;
	String lang;
	String lang1;
	SharedPreferences sharedPreferences;
	ToggleButton toggleButton;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.lang_select);
		text1 = (TextView) findViewById(R.id.textView1);
		ToggleButton tg = (ToggleButton) findViewById(R.id.switch1);
		sharedPreferences = getApplicationContext().getSharedPreferences("toggleState",Context.MODE_PRIVATE);
		toggleState=sharedPreferences.getBoolean("ToggleState",false);
		lang="Arabic";
		lang1="English";
		if(toggleState){
			setLocale("ar"); 
			//text.setText("ON");
			tg.setChecked(true);
		}
		else {
			setLocale("en-us");
			//text.setText("OFF");
			tg.setChecked(false);
		}

	}

	private void setLocale (String localeCode){
		Locale locale = new Locale(localeCode);
		Locale.setDefault(locale);
		Configuration config = new Configuration();
		config.locale = locale;
		getBaseContext().getResources().updateConfiguration(config, getBaseContext().getResources().getDisplayMetrics());
		getApplicationContext().getResources().updateConfiguration(config, getBaseContext().getResources().getDisplayMetrics());
		LanguageSelect.this.getResources().updateConfiguration(config, getBaseContext().getResources().getDisplayMetrics());
	}

	public void onToggleClicked(View view) {

		toggleState = ((ToggleButton) view).isChecked();
		SharedPreferences.Editor editor = getSharedPreferences("toggleState", MODE_PRIVATE).edit();

		if (toggleState) {
			setLocale("ar"); 
			//text.setText("ON");
			text1.setText("Selected Language is "+lang+" !");

		} else {
			setLocale("en-us");
			//text.setText("OFF");
			text1.setText("Selected Language is "+lang1+" !");
		}
		editor.putBoolean("ToggleState", toggleState);
		editor.commit();

	}

	@Override
	public void onBackPressed() {
		startActivity(new Intent(this, HomePage.class));
		finish();		
	}
}
