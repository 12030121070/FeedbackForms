package com.example.mt;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

	
	private Button btnClick;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        
        
        btnClick = (Button) findViewById(R.id.btnClick);
        OnClickListener listener = new OnClickListener()
        {
        	@Override
        	public void onClick(View arg0)
        	{
        		Intent intent = new Intent(getApplicationContext(),ExitActivity.class);
        	    
        		intent.putExtra("username","SICSR");
        			//OR
        		Bundle bundle = new Bundle();
        		bundle.putInt("code",601);
        		intent.putExtra("bundlename",bundle);
        		
        		
        		startActivity(intent);
        	}
        };
        
        btnClick.setOnClickListener(listener);
        
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
