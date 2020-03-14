package com.github.droibit.android.sample.dynamicfeature.navigation.home

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.github.droibit.android.sample.dynamicfeature.navigation.NavGraphTimelineArgs
//import com.github.droibit.android.sample.dynamicfeature.navigation.NavGraphHomeDirections.Companion.navGraphTimeline
import kotlinx.android.synthetic.main.fragment_home.*
import com.github.droibit.android.sample.dynamicfeature.navigation.R as appR

class HomeFragment : Fragment(R.layout.fragment_home) {

    override fun onViewCreated(
        view: View,
        savedInstanceState: Bundle?
    ) {
        super.onViewCreated(view, savedInstanceState)

        timelineButton.setOnClickListener {
            val args = NavGraphTimelineArgs(timelineType = 0)
            findNavController().navigate(appR.id.nav_graph_timeline, args.toBundle())
        }
        myListsButton.setOnClickListener {
            val args = NavGraphTimelineArgs(timelineType = 1)
            findNavController().navigate(appR.id.nav_graph_timeline, args.toBundle())
        }
    }
}