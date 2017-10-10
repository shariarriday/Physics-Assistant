package com.BiTechX.physics_assistant.formula3;

import java.text.DecimalFormat;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

import com.BiTechX.physics_assistant.MenuActivity;
import com.BiTechX.physics_assistant.R;

public class Motion205ResActivity extends Activity {

	TextView resultTextView;
	DecimalFormat decimalFormat = new DecimalFormat("####.####");

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.activity_motion205_res);

        Button menuback = (Button) findViewById(R.id.menu);
		
		menuback.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				Intent intent= new Intent(Motion205ResActivity.this, MenuActivity.class);
				 startActivity(intent);
				
			}
		});
		
		try {

			resultTextView = (TextView) findViewById(R.id.result);

			String val1 = getIntent().getStringExtra("val1");
			String val2 = getIntent().getStringExtra("val2");
			String val3 = getIntent().getStringExtra("val3");
			String val4 = getIntent().getStringExtra("val4");

			if (val1.toLowerCase().equals("x")) {

				double vo = Double.parseDouble(val2);
				double theta = Double.parseDouble(val3);
				double g = Double.parseDouble(val4);

				theta *= (Math.PI / 180);

				double hm = ((vo * Math.sin(theta))*(vo * Math.sin(theta))) / 2* g;

				resultTextView.setText("The Value is \n"
						+ decimalFormat.format(hm) + "Meters");

			}
			if (val2.toLowerCase().equals("x")) {

				double hm = Double.parseDouble(val1);
				double theta = Double.parseDouble(val3);
				double g = Double.parseDouble(val4);

				theta *= (Math.PI / 180);

				double vo = Math.sqrt(hm *2* g) / Math.sin(theta);

				resultTextView.setText("The Value is \n"
						+ decimalFormat.format(vo) + "Meters/Second");

			}
			if (val3.toLowerCase().equals("x")) {

				double tm = Double.parseDouble(val1);
				double vo = Double.parseDouble(val2);
				double g = Double.parseDouble(val4);

				double theta = Math.sqrt(Math.toDegrees(Math.asin(tm * g / vo)));

				resultTextView.setText("The Value is \n"
						+ decimalFormat.format(theta) + "Degrees");

			}
			if (val4.toLowerCase().equals("x")) {

				double hm = Double.parseDouble(val1);
				double vo = Double.parseDouble(val2);
				double theta = Double.parseDouble(val3);

				theta *= (Math.PI / 180);
				double g = ((vo * Math.sin(theta))*(vo * Math.sin(theta))) / 2 * hm;

				resultTextView.setText("The Value is \n"
						+ decimalFormat.format(g) + "Meters/Second^2");
			}
		} catch (Exception e) {
			resultTextView.setText("Please Put The Inputs Correctly !!!");
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.motion205_res, menu);
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
