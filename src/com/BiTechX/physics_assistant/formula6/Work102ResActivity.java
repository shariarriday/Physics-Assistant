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

public class Work102ResActivity extends Activity {

	TextView resultTextView;
	DecimalFormat decimalFormat = new DecimalFormat("####.####");

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.activity_work102_res);

		Button menuback = (Button) findViewById(R.id.menu);

		menuback.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				Intent intent = new Intent(Work102ResActivity.this,
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

				double k = Double.parseDouble(val2);
				double xi = Double.parseDouble(val3);
				double xf = Double.parseDouble(val4);

				double w = 0.5 * k * xi * xi - (.5 * k * xf * xf);

				resultTextView.setText("The Value is \n"
						+ decimalFormat.format(w) + "Newtons");

			}
			if (val2.toLowerCase().equals("x")) {

				double w = Double.parseDouble(val1);
				double xi = Double.parseDouble(val3);
				double xf = Double.parseDouble(val4);

				double k = 2 * w / ((xi * xi) - (xf * xf));

				resultTextView.setText("The Value is \n"
						+ decimalFormat.format(k) + "Newtons/Meter");

			}
			if (val3.toLowerCase().equals("x")) {

				double w = Double.parseDouble(val1);
				double k = Double.parseDouble(val2);
				double xf = Double.parseDouble(val4);

				double xi = Math.sqrt((2 * (w + k * xf * xf * .5)) / k);

				resultTextView.setText("The Value is \n"
						+ decimalFormat.format(xi) + "Meters");

			}
			if (val4.toLowerCase().equals("x")) {

				double w = Double.parseDouble(val1);
				double k = Double.parseDouble(val2);
				double xi = Double.parseDouble(val3);

				double xf = Math.sqrt((2 * (w - k * xi * xi * .5)) / k);

				resultTextView.setText("The Value is \n"
						+ decimalFormat.format(xf) + "Meters");
			}
		} catch (Exception e) {
			resultTextView.setText("Please Put The Inputs Correctly !!!");
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.work102_res, menu);
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
