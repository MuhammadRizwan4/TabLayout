package com.example.muhammadrizwan.tablayout

import android.content.Context
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import com.example.muhammadrizwan.tablayout.Fragments.FragmentOne
import com.example.muhammadrizwan.tablayout.Fragments.FragmentThree
import com.example.muhammadrizwan.tablayout.Fragments.FragmentTwo

class Adapter(var ctx:Context,fm:FragmentManager ) : FragmentPagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {

        when (position)
        {
            0->
            {
                return FragmentOne()

            }
            1->
            {
                return FragmentTwo()
            }
            else->
            {
                return FragmentThree()
            }
        }

    }

    override fun getCount(): Int {
        return 3
    }

    override fun getPageTitle(position: Int): CharSequence {
        when (position)
        {
            0->
            {
                return "Fragment One"
            }

            1->
            {
                return "Fragmnet Two"
            }

            else->
            {
                return "Fragment Three"
            }
        }
    }

}