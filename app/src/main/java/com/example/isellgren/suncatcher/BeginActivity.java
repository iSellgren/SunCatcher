package com.example.isellgren.suncatcher;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;

import static com.example.isellgren.suncatcher.R.layout.activity_begin;

public class BeginActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(activity_begin);

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
        Intent p = new Intent(BeginActivity.this, DeviceActivity.class);
        startActivity(p);
    }

}

