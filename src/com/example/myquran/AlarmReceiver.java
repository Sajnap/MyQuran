package com.example.myquran;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.PowerManager;
import android.widget.Toast;

public class AlarmReceiver extends BroadcastReceiver {

	final public static String ONE_TIME = "onetime";

	@Override
	public void onReceive(Context context, Intent intent) {
		PowerManager pm = (PowerManager) context.getSystemService(Context.POWER_SERVICE);
		PowerManager.WakeLock wl = pm.newWakeLock(PowerManager.PARTIAL_WAKE_LOCK, "YOUR TAG");
		//Acquire the lock
		wl.acquire();

		//You can do the processing here.
		Bundle extras = intent.getExtras();
		StringBuilder msgStr = new StringBuilder();

		if(extras != null && extras.getBoolean(ONE_TIME, Boolean.FALSE)){
			//Make sure this intent has been sent by the one-time timer button.
			msgStr.append("One time Timer : ");
		}
		Format formatter = new SimpleDateFormat("hh:mm");
		msgStr.append(formatter.format(new Date()));
		String Time = "01:12";
		System.out.println(Time);
		System.out.println(msgStr);
		String ss= msgStr.toString().trim();
		System.out.println(ss+"nnnnnn");

		if (ss.contains(Time.trim())) {
			Toast.makeText(context, "AlarmOn", Toast.LENGTH_LONG).show();
		} 
		//	         else 
		//	         {
		//	        	 Toast.makeText(context, "Not Time", Toast.LENGTH_LONG).show();
		//			 }


		//Release the lock
		wl.release();
	}

}