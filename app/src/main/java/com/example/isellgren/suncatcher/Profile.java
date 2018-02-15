package com.example.isellgren.suncatcher;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

public class Profile extends AppCompatActivity {

    private ProgressBar mProgressBar;
    private TextView textView;

    private int mProgressStatus = 0;

    private Handler mHandler = new Handler();




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        mProgressBar = (ProgressBar) findViewById(R.id.profilebar);
        textView = (TextView) findViewById(R.id.text1);

        new Thread(new Runnable() {
            @Override
            public void run() {
                while(mProgressStatus < 100000)
                {
                    mProgressStatus++;
                    android.os.SystemClock.sleep(20000);
                    mHandler.post(new Runnable() {
                        @Override
                        public void run() {
                            mProgressBar.setProgress(mProgressStatus);
                            textView.setText(mProgressStatus+"KWh");
                        }
                    });
                }

            }
        }).start();

    }
}


