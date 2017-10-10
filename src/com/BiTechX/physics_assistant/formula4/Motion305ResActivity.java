package com.BiTechX.physics_assistant.formula4;

import java.text.DecimalFormat;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import com.BiTechX.physics_assistant.MenuActivity;
import com.BiTechX.physics_assistant.R;

public class Motion305ResActivity extends Activity {

	DecimalFormat decimalFormat = new DecimalFormat("####.####");
	TextView resultTextView;

	@SuppressLint("DefaultLocale")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.activity_motion305_res);

	       Button menuback = (Button) findViewById(R.id.menu);
			
			menuback.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					
					Intent intent= new Intent(Motion305ResActivity.this, MenuActivity.class);
					 startActivity(intent);
					
				}
			});
			
			try {
				
		
		resultTextView = (TextView) findViewById(R.id.result);

		String val1 = getIntent().getStringExtra("val1");
		String val2 = getIntent().getStringExtra("val2");
		String val3 = getIntent().getStringExtra("val3");
		String val4 = getIntent().getStringExtra("val4");
		String val5 = getIntent().getStringExtra("val5");
		String val6 = getIntent().getStringExtra("val6");

		if (val1.toLowerCase().equals("x")) {

			double m2 = Double.parseDouble(val2);
			double u1 = Double.parseDouble(val3);
			double u2 = Double.parseDouble(val4);
			double v1 = Double.parseDouble(val5);
			double v2 = Double.parseDouble(val5);

			double m1 = (m2*(v2-u2))/(u1-v1);

			resultTextView.setText("The Value is" + decimalFormat.format(m1)
					+ "Kilograms");

		}
		if (val2.toLowerCase().equals("x")) {

			double m1 = Double.parseDouble(val1);
			double u1 = Double.parseDouble(val3);
			double u2 = Double.parseDouble(val4);
			double v1 = Double.parseDouble(val5);
			double v2 = Double.parseDouble(val6);
			
			double m2 = (m1*(u1-v1))/(v2-u2);

			resultTextView.setText("The Value is \n" + decimalFormat.format(m1)
					+ "\n Kilograms");
		}
		if (val3.toLowerCase().equals("x")) {

			double m1 = Double.parseDouble(val1);
			double m2 = Double.parseDouble(val2);
			double u2 = Double.parseDouble(val4);
			double v1 = Double.parseDouble(val5);
			double v2 = Double.parseDouble(val6);

			double u1 = ((m1*v1)+(m2*(v2-u2)))/m1;
			resultTextView.setText("The Value is \n" + decimalFormat.format(u1)
					+ "\n Meters/Second");
		}
		if (val4.toLowerCase().equals("x")) {

			double m1 = Double.parseDouble(val1);
			double m2 = Double.parseDouble(val2);
			double u1 = Double.parseDouble(val3);
			double v1 = Double.parseDouble(val5);
			double v2 = Double.parseDouble(val6);

			double u2 = ((m1*(v1-u1))+(m2*v2))/m2;

			resultTextView.setText("The Value is \n " + decimalFormat.format(u2)
					+ " \n Meters/Second");
		}
		if (val5.toLowerCase().equals("x")) {

			double m1 = Double.parseDouble(val1);
			double m2 = Double.parseDouble(val2);
			double u1 = Double.parseDouble(val3);
			double u2 = Double.parseDouble(val4);
			double v2 = Double.parseDouble(val6);

			double v1 = ((m1*u1)+(m2*(u2-v2)))/m1;

			resultTextView.setText("The Value is \n" + decimalFormat.format(v1)
					+ "\n Meters/Second");
		}
		if (val6.toLowerCase().equals("x")) {

			double m1 = Double.parseDouble(val1);
			double m2 = Double.parseDouble(val2);
			double u1 = Double.parseDouble(val3);
			double u2 = Double.parseDouble(val4);
			double v1 = Double.parseDouble(val5);

			double v2 = ((m1*(u1-v1))+(m2*u2))/m2;

			resultTextView.setText("The Value is \n" + decimalFormat.format(v2)
					+ "\n Meters/Second");
		}
			} catch (Exception e) {
				resultTextView.setText("Please Put The Inputs Correctly !!!");
			}
	}


	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.motion305_res, menu);
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
