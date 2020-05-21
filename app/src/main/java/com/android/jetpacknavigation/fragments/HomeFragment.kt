package com.android.jetpacknavigation.fragments

import androidx.core.os.bundleOf
import androidx.navigation.Navigation
import com.android.jetpacknavigation.R
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : BaseFragment() {

    override fun contentView() = R.layout.fragment_home

    override fun init() {

        tvPhotos?.setOnClickListener {
            val bundle = bundleOf("label" to getString(R.string.photos))
            Navigation.findNavController(requireView()).navigate(R.id.photosFragment, bundle)
        }

        tvVideos.setOnClickListener {
            val bundle = bundleOf("label" to getString(R.string.videos))
            Navigation.findNavController(requireView()).navigate(R.id.videosFragment, bundle)
        }

        tvMusics.setOnClickListener {
            val bundle = bundleOf("label" to getString(R.string.musics))
            Navigation.findNavController(requireView()).navigate(R.id.musicsFragment, bundle)
        }

    }

}