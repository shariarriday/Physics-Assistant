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
import com.BiTechX.physics_assistant.formula6.Work101ResActivity;

public class Gravity115ResActivity extends Activity {

	TextView resultTextView;
	DecimalFormat decimalFormat = new DecimalFormat("####.####");
	DecimalFormat longDecimalFormat=new DecimalFormat("####.############");
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.activity_gravity115_res);
		
		Button menuback = (Button) findViewById(R.id.menu);

		menuback.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				Intent intent = new Intent(Gravity115ResActivity.this,
						MenuActivity.class);
				startActivity(intent);

			}
		});
		
		try {
			
		resultTextView = (TextView) findViewById(R.id.result);

		String val1 = getIntent().getStringExtra("val1");
		String val2 = getIntent().getStringExtra("val2");
		String val3 = getIntent().getStringExtra("val3");
		
		

		final double G = 6.754 * Math.pow(10, -11);
		

		if (val1.toLowerCase().equals("x")) {

			double g = Double.parseDouble(val2);
			double R = Double.parseDouble(val3);
		

			double ve = (Math.sqrt(2*g*R));

			resultTextView.setText("The Value is \n" + longDecimalFormat.format(ve)
					+ "\n Meters/Seconds");

		}
		if (val2.toLowerCase().equals("x")) {

			double ve = Double.parseDouble(val1);
			double R = Double.parseDouble(val3);
		

			double g = (ve*ve)/(2*R);

			resultTextView.setText("The Value is \n" + decimalFormat.format(g)
					+ "\n Meters/Seconds^2");

		}
		if (val3.toLowerCase().equals("x")) {

			double ve = Double.parseDouble(val1);
			double g = Double.parseDouble(val2);
		

			double R = (ve*ve)/(2*g);

			resultTextView.setText("The Value is \n" + decimalFormat.format(R)
					+ "\n Meters");

		}
		
		} catch (Exception e) {
			resultTextView.setText("Please Put The Inputs Correctly!!!");
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.gravity115_res, menu);
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
