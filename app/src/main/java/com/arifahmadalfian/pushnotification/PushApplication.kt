package com.arifahmadalfian.pushnotification

import android.app.Application
import com.onesignal.OneSignal

class PushApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        OneSignal.initWithContext(this)
        OneSignal.setAppId(ONESIGNAL_APP_ID)
    }

    companion object {
        const val ONESIGNAL_APP_ID = "00dfe927-032d-4a93-a676-6664bd517150"
    }
}