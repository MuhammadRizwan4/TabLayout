package com.example.muhammadrizwan.tablayout

import android.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.view.ViewPager
import android.widget.Adapter



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tabLayout = findViewById<TabLayout>(R.id.tab)
        val viewPager = findViewById<ViewPager>(R.id.View_Pager)
        tabLayout.setupWithViewPager(viewPager)
        val adapter = Adapter(this, supportFragmentManager)
        viewPager.adapter = adapter
    }
}
