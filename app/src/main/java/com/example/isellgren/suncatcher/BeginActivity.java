package com.example.isellgren.suncatcher;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.google.android.gms.maps.model.Circle;

import static com.example.isellgren.suncatcher.R.layout.activity_begin;

public class BeginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_begin);

    }

    public void onInfoClick(MenuItem item) {
        {
            if(item.getItemId() == R.id.mejl)
            {
                Intent j = new Intent(BeginActivity.this, Mail.class);
                startActivity(j);

            }
        }
    }

    public void onBlueClick(MenuItem item) {
        {
            if(item.getItemId() == R.id.bluetand)
            {
                Intent k = new Intent(BeginActivity.this, Bluetand.class);
                startActivity(k);
            }
        }
    }
    public void onWifiClick(MenuItem item) {

        if(item.getItemId() == R.id.wifi)
        {
            Intent l = new Intent(BeginActivity.this, Wifi.class);
            startActivity(l);
        }
    }

    public void onLogregClick(MenuItem item) {

        if(item.getItemId() == R.id.logreg)
        {
            Intent m = new Intent(BeginActivity.this, LoginActivity.class);
            startActivity(m);
        }
    }

    public void onstatsClick(View view) {
        Intent n = new Intent(BeginActivity.this, Statistic.class);
        startActivity(n);
    }

    public void onprofileClick(View view) {
        Intent o = new Intent(BeginActivity.this, Profile.class);
        startActivity(o);
    }

    public void ondeviceClick(View view) {
        Intent p = new Intent(BeginActivity.this, DeviceActivity.class);
        startActivity(p);
    }
}

