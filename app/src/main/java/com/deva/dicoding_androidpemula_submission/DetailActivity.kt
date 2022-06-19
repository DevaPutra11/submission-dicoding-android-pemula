package com.deva.dicoding_androidpemula_submission

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailActivity : AppCompatActivity() {

    private lateinit var title: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val tvNameReceived:TextView = findViewById(R.id.tv_food_name)
        val tvOriginReceived:TextView = findViewById(R.id.tv_food_origin)
        val tvTypeReceived:TextView = findViewById(R.id.tv_food_type)
        val tvDetailReceived:TextView = findViewById(R.id.tv_food_detail)
        val imgPhoto:ImageView = findViewById(R.id.img_food_photo)

        val name = intent.getStringExtra(EXTRA_NAME)
        val origin = intent.getStringExtra(EXTRA_ORIGIN)
        val type = intent.getStringExtra(EXTRA_TYPE)
        val detail = intent.getStringExtra(EXTRA_DETAIL)
        val photo = intent.getIntExtra(EXTRA_PHOTO, 0)

        tvNameReceived.text = name
        tvOriginReceived.text = origin
        tvTypeReceived.text = type
        tvDetailReceived.text = detail
        imgPhoto.setImageResource(photo)

        title = name.toString()
        setActionBarTitle(title)

        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
    }

    private fun setActionBarTitle(title: String) {
        supportActionBar?.title = title
    }

    companion object {
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_ORIGIN = "extra_origin"
        const val EXTRA_TYPE = "extra_type"
        const val EXTRA_DETAIL = "extra_detail"
        const val EXTRA_PHOTO = "extra_photo"
    }
}