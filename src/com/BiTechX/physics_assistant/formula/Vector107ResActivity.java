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

public class Vector107ResActivity extends Activity {

	TextView resultTextView;
	DecimalFormat decimalFormat = new DecimalFormat("####.####");
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.activity_vector107_res);
		
		resultTextView = (TextView) findViewById(R.id.result);

		// intent
		int i1 = Integer.parseInt(getIntent().getStringExtra("val 1"));
		int j1 = Integer.parseInt(getIntent().getStringExtra("val 2"));
		int k1 = Integer.parseInt(getIntent().getStringExtra("val 3"));
		int i2 = Integer.parseInt(getIntent().getStringExtra("val 4"));
		int j2 = Integer.parseInt(getIntent().getStringExtra("val 5"));
		int k2 = Integer.parseInt(getIntent().getStringExtra("val 6"));

		int i = (j1*k2-j2*k1);
		int j = (i1*k2-i2*k1);
		int k = (i1*j2-i2*j1);

		if(i>0 && j>0 && k>0){
		resultTextView.setText("The Result is \n" + i+"i+"+j+"j+"+k+"k");
		}
		if (i == 0) {
		resultTextView.setText("The Result is \n" + "0i+"+j+"j+"+k+"k");
		}
		if (j == 0) {
		resultTextView.setText("The Result is \n" + i+"i+"+"+0j+"+k+"k");
		}
		if (k == 0) {
		resultTextView.setText("The Result is \n" + i+"i+"+j+"j+"+"+0k");
		} else if(i+j+k == 0){
		resultTextView.setText("The Result is \n" + i+"i"+j+"j"+k+"k \n"+ "\n The Vectors are Parallal ");	
		}
		else{
		resultTextView.setText("The Result is \n" + "("+i+"i)+"+"("+j+"j)+"+"("+k+"k)");
		}
		
       
		Button menuback = (Button) findViewById(R.id.menu);
		
		menuback.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				Intent intent= new Intent(Vector107ResActivity.this, MenuActivity.class);
				 startActivity(intent);
				
			}
		});
	
}
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.vector107_res, menu);
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
