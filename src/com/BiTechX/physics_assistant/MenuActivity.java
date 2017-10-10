package com.BiTechX.physics_assistant;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import com.BiTechX.physics_assistant.formula.FormulaActivity;
import com.BiTechX.physics_assistant.formula2.Formula2Activity;
import com.BiTechX.physics_assistant.formula3.Formula3Activity;
import com.BiTechX.physics_assistant.formula4.Formula4Activity;
import com.BiTechX.physics_assistant.formula5.Formula5Activity;
import com.BiTechX.physics_assistant.formula6.Formula6Activity;
import com.BiTechX.physics_assistant.formula7.Formula7Activity;
import com.BiTechX.physics_assistant.info.AboutUsActivity;
import com.BiTechX.physics_assistant.info.InstructionsActivity;

public class MenuActivity extends Activity {

	Button vectorButton;
	Button linMotionButton;
	Button radMotionButton;
	Button mechanicsButton;
	Button motion4Button;
	Button workButton;
	Button gravityButton;
	// Button vectorButton;
	// Button vectorButton;
	// Button vectorButton;
	Button aboutusButton;
	Button instructionsButton;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.activity_menu);

		// button declaration----

		vectorButton = (Button) findViewById(R.id.vector);
		linMotionButton = (Button) findViewById(R.id.linMotion);
		radMotionButton = (Button) findViewById(R.id.radMotion);
		mechanicsButton = (Button) findViewById(R.id.mechanics);
		motion4Button = (Button) findViewById(R.id.motion4but);
		aboutusButton = (Button) findViewById(R.id.Downbutton);
		workButton= (Button) findViewById(R.id.Button6);
		gravityButton= (Button) findViewById(R.id.Button7);
		instructionsButton= (Button) findViewById(R.id.Button8);
		// button functions----

		vectorButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent(MenuActivity.this,
						FormulaActivity.class);
				startActivity(intent);

			}
		});

		linMotionButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent(MenuActivity.this,
						Formula2Activity.class);
				startActivity(intent);

			}
		});
		radMotionButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent(MenuActivity.this,
						Formula3Activity.class);
				startActivity(intent);

			}
		});
		mechanicsButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent(MenuActivity.this,
						Formula4Activity.class);
				startActivity(intent);

			}
		});

		motion4Button.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent(MenuActivity.this,
						Formula5Activity.class);
				startActivity(intent);

			}
		});
		
		workButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(MenuActivity.this,
						Formula6Activity.class);
				startActivity(intent);
				
			}
		});
gravityButton.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Intent intent = new Intent(MenuActivity.this,
				Formula7Activity.class);
		startActivity(intent);
	}
});
instructionsButton.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Intent intent = new Intent(MenuActivity.this,InstructionsActivity.class);
		startActivity(intent);
	}
});

		aboutusButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent intent = new Intent(MenuActivity.this,
						AboutUsActivity.class);
				startActivity(intent);
			}
		});

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu, menu);
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

	/**
	 * A placeholder fragment containing a simple view.
	 */
	public static class PlaceholderFragment extends Fragment {

		public PlaceholderFragment() {
		}

	}

}
