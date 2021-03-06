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

public class Vector110Activity extends Activity {

	Button formulaButton;
	EditText val1;
	EditText val2;
	EditText val3;

	Button okButton;
	Button okButton2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.activity_vector110);

		formulaButton = (Button) findViewById(R.id.formula);
		val1 = (EditText) findViewById(R.id.value1);
		val2 = (EditText) findViewById(R.id.value2);
		val3 = (EditText) findViewById(R.id.value3);

		okButton = (Button) findViewById(R.id.ok);
		okButton2 = (Button) findViewById(R.id.ok2);

		okButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent intent = new Intent(Vector110Activity.this,
						Vector110ResActivity.class);

				String value1 = val1.getText().toString();
				String value2 = val2.getText().toString();
				String value3 = val3.getText().toString();

				intent.putExtra("val 1", value1);
				intent.putExtra("val 2", value2);
				intent.putExtra("val 3", value3);

				startActivity(intent);

			}
		});

		okButton2.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent intent = new Intent(Vector110Activity.this,
						Vector110Res2Activity.class);

				String value1 = val1.getText().toString();
				String value2 = val2.getText().toString();
				String value3 = val3.getText().toString();

				intent.putExtra("val 1", value1);
				intent.putExtra("val 2", value2);
				intent.putExtra("val 3", value3);

				startActivity(intent);

			}
		});

	
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.vector110, menu);
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
