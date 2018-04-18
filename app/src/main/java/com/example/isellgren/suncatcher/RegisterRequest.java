package com.example.isellgren.suncatcher;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;


/**
 * Created by iSellgren on 2018-02-06.
 */

public class RegisterRequest extends StringRequest {

    private static final String REGISTER_REQUEST_URL = "192.168.43.145";
    private static final String User = "K";
    private static final String PASS = "K";
    private Map<String, String> params;

    public RegisterRequest(String up, String down, Response.Listener<String> listener)
    {
        super(Method.POST,REGISTER_REQUEST_URL, listener, null);
        params = new HashMap<>();
        params.put("up",up);
        params.put("down",down);
    }
    @Override
    public Map<String, String> getParams()
    {
        return params;
    }
}
