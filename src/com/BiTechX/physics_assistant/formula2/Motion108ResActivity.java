package com.BiTechX.physics_assistant.formula2;

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

public class Motion108ResActivity extends Activity {

	DecimalFormat decimalFormat = new DecimalFormat("####.####");
	TextView resultTextView;

	@SuppressLint("DefaultLocale")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.activity_motion104_res);

		resultTextView = (TextView) findViewById(R.id.result);

		String val1 = getIntent().getStringExtra("val1");
		String val2 = getIntent().getStringExtra("val2");
		String val3 = getIntent().getStringExtra("val3");
		String val4 = getIntent().getStringExtra("val4");

		if (val1.toLowerCase().equals("x")) {

			double v = Double.parseDouble(val2);
			double vo = Double.parseDouble(val3);
			double t = Double.parseDouble(val4);

			double s = (((vo + v) / 2) * t);

			resultTextView.setText("The Value is" + decimalFormat.format(s)
					+ "Meters");

		}
		if (val2.toLowerCase().equals("x")) {

			double s = Double.parseDouble(val1);
			double vo = Double.parseDouble(val3);
			double t = Double.parseDouble(val4);

			double v = (2 * s - vo * t) / t;

			resultTextView.setText("The Value is" + decimalFormat.format(v)
					+ "Meters/Seconds");
		}
		if (val3.toLowerCase().equals("x")) {

			double s = Double.parseDouble(val1);
			double v = Double.parseDouble(val2);
			double t = Double.parseDouble(val4);

			double vo = (2 * s - v * t) / t;
			resultTextView.setText("The Value is" + decimalFormat.format(vo)
					+ "Meters/Seconds");
		}
		if (val4.toLowerCase().equals("x")) {

			double s = Double.parseDouble(val1);
			double v = Double.parseDouble(val2);
			double vo = Double.parseDouble(val3);

			double t = 2 * s / (vo + v);

			resultTextView.setText("The Value is" + decimalFormat.format(t)
					+ "Seconds");
		}
		
        Button menuback = (Button) findViewById(R.id.menu);
		
		menuback.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				Intent intent= new Intent(Motion108ResActivity.this, MenuActivity.class);
				 startActivity(intent);
				
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.motion108_res, menu);
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
