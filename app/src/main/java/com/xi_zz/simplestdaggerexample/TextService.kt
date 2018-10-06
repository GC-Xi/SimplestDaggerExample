package com.xi_zz.simplestdaggerexample

import android.app.Application
import android.support.annotation.StringRes
import javax.inject.Inject

class TextService @Inject constructor(private val application: Application) {
    fun repeat3Times(@StringRes strRes: Int): String =
        "${application.getString(strRes)} ${application.getString(strRes)} ${application.getString(strRes)}"
}