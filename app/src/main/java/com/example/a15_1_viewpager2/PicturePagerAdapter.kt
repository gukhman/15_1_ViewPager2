package com.example.a15_1_viewpager2

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class PicturePagerAdapter(fragmentActivity: FragmentActivity, private val pictures: List<Picture>) :
    FragmentStateAdapter(fragmentActivity) {

    override fun getItemCount(): Int = pictures.size

    override fun createFragment(position: Int): Fragment {
        val fragment = PictureFragment()
        val args = Bundle()
        args.putSerializable("picture", pictures[position])
        fragment.arguments = args
        return fragment
    }
}