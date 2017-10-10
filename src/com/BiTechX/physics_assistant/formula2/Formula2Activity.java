package com.BiTechX.physics_assistant.formula2;

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

import com.BiTechX.physics_assistant.R;

public class Formula2Activity extends Activity {

	// Button Declaration;

	Button motion101;
	Button motion102;
	Button motion103;
	Button motion104;
	Button motion105;
	Button motion106;
	Button motion107;
	Button motion108;
	Button motion109;
	Button motion110;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.activity_formula2);

		motion101 = (Button) findViewById(R.id.motion101);
		motion102 = (Button) findViewById(R.id.motion102);
		motion103 = (Button) findViewById(R.id.motion103);
		motion104 = (Button) findViewById(R.id.motion104);
		motion105 = (Button) findViewById(R.id.motion105);
		motion106 = (Button) findViewById(R.id.motion106);
		motion107 = (Button) findViewById(R.id.motion107);
		motion108 = (Button) findViewById(R.id.motion108);
		motion109 = (Button) findViewById(R.id.motion109);
		motion110 = (Button) findViewById(R.id.motion110);

		motion101.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				Intent aintent = new Intent(Formula2Activity.this,
						Motion101Activity.class);
				startActivity(aintent);

			}
		});

		motion102.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				Intent aintent = new Intent(Formula2Activity.this,
						Motion102Activity.class);
				startActivity(aintent);

			}
		});

		motion103.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				Intent sintent = new Intent(Formula2Activity.this,
						Motion103Activity.class);
				startActivity(sintent);

			}
		});

		motion104.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				Intent sintent = new Intent(Formula2Activity.this,
						Motion104Activity.class);
				startActivity(sintent);

			}
		});

		motion105.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				Intent sintent = new Intent(Formula2Activity.this,
						Motion105Activity.class);
				startActivity(sintent);

			}
		});

		motion106.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				Intent sintent = new Intent(Formula2Activity.this,
						Motion106Activity.class);
				startActivity(sintent);

			}
		});

		motion107.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				Intent qintent = new Intent(Formula2Activity.this,
						Motion107Activity.class);
				startActivity(qintent);

			}
		});

		motion108.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				Intent qintent = new Intent(Formula2Activity.this,
						Motion108Activity.class);
				startActivity(qintent);

			}
		});

		motion109.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				Intent qintent = new Intent(Formula2Activity.this,
						Motion109Activity.class);
				startActivity(qintent);

			}
		});
	
		motion110.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				Intent qintent = new Intent(Formula2Activity.this,
						Motion110Activity.class);
				startActivity(qintent);

			}
		});
	
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.formula2, menu);
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
