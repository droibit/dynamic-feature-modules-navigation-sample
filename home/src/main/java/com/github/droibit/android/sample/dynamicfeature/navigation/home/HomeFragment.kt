package com.github.droibit.android.sample.dynamicfeature.navigation.home

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.github.droibit.android.sample.dynamicfeature.navigation.NavGraphHomeDirections.Companion.navGraphTimeline
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment(R.layout.fragment_home) {

    override fun onViewCreated(
        view: View,
        savedInstanceState: Bundle?
    ) {
        super.onViewCreated(view, savedInstanceState)

        timelineButton.setOnClickListener {
            findNavController().navigate(navGraphTimeline(timelineType = 0))
        }
        myListsButton.setOnClickListener {
            findNavController().navigate(navGraphTimeline(timelineType = 1))
        }
    }
}