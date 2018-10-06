package com.xi_zz.simplestdaggerexample

import android.app.Application
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton


@Singleton
@Component
interface AppComponent {
    fun inject(activity: MainActivity)

    // Involve Application so it is available for injection.
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }
}
