package com.example.instaclone

import android.os.Bundle
import android.view.Menu
import android.view.Window
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.requestWindowFeature(Window.FEATURE_NO_TITLE)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbarHome)

        setupViewPager()
    }

    fun setupViewPager() {

        val viewPagerAdapter = ViewPagerAdapter(supportFragmentManager)
        viewPager.adapter = viewPagerAdapter
        bottomNav.setOnNavigationItemSelectedListener { item ->
            return@setOnNavigationItemSelectedListener when (item.itemId) {
                R.id.home -> {
                    viewPager.currentItem = 0
                    true
                }

                R.id.search -> {
                    viewPager.currentItem = 1
                    true
                }
                R.id.addPost -> {
                    viewPager.currentItem = 2
                    true
                }

                R.id.activity -> {
                    viewPager.currentItem = 3
                    true
                }

                R.id.profile -> {
                    viewPager.currentItem = 4
                    true
                }

                else -> {
                    false
                }
            }
        }
    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_home, menu)
        return true
    }
}