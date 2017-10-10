package com.BiTechX.physics_assistant.formula7;

import com.BiTechX.physics_assistant.R;
import com.BiTechX.physics_assistant.R.id;
import com.BiTechX.physics_assistant.R.layout;
import com.BiTechX.physics_assistant.R.menu;
import com.BiTechX.physics_assistant.formula6.Formula6Activity;
import com.BiTechX.physics_assistant.formula6.Work101Activity;

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

public class Formula7Activity extends Activity {

	Button gravity101;
	Button gravity102;
	Button gravity103;
	Button gravity104;
	Button gravity105;
	Button gravity106;
	Button gravity107;
	Button gravity108;
	Button gravity109;
	Button gravity110;
	Button gravity111;
	Button gravity112;
	Button gravity113;
	Button gravity114;
	Button gravity115;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.activity_formula7);

		gravity101 = (Button) findViewById(R.id.gravity101);
		gravity102 = (Button) findViewById(R.id.gravity102);
		gravity103 = (Button) findViewById(R.id.gravity103);
		gravity104 = (Button) findViewById(R.id.gravity104);
		gravity105 = (Button) findViewById(R.id.gravity105);
		gravity106 = (Button) findViewById(R.id.gravity106);
		gravity107 = (Button) findViewById(R.id.gravity107);
		gravity108 = (Button) findViewById(R.id.gravity108);
		gravity109 = (Button) findViewById(R.id.gravity109);
		gravity110 = (Button) findViewById(R.id.gravity110);
		gravity111 = (Button) findViewById(R.id.gravity111);
		gravity112 = (Button) findViewById(R.id.gravity112);
		gravity113 = (Button) findViewById(R.id.gravity113);
		gravity114 = (Button) findViewById(R.id.gravity114);
		gravity115 = (Button) findViewById(R.id.gravity115);
		
		gravity101.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
			
				Intent intent=new Intent(Formula7Activity.this, Gravity101Activity.class);
				startActivity(intent);
			}
		});

		gravity102.setOnClickListener(new OnClickListener() {

		@Override
	public void onClick(View v) {
				Intent intent = new Intent(Formula7Activity.this,
					Gravity102Activity.class);
				startActivity(intent);
			}
		});
		gravity103.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent intent = new Intent(Formula7Activity.this,
						Gravity103Activity.class);
				startActivity(intent);
			}
		});
		gravity104.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent intent = new Intent(Formula7Activity.this,
						Gravity104Activity.class);
				startActivity(intent);
			}
		});
		gravity105.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent intent = new Intent(Formula7Activity.this,
						Gravity105Activity.class);
				startActivity(intent);
			}
		});
		gravity106.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent intent = new Intent(Formula7Activity.this,
						Gravity106Activity.class);
				startActivity(intent);
			}
		});
		gravity107.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent intent = new Intent(Formula7Activity.this,
						Gravity107Activity.class);
				startActivity(intent);
				}
		});
		gravity108.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent intent = new Intent(Formula7Activity.this,
						Gravity108Activity.class);
				startActivity(intent);
		}
		});
		gravity109.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent intent = new Intent(Formula7Activity.this,
						Gravity109Activity.class);
				startActivity(intent);
			}
		});
		gravity110.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent intent = new Intent(Formula7Activity.this,
						Gravity110Activity.class);
				startActivity(intent);
			}
		});
		gravity111.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent intent = new Intent(Formula7Activity.this,
						Gravity111Activity.class);
				startActivity(intent);
			}
		});
		gravity112.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent intent = new Intent(Formula7Activity.this,
						Gravity112Activity.class);
				startActivity(intent);
		}
		});
		gravity113.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent intent = new Intent(Formula7Activity.this,
						Gravity113Activity.class);
				startActivity(intent);
			}
		});
		gravity114.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent intent = new Intent(Formula7Activity.this,
						Gravity114Activity.class);
				startActivity(intent);
			}
		});
		gravity115.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent intent = new Intent(Formula7Activity.this,
						Gravity115Activity.class);
				startActivity(intent);
			}
		});

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.formula7, menu);
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
