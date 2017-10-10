package com.BiTechX.physics_assistant.formula7;

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
import android.widget.EditText;
import android.widget.TextView;

import com.BiTechX.physics_assistant.MenuActivity;
import com.BiTechX.physics_assistant.R;

public class Gravity106ResActivity extends Activity {

	TextView resultTextView;
	DecimalFormat decimalFormat = new DecimalFormat("####.####");
	DecimalFormat longDecimalFormat = new DecimalFormat(
			"####.############");

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.activity_gravity106_res);

		Button menuback = (Button) findViewById(R.id.menu);

		menuback.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				Intent intent = new Intent(Gravity106ResActivity.this,
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

			final double G = 6.754 * Math.pow(10, -11);
			final double M = 5.972 * Math.pow(10, 24);

			if (val1.toLowerCase().equals("x")) {

				double h = Double.parseDouble(val2);
				double R = Double.parseDouble(val3);
				double g = Double.parseDouble(val4);

				double gp = (1 - (h / R)) * g;

				resultTextView.setText("The Value is \n"
						+ longDecimalFormat.format(gp) + "\n Meters/Seconds^2");

			}
			if (val2.toLowerCase().equals("x")) {

				double gp = Double.parseDouble(val1);
				double R = Double.parseDouble(val3);
				double g = Double.parseDouble(val4);

				double h = (1 - (gp / g)) * R;

				resultTextView.setText("The Value is \n"
						+ decimalFormat.format(h) + "\n Meters");

			}
			if (val3.toLowerCase().equals("x")) {

				double gp = Double.parseDouble(val1);
				double h = Double.parseDouble(val2);
				double g = Double.parseDouble(val4);

				double R = h / (1 - (gp / g));

				resultTextView.setText("The Value is \n"
						+ decimalFormat.format(R) + "\n Meters");

			}
			if (val4.toLowerCase().equals("x")) {

				double gp = Double.parseDouble(val1);
				double h = Double.parseDouble(val2);
				double R = Double.parseDouble(val3);

				double g = gp / (1 - (h / R));

				resultTextView.setText("The Value is \n"
						+ decimalFormat.format(g) + "\n Meters/Seconds^2");
			}
		} catch (Exception e) {
			resultTextView.setText("Please Put The Inputs Correctly!!!");
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.gravity106_res, menu);
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
