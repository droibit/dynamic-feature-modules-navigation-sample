package com.github.droibit.android.sample.dynamicfeature.navigation.account

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.NavOptions
import androidx.navigation.fragment.findNavController
//import com.github.droibit.android.sample.dynamicfeature.navigation.NavGraphAppDirections.Companion.toHome
import kotlinx.android.synthetic.main.fragment_twitter_sign_in.*
import com.github.droibit.android.sample.dynamicfeature.navigation.R as appR

class TwitterSignInFragment : Fragment(R.layout.fragment_twitter_sign_in) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        signInButton.setOnClickListener {
            val navOptions = NavOptions.Builder()
                .setPopUpTo(appR.id.nav_graph_app, false)
                .build()
            findNavController().navigate(appR.id.nav_graph_home, null, navOptions)

//            findNavController().navigate(toHome())
        }
    }
}