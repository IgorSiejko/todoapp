package com.codegama.todolistapplication.broadcastReceiver;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

import com.codegama.todolistapplication.activity.AlarmActivity;

public class AlarmBroadcastReceiver extends BroadcastReceiver {

    String title, desc, date, time;
    @SuppressLint("UnsafeProtectedBroadcastReceiver")
    @Override
    public void onReceive(Context context, Intent intent) {

        title = intent.getStringExtra("TITLE");
        desc = intent.getStringExtra("DESC");
        date = intent.getStringExtra("DATE");
        time = intent.getStringExtra("TIME");
     Toast.makeText(context, "", Toast.LENGTH_SHORT).show();

        Intent i = new Intent(context, AlarmActivity.class);
        i.putExtra("TITLE", title);
        i.putExtra("DESC", desc);
        i.putExtra("DATE", date);
        i.putExtra("TIME", time);
        i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(i);
    }
}
