package com.xi_zz.simplestdaggerexample

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class Info @Inject constructor() {
    var text = "Hello"
}