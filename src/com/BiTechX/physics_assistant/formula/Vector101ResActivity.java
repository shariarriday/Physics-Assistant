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

public class Vector101ResActivity extends Activity {

	TextView resultTextView;
	DecimalFormat decimalFormat=new DecimalFormat("####.####");
	Button menuback;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.activity_vector101_res);
		
		resultTextView=(TextView) findViewById(R.id.result);
		
		//intent
		double x=Double.parseDouble(getIntent().getStringExtra("val 1"));
		double y=Double.parseDouble(getIntent().getStringExtra("val 2"));
		double z=Double.parseDouble(getIntent().getStringExtra("val 3"));
		
		double rsq=(x*x)+(y*y)+(z*z);
		
		resultTextView.setText("The value of r is \n" + decimalFormat.format(Math.sqrt(rsq))+" unit");
		
		menuback = (Button) findViewById(R.id.menu);
		
		menuback.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				Intent intent= new Intent(Vector101ResActivity.this, MenuActivity.class);
				 startActivity(intent);
				
			}
		});
		
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.vector101_res, menu);
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
