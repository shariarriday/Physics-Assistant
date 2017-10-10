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

public class Work110ResActivity extends Activity {

	TextView resultTextView;
	DecimalFormat decimalFormat = new DecimalFormat("####.####");

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.activity_work110_res);

		Button menuback = (Button) findViewById(R.id.menu);

		menuback.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				Intent intent = new Intent(Work110ResActivity.this,
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

				double ui = Double.parseDouble(val2);
				double kf = Double.parseDouble(val3);
				double uf = Double.parseDouble(val4);

				double ki = kf + uf - ui;

				resultTextView.setText("The Value is \n"
						+ decimalFormat.format(ki) + "Joules");

			}
			if (val2.toLowerCase().equals("x")) {

				double ki = Double.parseDouble(val1);
				double kf = Double.parseDouble(val3);
				double uf = Double.parseDouble(val4);

				double ui = kf + uf - ki;

				resultTextView.setText("The Value is \n"
						+ decimalFormat.format(ui) + "Joules");

			}
			if (val3.toLowerCase().equals("x")) {

				double ki = Double.parseDouble(val1);
				double ui = Double.parseDouble(val3);
				double uf = Double.parseDouble(val4);

				double kf = ki + ui - uf;

				resultTextView.setText("The Value is \n"
						+ decimalFormat.format(kf) + "Joules");

			}
			if (val4.toLowerCase().equals("x")) {

				double ki = Double.parseDouble(val1);
				double ui = Double.parseDouble(val2);
				double kf = Double.parseDouble(val3);

				double uf = ki + ui - kf;

				resultTextView.setText("The Value is \n"
						+ decimalFormat.format(uf) + "Joules");
			}
		} catch (Exception e) {
			resultTextView.setText("Please Put The Inputs Correctly !!!");
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.work110_res, menu);
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
