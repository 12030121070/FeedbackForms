package com.example.mt;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class ExitActivity extends Activity {

	private TextView view1;
	private Button btnClick;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_exit);
		
		String uName = getIntent().getStringExtra("username");
		//To retrieve String
		
		//to retrieve bundle and values inside the bundle
		int codes = getIntent().getExtras().getInt("code");
		
		view1=(TextView) findViewById(R.id.textView1);
		view1.setText(uName);
		
		btnClick = (Button) findViewById(R.id.button1);
        OnClickListener listener = new OnClickListener()
        {
        	@Override
        	public void onClick(View arg0)
        	{
        		finish();
        	}
        };
        btnClick.setOnClickListener(listener);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.exit, menu);
		return true;
	}

}
