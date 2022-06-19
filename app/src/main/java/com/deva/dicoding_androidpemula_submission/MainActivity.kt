package com.deva.dicoding_androidpemula_submission

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var rvFood: RecyclerView
    private var list: ArrayList<Food> = arrayListOf()
    private var title: String = "Makanan Nusantara"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvFood = findViewById(R.id.rv_heroes)
        rvFood.setHasFixedSize(true)

        list.addAll(FoodData.listData)
        showRecyclerList()

        setActionBarTitle(title)
    }

    private fun showRecyclerList() {
        rvFood.layoutManager = LinearLayoutManager(this)
        val listFoodAdapter = ListFoodAdapter(list)
        rvFood.adapter = listFoodAdapter

        listFoodAdapter.setOnItemClickCallback(object : ListFoodAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Food) {
                val moveWithDataIntent = Intent(this@MainActivity, DetailActivity::class.java)
                moveWithDataIntent.putExtra(DetailActivity.EXTRA_NAME, data.name)
                moveWithDataIntent.putExtra(DetailActivity.EXTRA_ORIGIN, data.origin)
                moveWithDataIntent.putExtra(DetailActivity.EXTRA_TYPE, data.type)
                moveWithDataIntent.putExtra(DetailActivity.EXTRA_DETAIL, data.detail)
                moveWithDataIntent.putExtra(DetailActivity.EXTRA_PHOTO, data.photo)
                startActivity(moveWithDataIntent)
            }
        })
    }

    private fun setActionBarTitle(title: String) {
        supportActionBar?.title = title
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_about, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.action_about -> {
                val moveIntent = Intent(this@MainActivity, AboutActivity::class.java)
                startActivity(moveIntent)
            }
        }
    }
}