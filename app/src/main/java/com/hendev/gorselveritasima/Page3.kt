package com.hendev.gorselveritasima

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_page3.*

class Page3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page3)

        val gelenMsj = intent.getStringExtra("girdi")

        txtview1.text = gelenMsj
    }
}