package com.BiTechX.physics_assistant.formula5;

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

public class Formula5Activity extends Activity {
	
	Button motion401;
	Button motion402;
	Button motion403;
	Button motion404;
	Button motion405;
	Button motion406;
	Button motion407;
	Button motion408;
	Button motion409;
	Button motion410;
	Button motion411;
	Button motion412;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.activity_formula5);
		
		motion401 = (Button) findViewById(R.id.motion401);
		motion402 = (Button) findViewById(R.id.motion402);
		motion404 = (Button) findViewById(R.id.motion404);
		motion403 = (Button) findViewById(R.id.motion403);
		motion405 = (Button) findViewById(R.id.motion405);
		motion406 = (Button) findViewById(R.id.motion406);
		motion407 = (Button) findViewById(R.id.motion407);
		motion408 = (Button) findViewById(R.id.motion408);
		motion409 = (Button) findViewById(R.id.motion409);
		motion410 = (Button) findViewById(R.id.motion410);
		motion411 = (Button) findViewById(R.id.motion411);
		motion412 = (Button) findViewById(R.id.motion412);
		
		motion401.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				Intent intent = new Intent(Formula5Activity.this,
						Motion401Activity.class);
				startActivity(intent);

			}
		});
		
		motion402.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				Intent intent = new Intent(Formula5Activity.this,
						Motion402Activity.class);
				startActivity(intent);

			}
		});
		
		motion403.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				Intent intent = new Intent(Formula5Activity.this,
						Motion403Activity.class);
				startActivity(intent);

			}
		});
		
		motion404.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				Intent intent = new Intent(Formula5Activity.this,
						Motion404Activity.class);
				startActivity(intent);

			}
		});
		
		motion405.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				Intent intent = new Intent(Formula5Activity.this,
						Motion405Activity.class);
				startActivity(intent);

			}
		});
		
		motion406.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				Intent intent = new Intent(Formula5Activity.this,
						Motion406Activity.class);
				startActivity(intent);

			}
		});
		
		motion407.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				Intent intent = new Intent(Formula5Activity.this,
						Motion407Activity.class);
				startActivity(intent);

			}
		});
		
		motion408.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				Intent intent = new Intent(Formula5Activity.this,
						Motion408Activity.class);
				startActivity(intent);

			}
		});
		
		motion409.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				Intent intent = new Intent(Formula5Activity.this,
						Motion409Activity.class);
				startActivity(intent);

			}
		});
		
		motion410.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				Intent intent = new Intent(Formula5Activity.this,
						Motion410Activity.class);
				startActivity(intent);

			}
		});
		
		motion411.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				Intent intent = new Intent(Formula5Activity.this,
						Motion411Activity.class);
				startActivity(intent);

			}
		});
		
		motion412.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				Intent intent = new Intent(Formula5Activity.this,
						Motion412Activity.class);
				startActivity(intent);

			}
		});
		
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.formula5, menu);
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
