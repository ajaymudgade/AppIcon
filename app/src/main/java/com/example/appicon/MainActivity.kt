package com.example.appicon

import android.content.ComponentName
import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        button1.setOnClickListener { changeIcon() }

        button2.setOnClickListener { changeOneIcon() }

        button_return.setOnClickListener { returnIcon() }


    }

    private fun changeOneIcon() {
        //        Disable old icon
        val packageManager = packageManager
        packageManager.setComponentEnabledSetting(
            ComponentName(this@MainActivity, "com.example.appicon.MainActivity"),
            PackageManager.COMPONENT_ENABLED_STATE_DISABLED, PackageManager.DONT_KILL_APP
        )

        packageManager.setComponentEnabledSetting(
            ComponentName(this@MainActivity, "com.example.appicon.MainActivityAlias"),
            PackageManager.COMPONENT_ENABLED_STATE_DISABLED, PackageManager.DONT_KILL_APP
        )

//        Enable new icon
        packageManager.setComponentEnabledSetting(
            ComponentName(this@MainActivity, "com.example.appicon.OneActivityAlias"),
            PackageManager.COMPONENT_ENABLED_STATE_ENABLED, PackageManager.DONT_KILL_APP
        )
    }

    private fun changeIcon() {
//        Disable old icon
        val packageManager = packageManager
        packageManager.setComponentEnabledSetting(
            ComponentName(this@MainActivity, "com.example.appicon.MainActivity"),
            PackageManager.COMPONENT_ENABLED_STATE_DISABLED, PackageManager.DONT_KILL_APP
        )

        packageManager.setComponentEnabledSetting(
            ComponentName(this@MainActivity, "com.example.appicon.OneActivityAlias"),
            PackageManager.COMPONENT_ENABLED_STATE_DISABLED, PackageManager.DONT_KILL_APP
        )

//        Enable new icon
        packageManager.setComponentEnabledSetting(
            ComponentName(this@MainActivity, "com.example.appicon.MainActivityAlias"),
            PackageManager.COMPONENT_ENABLED_STATE_ENABLED, PackageManager.DONT_KILL_APP
        )
    }


    private fun returnIcon() {

//                      Enable old icon
        val packageManager = packageManager
        packageManager.setComponentEnabledSetting(
            ComponentName(this@MainActivity, "com.example.appicon.MainActivity"),
            PackageManager.COMPONENT_ENABLED_STATE_ENABLED,
            PackageManager.DONT_KILL_APP
        )

//        Disable new icon
        packageManager.setComponentEnabledSetting(
            ComponentName(this@MainActivity, "com.example.appicon.MainActivityAlias"),
            PackageManager.COMPONENT_ENABLED_STATE_DISABLED, PackageManager.DONT_KILL_APP
        )
    }
}