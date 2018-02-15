package com.example.isellgren.suncatcher;

import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

public class Statistic extends AppCompatActivity {

    private ProgressBar mProgressBar;
    private TextView mChargeingText;
    private TextView textView;

    private int mProgressStatus = 0;

    private Handler mHandler = new Handler();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statistic);

        mProgressBar = (ProgressBar) findViewById(R.id.progressbar);
        mChargeingText = (TextView) findViewById(R.id.fullcharge);
        textView = (TextView) findViewById(R.id.text1);

        new Thread(new Runnable() {
            @Override
            public void run() {
                while(mProgressStatus < 100)
                {
                    mProgressStatus++;
                    android.os.SystemClock.sleep(500);
                    mHandler.post(new Runnable() {
                        @Override
                        public void run() {
                            mProgressBar.setProgress(mProgressStatus);
                            textView.setText(mProgressStatus+"%");
                        }
                    });
                }
                mHandler.post(new Runnable() {
                    @Override
                    public void run() {
                        mChargeingText.setVisibility(View.VISIBLE);
                        textView.setVisibility(View.INVISIBLE);
                    }
                });
            }
        }).start();

    }
}