package com.xi_zz.simplestdaggerexample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.myTextView
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject lateinit var textService: TextService

    override fun onCreate(savedInstanceState: Bundle?) {
        (application as MainApplication).component.inject(this)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myTextView.text = textService.repeat3Times(R.string.app_name)
    }
}
