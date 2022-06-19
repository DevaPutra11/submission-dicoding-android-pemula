package com.deva.dicoding_androidpemula_submission

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class AboutActivity : AppCompatActivity() {

    private var title: String = "About"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        setActionBarTitle(title)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
    }

    private fun setActionBarTitle(title: String) {
        supportActionBar?.title = title
    }
}