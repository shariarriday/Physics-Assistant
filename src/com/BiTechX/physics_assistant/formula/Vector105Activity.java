package com.BiTechX.physics_assistant.formula;

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

import com.BiTechX.physics_assistant.R;

public class Vector105Activity extends Activity {

	Button formulaButton;
    EditText val2;
    EditText val3;
    Button okButton;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.activity_vector105);
		
		formulaButton=(Button) findViewById(R.id.formula);
		val2=(EditText) findViewById(R.id.value2);
		val3=(EditText) findViewById(R.id.value3);
		okButton=(Button) findViewById(R.id.ok);
		
		okButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent=new Intent(Vector105Activity.this,Vector105ResActivity.class);
				
				String value2=val2.getText().toString();
				String value3=val3.getText().toString();
				
				intent.putExtra("val 2", value2);
				intent.putExtra("val 3", value3);
				
				startActivity(intent);
				
			}
		});
		

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.vector105, menu);
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
