package com.example.learnerapp;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class BetweenActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_between);
		
		Intent i = getIntent();
		String name = i.getStringExtra("name");
		String job = i.getStringExtra("job");
		boolean b = i.getBooleanExtra("bool", false);
		int amount = i.getIntExtra("amount", 0);
		
		Toast.makeText(getApplicationContext(), "Name: "+name, Toast.LENGTH_SHORT).show();
		Toast.makeText(getApplicationContext(), "Job: "+job, Toast.LENGTH_SHORT).show();
		Toast.makeText(getApplicationContext(), "Boolean: "+b, Toast.LENGTH_SHORT).show();
		Toast.makeText(getApplicationContext(), "Amount: "+amount, Toast.LENGTH_SHORT).show();
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.between, menu);
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
