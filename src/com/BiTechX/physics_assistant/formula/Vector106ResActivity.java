package com.BiTechX.physics_assistant.formula;

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

public class Vector106ResActivity extends Activity {

	TextView resultTextView;
	DecimalFormat decimalFormat = new DecimalFormat("####.####");
	Button menuback;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.activity_vector106_res);

		resultTextView = (TextView) findViewById(R.id.result);

		// intent
		double i1 = Double.parseDouble(getIntent().getStringExtra("val 1"));
		double j1 = Double.parseDouble(getIntent().getStringExtra("val 2"));
		double k1 = Double.parseDouble(getIntent().getStringExtra("val 1"));
		double i2 = Double.parseDouble(getIntent().getStringExtra("val 2"));
		double j2 = Double.parseDouble(getIntent().getStringExtra("val 1"));
		double k2 = Double.parseDouble(getIntent().getStringExtra("val 2"));

		double i = i1 * i2;
		double j = j1 * j2;
		double k = k1 * k2;

		double f = i + j + k;

		
		if(f == 0){
		resultTextView.setText("The Result is \n" + f + "\n The Vectors are 90 Degree.");	
		}else{
		resultTextView.setText("The Result is \n" + f);
		}
		
        menuback = (Button) findViewById(R.id.menu);
		
		menuback.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				Intent intent= new Intent(Vector106ResActivity.this, MenuActivity.class);
				 startActivity(intent);
				
			}
		});

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.vector106_res, menu);
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
