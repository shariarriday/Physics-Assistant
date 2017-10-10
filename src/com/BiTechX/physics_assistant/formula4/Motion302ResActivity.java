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

public class Motion302ResActivity extends Activity {
	DecimalFormat decimalFormat = new DecimalFormat("####.####");
	TextView resultTextView;

	@SuppressLint("DefaultLocale")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.activity_motion302_res);

		Button menuback = (Button) findViewById(R.id.menu);

		menuback.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				Intent intent = new Intent(Motion302ResActivity.this,
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
				double a = Double.parseDouble(val3);

				double F = m * a;

				resultTextView.setText("The Value is \n" + decimalFormat.format(F)
						+ "\n Newton");

			}
			if (val2.toLowerCase().equals("x")) {

				double F = Double.parseDouble(val1);
				double a = Double.parseDouble(val3);

				double m = F / a;

				resultTextView.setText("The Value is" + decimalFormat.format(m)
						+ "\n Kilograms");
			}
			if (val3.toLowerCase().equals("x")) {

				double F = Double.parseDouble(val1);
				double m = Double.parseDouble(val2);

				double a = F / m;
				resultTextView.setText("The Value is \n" + decimalFormat.format(a)
						+ "\n Meters/Seconds");
			}

		} catch (Exception e) {
			resultTextView.setText("Please Put The Inputs Correctly !!!");
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.motion302_res, menu);
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
