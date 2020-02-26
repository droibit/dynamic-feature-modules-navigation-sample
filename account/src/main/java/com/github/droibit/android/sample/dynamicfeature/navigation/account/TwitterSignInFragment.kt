package com.github.droibit.android.sample.dynamicfeature.navigation.account

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.github.droibit.android.sample.dynamicfeature.navigation.NavGraphAccountDirections.Companion.navGraphHome
import kotlinx.android.synthetic.main.fragment_twitter_sign_in.*

class TwitterSignInFragment : Fragment(R.layout.fragment_twitter_sign_in) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        signInButton.setOnClickListener {
            findNavController().navigate(navGraphHome())
        }
    }
}