package com.BiTechX.physics_assistant.formula6;

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

public class Work106ResActivity extends Activity {

	TextView resultTextView;
	DecimalFormat decimalFormat = new DecimalFormat("####.####");

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.activity_work106_res);

		Button menuback = (Button) findViewById(R.id.menu);

		menuback.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				Intent intent = new Intent(Work106ResActivity.this,
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

				double p = Double.parseDouble(val2);
				double m = Double.parseDouble(val3);

				double k = p * p / (2 * m);

				resultTextView.setText("The Value is \n"
						+ decimalFormat.format(k) + "Joules");

			}
			if (val2.toLowerCase().equals("x")) {

				double k = Double.parseDouble(val1);
				double m = Double.parseDouble(val3);

				double p = Math.sqrt(k * 2 * m);

				resultTextView.setText("The Value is \n"
						+ decimalFormat.format(p) + "KilogramsMeter/Second");

			}
			if (val3.toLowerCase().equals("x")) {

				double k = Double.parseDouble(val1);
				double p = Double.parseDouble(val2);

				double m = (p * p) / (2 * k);

				resultTextView.setText("The Value is \n"
						+ decimalFormat.format(m) + "Kilograms");

			}

		} catch (Exception e) {
			resultTextView.setText("Please Put The Inputs Correctly !!!");
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.work106_res, menu);
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
