package com.example.myquran;

import java.util.Scanner;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ZakkathActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.zakkat_calculator);
	}
	
	public void calculate(View v) {
		
		try {
			Scanner input=new Scanner(System.in);
			float a=0,x=0,y=0,w;
			EditText h=((EditText)findViewById(R.id.editText1));
			String cash_hand=h.getText().toString();
			float h1=Float.parseFloat(cash_hand);
			
			EditText b=((EditText)findViewById(R.id.editText2));
			String cash_bank=b.getText().toString();
			float b1=Float.parseFloat(cash_bank);

			EditText g=((EditText)findViewById(R.id.editText3));
			String gold=g.getText().toString();
			float g1=Float.parseFloat(gold);
			
			TextView tv=(TextView)findViewById(R.id.textView2);
		
			
				a= (float) ((h1 * 2.5)/ 100);
				x= (float) ((b1 * 2.5)/ 100);
				y= (float) ((g1 * 2.5)/ 100);
				w=a+x+y;
				tv.setText("Total amount is:\n"+w+" !");
				
				//Toast.makeText(getApplicationContext(), "The total amount is = " + w + " !", Toast.LENGTH_SHORT).show();
				
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
