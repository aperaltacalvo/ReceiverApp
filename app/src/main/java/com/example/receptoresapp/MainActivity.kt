package com.example.receptoresapp

import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    private lateinit var receiver:MyReceiver
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        setupReceiver()
    }

    private fun setupReceiver() {
        //crear el intent filter
        val filter = IntentFilter()
        filter.addAction(Intent.ACTION_BATTERY_LOW)
        //filter.addAction("android.intent.action.LANDED_PLANE")

        receiver = MyReceiver()

        registerReceiver(receiver,filter)
    }

    fun broadcast(view: View){
        //crear un intent con una custom action
        val intent = Intent()
        intent.action = "android.intent.action.LANDED_PLANE"

        //lanzo el broadcast -> sendBroadcast(intent)

        sendBroadcast(intent)
    }
}