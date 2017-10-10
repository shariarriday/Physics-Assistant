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

import com.BiTechX.physics_assistant.R;

public class Formula3Activity extends Activity {

	Button motion201;
	Button motion202;
	Button motion203;
	Button motion204;
	Button motion205;
	Button motion206;
	Button motion207;
	Button motion208;
	Button motion209;
	Button motion210;
	Button motion211;
	Button motion212;
	Button motion213;
	Button motion214;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.activity_formula3);

		motion201 = (Button) findViewById(R.id.motion201);
		motion202 = (Button) findViewById(R.id.motion202);
		motion204 = (Button) findViewById(R.id.motion204);
		motion203 = (Button) findViewById(R.id.motion203);
		motion205 = (Button) findViewById(R.id.motion205);
		motion206 = (Button) findViewById(R.id.motion206);
		motion207 = (Button) findViewById(R.id.motion207);
		motion208 = (Button) findViewById(R.id.motion208);
		motion209 = (Button) findViewById(R.id.motion209);
		motion210 = (Button) findViewById(R.id.motion210);
		motion211 = (Button) findViewById(R.id.motion211);
		motion212 = (Button) findViewById(R.id.motion212);
		motion213 = (Button) findViewById(R.id.motion213);
		motion214 = (Button) findViewById(R.id.motion214);

		motion201.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				Intent intent = new Intent(Formula3Activity.this,
						Motion201Activity.class);
				startActivity(intent);

			}
		});
		
		motion202.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				Intent intent = new Intent(Formula3Activity.this,
						Motion202Activity.class);
				startActivity(intent);

			}
		});
		
		motion203.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				Intent intent = new Intent(Formula3Activity.this,
						Motion203Activity.class);
				startActivity(intent);

			}
		});
		
		motion204.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				Intent intent = new Intent(Formula3Activity.this,
						Motion204Activity.class);
				startActivity(intent);

			}
		});
		
		motion205.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				Intent intent = new Intent(Formula3Activity.this,
						Motion205Activity.class);
				startActivity(intent);

			}
		});
		
		motion206.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				Intent intent = new Intent(Formula3Activity.this,
						Motion206Activity.class);
				startActivity(intent);

			}
		});
		
		motion207.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				Intent intent = new Intent(Formula3Activity.this,
						Motion207Activity.class);
				startActivity(intent);

			}
		});
		
		motion208.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				Intent intent = new Intent(Formula3Activity.this,
						Motion208Activity.class);
				startActivity(intent);

			}
		});
		
		motion209.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				Intent intent = new Intent(Formula3Activity.this,
						Motion209Activity.class);
				startActivity(intent);

			}
		});
		
		motion210.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				Intent intent = new Intent(Formula3Activity.this,
						Motion210Activity.class);
				startActivity(intent);

			}
		});
		
		motion211.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				Intent intent = new Intent(Formula3Activity.this,
						Motion211Activity.class);
				startActivity(intent);

			}
		});
		
		motion212.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				Intent intent = new Intent(Formula3Activity.this,
						Motion212Activity.class);
				startActivity(intent);

			}
		});
		
		motion213.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				Intent intent = new Intent(Formula3Activity.this,
						Motion213Activity.class);
				startActivity(intent);

			}
		});
		
		motion214.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				Intent intent = new Intent(Formula3Activity.this,
						Motion214Activity.class);
				startActivity(intent);

			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.formula3, menu);
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
