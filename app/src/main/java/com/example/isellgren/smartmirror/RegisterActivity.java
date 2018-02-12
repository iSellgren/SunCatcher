package com.example.isellgren.smartmirror;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.android.volley.Response;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        final EditText etAge =(EditText) findViewById(R.id.etAge);
        final EditText etName =(EditText) findViewById(R.id.etName);
        final EditText etUsername =(EditText) findViewById(R.id.etUsername);
        final EditText etPasssword =(EditText) findViewById(R.id.etPassword);
        final Button bRegister =(Button) findViewById(R.id.bRegister);

        bRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String name = etName.getText().toString();
                final String username = etUsername.getText().toString();
                final String password = etPasssword.getText().toString();
                final int age = Integer.parseInt(etAge.getText().toString());

                Response.Listener<String> responseListener = new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {

                    }
                };


                RegisterRequest registerRequest = new RegisterRequest(name, username, age, password, responseListener);
            }
        });
    }
}
