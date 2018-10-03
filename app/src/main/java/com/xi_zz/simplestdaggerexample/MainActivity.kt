package com.xi_zz.simplestdaggerexample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.myTextView1
import kotlinx.android.synthetic.main.activity_main.myTextView2
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject lateinit var info1: Info
    @Inject lateinit var info2: Info

    override fun onCreate(savedInstanceState: Bundle?) {
        component.inject(this)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        info1.text = "Hello One"
        info2.text = "Hello Two"
        myTextView1.text = info1.text
        myTextView2.text = info2.text
        // Both myTextView1 and myTextView2 will display "Hello Two"
    }
}
