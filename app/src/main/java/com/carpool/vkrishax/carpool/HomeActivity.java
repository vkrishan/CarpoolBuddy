package com.carpool.vkrishax.carpool;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class HomeActivity extends AppCompatActivity {

    Button createCarpool;
    Button findCarpool;
    Button testview;
    private android.support.v7.widget.Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        mToolbar= (android.support.v7.widget.Toolbar) findViewById(R.id.toolbar);
        createCarpool = (Button) findViewById(R.id.CreateCarpool);
        findCarpool = (Button) findViewById(R.id.FindCarpool);
        testview = (Button) findViewById(R.id.buttonTestView);

        // enabling support for action bar
        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        // Button listeners
        createCarpool.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1 = new Intent(HomeActivity.this, CreateCarpoolActivity.class);
                startActivity(int1);
            }
        });

        findCarpool.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int2 = new Intent(HomeActivity.this, CarpoolSearchActivity.class);
                startActivity(int2);
            }
        });

        testview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int3 = new Intent(HomeActivity.this, SampleView.class);
                startActivity(int3);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
