package com.inception.betappdistributor1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class Markets extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_markets);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        getSupportActionBar().setHomeButtonEnabled(true);

        getSupportActionBar().setTitle("Markets");
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(item.getItemId() == android.R.id.home)
        {
            finish();
        }

        return true;
    }
}
