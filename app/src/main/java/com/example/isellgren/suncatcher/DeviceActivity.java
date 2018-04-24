package com.example.isellgren.suncatcher;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.Toast;

public class DeviceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_device);
    }
    public void didTapButton(View view) {
        Button button = (Button)findViewById(R.id.conbut);
        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);


        MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
        myAnim.setInterpolator(interpolator);

        button.startAnimation(myAnim);
        Intent q = new Intent(DeviceActivity.this, LoginActivity.class);
        startActivity(q);

    }

    public void Livroom(View view) {
        Toast.makeText(DeviceActivity.this,"Selected the device in livingroom ",Toast.LENGTH_LONG).show();
    }

    public void bedroom(View view) {
        Toast.makeText(DeviceActivity.this,"Selected the device in bedroom ",Toast.LENGTH_LONG).show();
    }

    public void kitchen(View view) {
        Toast.makeText(DeviceActivity.this,"Selected the device in kitchen ",Toast.LENGTH_LONG).show();
    }
}
