package com.github.droibit.android.sample.dynamicfeature.navigation.timeline

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_timeline.*

class TimelineFragment : Fragment(R.layout.fragment_timeline) {

    private val args: TimelineFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        text1.text = "Timeline: ${args.timelineType}"
    }
}