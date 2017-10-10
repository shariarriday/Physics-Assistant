package com.BiTechX.physics_assistant.formula3;

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
import android.widget.EditText;

import com.BiTechX.physics_assistant.R;

public class Motion201Activity extends Activity {

	Button formulaButton;
	EditText val1;
	EditText val2;
	EditText val3;
	EditText val4;
	Button okButton;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.activity_motion201);

		formulaButton = (Button) findViewById(R.id.formulamotion);
		okButton = (Button) findViewById(R.id.okbut);
		val1 = (EditText) findViewById(R.id.val1);
		val2 = (EditText) findViewById(R.id.val2);
		val3 = (EditText) findViewById(R.id.val3);
		

		

		okButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				Intent intent = new Intent(Motion201Activity.this,
						Motion201ResActivity.class);
				
				String value1=val1.getText().toString();
				String value2=val2.getText().toString();
				String value3=val3.getText().toString();
				
				
				intent.putExtra("val1", value1);
				intent.putExtra("val2", value2);
				intent.putExtra("val3", value3);
				
				
				startActivity(intent);

			}
		});

	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.motion201, menu);
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
