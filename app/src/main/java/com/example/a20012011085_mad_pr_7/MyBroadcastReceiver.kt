package com.example.a20012011085_mad_pr_7

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

class MyBroadcastReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?){
        val i = Intent(context,AlarmOnActivity::class.java)
        i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        context?.startActivity(i)
    }
}