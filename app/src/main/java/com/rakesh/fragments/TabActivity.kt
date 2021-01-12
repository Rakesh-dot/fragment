package com.rakesh.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.rakesh.fragments.adapter.ViewPagerAdapter
import com.rakesh.fragments.fragments.AreaFragment
import com.rakesh.fragments.fragments.SumFragment

class TabActivity : AppCompatActivity() {
    private lateinit var lstFragments: ArrayList<Fragment>
    private lateinit var lstTitle: ArrayList<String>
    private lateinit var tabLayout: TabLayout
    private lateinit var viewPager: ViewPager2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tab_layout)

        viewPager=findViewById(R.id.viewPager)
        tabLayout=findViewById(R.id.tabLayout)

        populateList()
        val adapter=ViewPagerAdapter(lstFragments,supportFragmentManager,lifecycle)
        viewPager.adapter=adapter
        TabLayoutMediator(tabLayout,viewPager){tab,position ->
            tab.text=lstTitle[position]
        }.attach()
    }

    private fun populateList() {
        lstTitle=ArrayList<String>()
        lstTitle.add("SUM")
        lstTitle.add("AREA")
        lstFragments= ArrayList<Fragment>()
        lstFragments.add(SumFragment())
        lstFragments.add(AreaFragment())

    }
}