package com.example.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        String status = checkinternet.getNetworkInfo(context);
        if(status.equals("connected")) {
            Toast.makeText(context.getApplicationContext(), "connected", Toast.LENGTH_LONG).show();
        }
       else if(status.equals("disconnected")) {
            Toast.makeText(context.getApplicationContext(), " not connected", Toast.LENGTH_LONG).show();
        }
    }


    }

