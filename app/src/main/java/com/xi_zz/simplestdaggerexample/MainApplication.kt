package com.xi_zz.simplestdaggerexample

import android.app.Application

class MainApplication : Application() {
    lateinit var component: AppComponent

    override fun onCreate() {
        super.onCreate()

        component = DaggerAppComponent
            .builder()
            .application(this)
            .build()
    }
}
