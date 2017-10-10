package com.BiTechX.physics_assistant.formula5;

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

public class Motion403ResActivity extends Activity {

	TextView resultTextView;
	DecimalFormat decimalFormat = new DecimalFormat("####.####");

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.activity_motion403_res);

		Button menuback = (Button) findViewById(R.id.menu);

		menuback.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				Intent intent = new Intent(Motion403ResActivity.this,
						MenuActivity.class);
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

				double wo = Double.parseDouble(val2);
				double a = Double.parseDouble(val3);
				double t = Double.parseDouble(val4);

				double w = wo + a * t;

				resultTextView.setText("The Value is \n"
						+ decimalFormat.format(w) + "Radians/Second");

			}
			if (val2.toLowerCase().equals("x")) {

				double w = Double.parseDouble(val1);
				double a = Double.parseDouble(val3);
				double t = Double.parseDouble(val4);

				double wo = w - (a * t);

				resultTextView.setText("The Value is \n"
						+ decimalFormat.format(wo) + "Radians/Second");

			}
			if (val3.toLowerCase().equals("x")) {

				double w = Double.parseDouble(val1);
				double wo = Double.parseDouble(val2);
				double t = Double.parseDouble(val4);

				double a = (w - wo) / t;

				resultTextView.setText("The Value is \n"
						+ decimalFormat.format(a) + "Radians/Second^2");

			}
			if (val4.toLowerCase().equals("x")) {

				double w = Double.parseDouble(val1);
				double wo = Double.parseDouble(val2);
				double a = Double.parseDouble(val3);

				double t = (w - wo) / a;

				resultTextView.setText("The Value is \n"
						+ decimalFormat.format(t) + "Seconds");
			}
		} catch (Exception e) {
			resultTextView.setText("Please Put The Inputs Correctly!!!");
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.motion403_res, menu);
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
