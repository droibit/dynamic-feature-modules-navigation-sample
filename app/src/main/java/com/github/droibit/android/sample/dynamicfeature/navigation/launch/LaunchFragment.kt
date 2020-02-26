package com.github.droibit.android.sample.dynamicfeature.navigation.launch

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.github.droibit.android.sample.dynamicfeature.navigation.launch.LaunchFragmentDirections.Companion.toHome
import com.github.droibit.android.sample.dynamicfeature.navigation.launch.LaunchFragmentDirections.Companion.toAccount

class LaunchFragment : Fragment() {

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

//        findNavController().navigate(toHome())
        findNavController().navigate(toAccount(needsSignIn = false))
    }
}