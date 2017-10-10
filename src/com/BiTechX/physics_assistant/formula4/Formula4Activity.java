package com.BiTechX.physics_assistant.formula4;

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

public class Formula4Activity extends Activity {
	
	Button motion301;
	Button motion302;
	Button motion303;
	Button motion304;
	Button motion305;
	Button motion306;
	Button motion307;
	Button motion308;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.activity_formula4);
		
		motion301 = (Button) findViewById(R.id.motion301);
		motion302 = (Button) findViewById(R.id.motion302);
		motion304 = (Button) findViewById(R.id.motion304);
		motion303 = (Button) findViewById(R.id.motion303);
		motion305 = (Button) findViewById(R.id.motion305);
		motion306 = (Button) findViewById(R.id.motion306);
		motion307 = (Button) findViewById(R.id.motion307);
		motion308 = (Button) findViewById(R.id.motion308);
	
		motion301.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				Intent intent = new Intent(Formula4Activity.this,
						Motion301Activity.class);
				startActivity(intent);

			}
		});
	
		motion302.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				Intent intent = new Intent(Formula4Activity.this,
						Motion302Activity.class);
				startActivity(intent);

			}
		});
		
		motion303.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				Intent intent = new Intent(Formula4Activity.this,
						Motion303Activity.class);
				startActivity(intent);

			}
		});
		
		motion304.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				Intent intent = new Intent(Formula4Activity.this,
						Motion304Activity.class);
				startActivity(intent);

			}
		});
	
		motion305.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				Intent intent = new Intent(Formula4Activity.this,
						Motion305Activity.class);
				startActivity(intent);

			}
		});
		
		motion306.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				Intent intent = new Intent(Formula4Activity.this,
						Motion306Activity.class);
				startActivity(intent);

			}
		});
		
		motion307.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				Intent intent = new Intent(Formula4Activity.this,
						Motion307Activity.class);
				startActivity(intent);

			}
		});
		
		motion308.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				Intent intent = new Intent(Formula4Activity.this,
						Motion308Activity.class);
				startActivity(intent);

			}
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.formula4, menu);
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
