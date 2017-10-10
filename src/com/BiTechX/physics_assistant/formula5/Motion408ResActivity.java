package com.BiTechX.physics_assistant.formula5;

import java.text.DecimalFormat;

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

public class Motion408ResActivity extends Activity {

	TextView resultTextView;
	DecimalFormat decimalFormat = new DecimalFormat("####.####");

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.activity_motion408_res);

		Button menuback = (Button) findViewById(R.id.menu);

		menuback.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				Intent intent = new Intent(Motion408ResActivity.this,
						MenuActivity.class);
				startActivity(intent);

			}
		});
		
		
		try {

			resultTextView = (TextView) findViewById(R.id.result);

			String val1 = getIntent().getStringExtra("val1");
			String val2 = getIntent().getStringExtra("val2");
			String val3 = getIntent().getStringExtra("val3");

			if (val1.toLowerCase().equals("x")) {

				double m = Double.parseDouble(val2);
				double k = Double.parseDouble(val3);

				double i = m * k * k;

				resultTextView.setText("The Value is \n"
						+ decimalFormat.format(i) + "KilogramsMeters^2");

			}
			if (val2.toLowerCase().equals("x")) {

				double i = Double.parseDouble(val1);
				double k = Double.parseDouble(val3);

				double m = i / (k * k);

				resultTextView.setText("The Value is \n"
						+ decimalFormat.format(m) + "Kilograms");

			}
			if (val3.toLowerCase().equals("x")) {

				double i = Double.parseDouble(val1);
				double m = Double.parseDouble(val2);

				double k = Math.sqrt(i / m);

				resultTextView.setText("The Value is \n"
						+ decimalFormat.format(k) + "Meters");
			}

		} catch (Exception e) {
			resultTextView.setText("Please Put The Inputs Correctly !!!");
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.motion408_res, menu);
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
