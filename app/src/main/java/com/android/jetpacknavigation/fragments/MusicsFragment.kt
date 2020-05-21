package com.android.jetpacknavigation.fragments

import com.android.jetpacknavigation.R

class MusicsFragment : BaseFragment() {

    override fun contentView(): Int {
        return R.layout.fragment_photos
    }

    override fun init() {

        val args : MusicsFragment? = arguments?.let{
            MusicsFragment.from
        }

        args?.let {
            var text_to_show = tv_fragment_two.text
            text_to_show = "$text_to_show \nname : ${it.name} \nid : ${it.id}"
            tv_fragment_two?.text = text_to_show
        }


    }

}