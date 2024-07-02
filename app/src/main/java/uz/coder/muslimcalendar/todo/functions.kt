@file:Suppress("DEPRECATION")

package uz.coder.muslimcalendar.todo

import android.content.Context
import android.net.ConnectivityManager

fun Context.isConnected():Boolean{
    val info =
        this.getConnectivityManager().activeNetworkInfo
    return info != null && info.isConnectedOrConnecting
}
fun Context.getConnectivityManager() = getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager