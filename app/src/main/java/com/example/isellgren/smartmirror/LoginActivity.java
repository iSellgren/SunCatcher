package com.example.isellgren.smartmirror;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        final EditText etUsername =(EditText) findViewById(R.id.etUsername);
        final EditText etPasssword =(EditText) findViewById(R.id.etPassword);
        final Button bLogin =(Button) findViewById(R.id.bLogin);
        final TextView registerLink =(TextView) findViewById(R.id.tvRegisterHere);

        registerLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerIntent = new Intent(LoginActivity.this, RegisterActivity.class);
                LoginActivity.this.startActivity(registerIntent);
            }
        });

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    public void onInfoClick(MenuItem item) {
        {
            if(item.getItemId() == R.id.mejl)
            {
                Intent j = new Intent(LoginActivity.this, Mail.class);
                startActivity(j);

            }
        }
    }

    public void onBlueClick(MenuItem item) {
        {
            if(item.getItemId() ==R.id.bluetand)
            {
                Intent k = new Intent(LoginActivity.this, Bluetand.class);
                startActivity(k);
            }
        }
    }
}
