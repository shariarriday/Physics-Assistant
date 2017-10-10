package com.BiTechX.physics_assistant.formula6;

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

public class Formula6Activity extends Activity {
	
	Button work101;
	Button work102;
	Button work103;
	Button work104;
	Button work105;
	Button work106;
	Button work107;
	Button work108;
	Button work109;
	Button work110;
	Button work111;
	Button work112;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.activity_formula6);
	
		work101 = (Button) findViewById(R.id.work101);
		work102 = (Button) findViewById(R.id.work102);
		work103 = (Button) findViewById(R.id.work103);
		work104 = (Button) findViewById(R.id.work104);
		work105 = (Button) findViewById(R.id.work105);
		work106 = (Button) findViewById(R.id.work106);
		work107 = (Button) findViewById(R.id.work107);
		work108 = (Button) findViewById(R.id.work108);
		work109 = (Button) findViewById(R.id.work109);
		work110 = (Button) findViewById(R.id.work110);
		work111 = (Button) findViewById(R.id.work111);
		work112 = (Button) findViewById(R.id.work112);
		
		work101.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				Intent intent = new Intent(Formula6Activity.this,
						Work101Activity.class);
				startActivity(intent);

			}
		});
		
		work102.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				Intent intent = new Intent(Formula6Activity.this,
						Work102Activity.class);
				startActivity(intent);

			}
		});
		
		work103.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				Intent intent = new Intent(Formula6Activity.this,
						Work103Activity.class);
				startActivity(intent);

			}
		});
		
		work104.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				Intent intent = new Intent(Formula6Activity.this,
						Work104Activity.class);
				startActivity(intent);

			}
		});
		
		work105.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				Intent intent = new Intent(Formula6Activity.this,
						Work105Activity.class);
				startActivity(intent);

			}
		});
		
		work106.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				Intent intent = new Intent(Formula6Activity.this,
						Work106Activity.class);
				startActivity(intent);

			}
		});
		
		work107.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				Intent intent = new Intent(Formula6Activity.this,
						Work107Activity.class);
				startActivity(intent);

			}
		});
		
		work108.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				Intent intent = new Intent(Formula6Activity.this,
						Work108Activity.class);
				startActivity(intent);

			}
		});
		
		work109.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				Intent intent = new Intent(Formula6Activity.this,
						Work109Activity.class);
				startActivity(intent);

			}
		});
		
		work110.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				Intent intent = new Intent(Formula6Activity.this,
						Work110Activity.class);
				startActivity(intent);

			}
		});
		
		work111.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				Intent intent = new Intent(Formula6Activity.this,
						Work111Activity.class);
				startActivity(intent);

			}
		});
	
		work112.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				Intent intent = new Intent(Formula6Activity.this,
						Work112Activity.class);
				startActivity(intent);

			}
		});
		
	
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.formula6, menu);
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
