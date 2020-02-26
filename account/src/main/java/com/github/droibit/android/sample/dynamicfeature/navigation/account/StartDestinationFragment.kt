package com.github.droibit.android.sample.dynamicfeature.navigation.account

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.github.droibit.android.sample.dynamicfeature.navigation.NavGraphAccountArgs
import com.github.droibit.android.sample.dynamicfeature.navigation.account.StartDestinationFragmentDirections.Companion.toAccountList
import com.github.droibit.android.sample.dynamicfeature.navigation.account.StartDestinationFragmentDirections.Companion.toSignIn

class StartDestinationFragment : Fragment() {

    private val args: NavGraphAccountArgs by navArgs()

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.d(BuildConfig.BUILD_TYPE, "args: $arguments")

        findNavController().navigate(
            if (args.needsSignIn) toSignIn() else toAccountList()
        )
    }
}