package com.example.myapplication

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.microsoft.appcenter.AppCenter
import com.microsoft.appcenter.analytics.Analytics
import com.microsoft.appcenter.crashes.Crashes
import java.io.IOException


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        AppCenter.start(
            application, "0e784c5e-d9b3-4f41-a5af-4250c2a8677f",
            Analytics::class.java, Crashes::class.java
        )
        Analytics.trackEvent("My custom event")
        AppCenter.setLogLevel(Log.VERBOSE)

//        throw IOException("Crash test")
    }
}