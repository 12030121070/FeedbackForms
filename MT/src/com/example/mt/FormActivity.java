package com.example.mt;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.CompoundButton.OnCheckedChangeListener;

public class FormActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_form);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		
		OnCheckedChangeListener ck = new OnCheckedChangeListener() {
			
		}
		
		
		
		
		getMenuInflater().inflate(R.menu.form, menu);
		return true;
	}

}
