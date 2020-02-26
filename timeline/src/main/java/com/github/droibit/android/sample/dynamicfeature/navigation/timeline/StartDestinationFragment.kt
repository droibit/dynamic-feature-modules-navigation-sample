package com.github.droibit.android.sample.dynamicfeature.navigation.timeline

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.github.droibit.android.sample.dynamicfeature.navigation.NavGraphTimelineArgs
import com.github.droibit.android.sample.dynamicfeature.navigation.timeline.StartDestinationFragmentDirections.Companion.toTimeline

class StartDestinationFragment : Fragment() {

    private val args: NavGraphTimelineArgs by navArgs()

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        val timelineType = requireNotNull(TimelineType.valueOf(args.timelineType))
        findNavController().navigate(toTimeline(timelineType))
    }
}