package com.example.isellgren.suncatcher;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import android.app.Activity;
import android.content.Context;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

public class Wifi extends AppCompatActivity {

    private Element [] nets;
    private WifiManager wifiManager;
    private List<ScanResult> wifiList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wifi);

        FloatingActionButton fab = findViewById(R.id.fab);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                detectWifi();
                Snackbar.make(view, "Scanning", Snackbar.LENGTH_SHORT)
                        .setAction("Action", null).show();
            }
        });

    }

    public void detectWifi(){
        this.wifiManager = (WifiManager)getApplicationContext().getSystemService(Context.WIFI_SERVICE);
        this.wifiManager.startScan();
        this.wifiList = this.wifiManager.getScanResults();

        Log.d("TAG", wifiList.toString());

        this.nets = new Element[wifiList.size()];

        for (int i = 0; i<wifiList.size(); i++){
            String item = wifiList.get(i).toString();
            String[] vector_item = item.split(",");
            String item_essid = vector_item[0];
            String item_capabilities = vector_item[2];
            String item_level = vector_item[3];
            String ssid = item_essid.split(": ")[1];
            String security = item_capabilities.split(": ")[1];
            String level = item_level.split(":")[1];
            nets[i] = new Element(ssid, security, level);
        }

        AdapterElements adapterElements = new AdapterElements(this);
        ListView netList = findViewById(R.id.listItem);
        netList.setAdapter(adapterElements);
    }


    class AdapterElements extends ArrayAdapter<Object> {
        Activity context;

        public AdapterElements(Activity context) {
            super(context, R.layout.items, nets);
            this.context = context;
        }

        public View getView(int position, View convertView, ViewGroup parent){
            LayoutInflater inflater = context.getLayoutInflater();
            View item = inflater.inflate(R.layout.items, null);

            TextView tvSsid = (TextView) item.findViewById(R.id.tvSSID);
            tvSsid.setText(nets[position].getTitle());

            TextView tvSecurity = (TextView)item.findViewById(R.id.tvSecurity);
            tvSecurity.setText(nets[position].getSecurity());

            TextView tvLevel = (TextView)item.findViewById(R.id.tvLevel);
            String level = nets[position].getLevel();

            try{
                int i = Integer.parseInt(level);
                if (i>-50){
                    tvLevel.setText("High");
                } else if (i<=-50 && i>-80){
                    tvLevel.setText("Average");
                } else if (i<=-80){
                    tvLevel.setText("Low");
                }
            } catch (NumberFormatException e){
                Log.d("TAG", "Неверный формат строки");
            }
            return item;
        }
    }
}
