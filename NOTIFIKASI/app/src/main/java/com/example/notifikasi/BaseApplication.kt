package com.example.notifikasi

import android.annotation.SuppressLint
import android.app.Application
import android.app.NotificationChannel
import android.app.NotificationManager
import android.os.Build

class BaseApplication : Application() {

    companion object {
        const val CHANNEL_1_ID = "channel"
        const val CHANNEL_2_ID = "channel2"
    }


    override fun onCreate() {
        super.onCreate()
        createNotificationChannels()
    }

    @SuppressLint("NewApi")
    private fun createNotificationChannels() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.ECLAIR_0_1) {
            val channel1 = NotificationChannel(
                CHANNEL_1_ID,
                "Channel1",
                NotificationManager.IMPORTANCE_HIGH
            )
            channel1.description = "I LOVE RYUJIN"

            val channel2 = NotificationChannel(
                CHANNEL_2_ID,
                "Channel2",
                NotificationManager.IMPORTANCE_LOW
            )
            channel2.description = "I LOVE RYUJIN"

            val manager = getSystemService(NotificationManager::class.java)
            manager.createNotificationChannel(channel1)
            manager.createNotificationChannel(channel2)
        }
    }
}

