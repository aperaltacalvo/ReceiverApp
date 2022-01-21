package com.example.receptoresapp

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import android.widget.Toast

class MyReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {

        val message = "Broadcast action detected " + intent.action
        Toast.makeText(context, message, Toast.LENGTH_LONG).show()
        if(intent.action.equals("android.intent.action.LANDED_PLANE")){
            Log.i("receiver_app", "Avion aterrizado")
        } else if(intent.action.equals(Intent.ACTION_BATTERY_LOW)){
            Log.i("receiver_app" , "La bateria se agota")
        }

    }
}