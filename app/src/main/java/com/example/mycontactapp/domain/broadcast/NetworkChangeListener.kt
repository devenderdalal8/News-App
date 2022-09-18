package com.example.mycontactapp.domain.broadcast

interface NetworkChangeListener {
    fun onNetworkChange(isConnected: Boolean)
}