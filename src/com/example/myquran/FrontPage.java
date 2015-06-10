package com.example.myquran;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.ActionBarActivity;
import android.view.MenuItem;
import android.view.Window;

public class FrontPage extends Activity {

	private static int SPLASH_TIME_OUT = 4000;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		 this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.home_page);
		//this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		new Handler().postDelayed(new Runnable() {
			 
            /*
             * Showing splash screen with a timer. This will be useful when you
             * want to show case your app logo / company
             */

            @Override
            public void run() {
                // This method will be executed once the timer is over
                // Start your app main activity
                Intent i = new Intent(FrontPage.this, HomePage.class);
                startActivity(i);

                // close this activity
                finish();
            }
        }, SPLASH_TIME_OUT);
    }
	
}
