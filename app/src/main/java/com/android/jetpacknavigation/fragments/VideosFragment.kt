package com.android.jetpacknavigation.fragments

import com.android.jetpacknavigation.R
import kotlinx.android.synthetic.main.fragment_photos.*

class VideosFragment : BaseFragment() {

    override fun contentView() = R.layout.fragment_photos

    override fun init() {

        arguments?.getString("label")?.let {
            tvTitle.text = arguments?.getString("label")
        }

    }

}