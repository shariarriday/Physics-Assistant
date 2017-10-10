package com.BiTechX.physics_assistant.formula;

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

import com.BiTechX.physics_assistant.R;

public class FormulaActivity extends Activity {

	// button Declaration----

	Button vector101;
	Button vector102;
	Button vector103;
	Button vector104;
	Button vector105;
	Button vector106;
	Button vector107;
	Button vector108;
	Button vector109;
	Button vector110;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.activity_formula);

		// button functions----

		vector101 = (Button) findViewById(R.id.vector101);
		vector102 = (Button) findViewById(R.id.vector102);
		vector103 = (Button) findViewById(R.id.vector103);
		vector104 = (Button) findViewById(R.id.vector104);
		vector105 = (Button) findViewById(R.id.vector105);
		vector106 = (Button) findViewById(R.id.vector106);
		vector107 = (Button) findViewById(R.id.vector107);
		vector108 = (Button) findViewById(R.id.vector108);
		vector109 = (Button) findViewById(R.id.vector109);
		vector110 = (Button) findViewById(R.id.vector110);

		// button onclicklisteners----

		vector101.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				Intent motionIntent = new Intent(FormulaActivity.this,
						Vector101Activity.class);
				startActivity(motionIntent);

			}
		});

		vector102.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				Intent motionIntent = new Intent(FormulaActivity.this,
						Vector102Activity.class);
				startActivity(motionIntent);

			}
		});

		vector103.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				Intent motionIntent = new Intent(FormulaActivity.this,
						Vector103Activity.class);
				startActivity(motionIntent);

			}
		});
		vector104.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				Intent motionIntent = new Intent(FormulaActivity.this,
						Vector104Activity.class);
				startActivity(motionIntent);

			}
		});
		vector105.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				Intent motionIntent = new Intent(FormulaActivity.this,
						Vector105Activity.class);
				startActivity(motionIntent);

			}
		});
		vector106.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				Intent motionIntent = new Intent(FormulaActivity.this,
						Vector106Activity.class);
				startActivity(motionIntent);

			}
		});
		vector107.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				Intent motionIntent = new Intent(FormulaActivity.this,
						Vector107Activity.class);
				startActivity(motionIntent);

			}
		});
		vector108.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				Intent motionIntent = new Intent(FormulaActivity.this,
						Vector108Activity.class);
				startActivity(motionIntent);

			}
		});
		vector109.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				Intent motionIntent = new Intent(FormulaActivity.this,
						Vector109Activity.class);
				startActivity(motionIntent);

			}
		});
		vector110.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				Intent motionIntent = new Intent(FormulaActivity.this,
						Vector110Activity.class);
				startActivity(motionIntent);

			}
		});

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.formula, menu);
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
