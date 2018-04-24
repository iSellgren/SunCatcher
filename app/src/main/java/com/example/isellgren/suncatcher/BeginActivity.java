package com.example.isellgren.suncatcher;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

import static com.example.isellgren.suncatcher.R.layout.activity_begin;

public class BeginActivity extends AppCompatActivity {

    private DrawerLayout myDrawer;
    private ActionBarDrawerToggle myToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_begin);

        myDrawer = (DrawerLayout) findViewById(R.id.myDrawer);
        myToggle = new ActionBarDrawerToggle(this,myDrawer,R.string.open,R.string.close);

        myDrawer.addDrawerListener(myToggle);
        myToggle.syncState();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        if(myToggle.onOptionsItemSelected(item)){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void onInfoClick(MenuItem item) {
        {
            if (item.getItemId() == R.id.mejl) {
                Intent j = new Intent(BeginActivity.this, Mail.class);
                startActivity(j);

            }
        }
    }

    public void onBlueClick(MenuItem item) {
        {
            if (item.getItemId() == R.id.bluetand) {
                Intent k = new Intent(BeginActivity.this, Bluetand.class);
                startActivity(k);
            }
        }
    }

    public void onWifiClick(MenuItem item) {

        if (item.getItemId() == R.id.wifi) {
            Intent l = new Intent(BeginActivity.this, Wifi.class);
            startActivity(l);
        }
    }

    public void onLogregClick(MenuItem item) {

        if (item.getItemId() == R.id.logreg) {
            Intent m = new Intent(BeginActivity.this, LoginActivity.class);
            startActivity(m);
        }
    }

    public void onstatsClick(MenuItem item) {
        Intent n = new Intent(BeginActivity.this, Statistic.class);
        startActivity(n);
    }

    public void onprofileClick(MenuItem item) {
        Intent o = new Intent(BeginActivity.this, Profile.class);
        startActivity(o);
    }

    public void ondeviceClick(MenuItem item) {
        Intent p = new Intent(BeginActivity.this, DeviceActivity.class);
        startActivity(p);
    }


    public void onpsettingClick(MenuItem item) {
        Intent p = new Intent(BeginActivity.this, tester.class);
        startActivity(p);
    }

    public void Logosite(View view) {
        Intent i = new Intent();
        i.setAction(Intent.ACTION_VIEW);
        i.addCategory(Intent.CATEGORY_BROWSABLE);
        i.setData(Uri.parse("http://Google.com"));
        startActivity(i);
    }

}

