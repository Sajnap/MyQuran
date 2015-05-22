//package com.example.myquran;  
//
//import java.util.Locale;
//
//import android.content.Intent;
//import android.content.res.Configuration;
//import android.os.Bundle;
//import android.preference.ListPreference;
//import android.preference.Preference;
//import android.preference.Preference.OnPreferenceClickListener;
//import android.preference.PreferenceActivity;
//import android.view.View;
//import android.widget.Toast;
//import android.widget.ToggleButton;
//
//public class PrefsActivity extends PreferenceActivity{  
//	@Override  
//	protected void onCreate(Bundle savedInstanceState) {  
//		super.onCreate(savedInstanceState);  
//		try {
//			addPreferencesFromResource(R.xml.prefs);
//		} catch (Exception e) {
//
//		}  
//		final ListPreference listPreference = (ListPreference) findPreference("language");
////		listPreference.setOnPreferenceClickListener(new OnPreferenceClickListener() {
////			
////			@Override
////			public boolean onPreferenceClick(Preference preference) {
////				// TODO Auto-generated method stub
////				Toast.makeText(getApplicationContext(), "helllo", Toast.LENGTH_SHORT).show();
////				return false;
////			}
////		});
//		//	((ListPreference) findPreference("pref_language")).setValue(Locale .getDefault().getLanguage());
//
//		//		setListPreferenceData(listPreference);
//		//
//		//		listPreference.setOnPreferenceClickListener(new OnPreferenceClickListener() {
//		//			@Override
//		//			public boolean onPreferenceClick(Preference preference) {
//		//
//		//				setListPreferenceData(listPreference);
//		//				return false;
//		//			}
//		//		});
//
//	} 
//	//	protected static void setListPreferenceData(ListPreference lp) {
//	//		CharSequence[] entries = { "English", "Arabic" };
//	//		CharSequence[] entryValues = {"1" , "2"};
//	//		lp.setEntries(entries);
//	//		lp.setDefaultValue("1");
//	//		lp.setEntryValues(entryValues);
//	//		
//	//
//	//	}
//	private void setLocale (String localeCode){
//		Locale locale = new Locale(localeCode);
//		Locale.setDefault(locale);
//		Configuration config = new Configuration();
//		config.locale = locale;
//		getBaseContext().getResources().updateConfiguration(config, getBaseContext().getResources().getDisplayMetrics());
//		getApplicationContext().getResources().updateConfiguration(config, getBaseContext().getResources().getDisplayMetrics());
//		PrefsActivity.this.getResources().updateConfiguration(config, getBaseContext().getResources().getDisplayMetrics());
//	}
//
//	public void onToggleClicked(View view) {
//
//		boolean on = ((ToggleButton) view).isChecked();
//		//boolean off= ((ToggleButton) view).isChecked();
//
//		//boolean on = false;
//		if (on) {
//			setLocale("ar"); 
//
//		} else {
//			setLocale("en-us");
//			Toast.makeText(getApplicationContext(), "Off button mode", Toast.LENGTH_SHORT).show();
//
//		}
//		startActivity(new Intent(this, HomePage.class));
//		finish();
//
//	}
//
//}  
