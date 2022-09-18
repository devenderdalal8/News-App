package com.example.mycontactapp.domain.broadcast

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.net.ConnectivityManager
import com.example.mycontactapp.domain.broadcast.NetworkChangeListener

class NetworkReceiver(
    private val networkChangeListener: NetworkChangeListener
) : BroadcastReceiver() {

    override fun onReceive(context: Context?, intent: Intent?) {
        val connectivityManager = context?.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val networkInfo = connectivityManager.activeNetworkInfo
        var isConnected = networkInfo?.isConnectedOrConnecting
        networkChangeListener.onNetworkChange(isConnected?:false)
    }
}