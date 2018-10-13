package com.xi_zz.simplestdaggerexample

import android.app.Application

class MainApplication : Application() {
    val component: AppComponent by lazy {
        DaggerAppComponent
            .builder()
            .application(this)
            .build()
    }
}
