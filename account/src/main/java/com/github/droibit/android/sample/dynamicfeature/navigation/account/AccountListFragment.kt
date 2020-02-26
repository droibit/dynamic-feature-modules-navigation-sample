package com.github.droibit.android.sample.dynamicfeature.navigation.account

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.github.droibit.android.sample.dynamicfeature.navigation.account.AccountListFragmentDirections.Companion.toTwitterSignIn
import kotlinx.android.synthetic.main.fragment_account_list.*

class AccountListFragment : Fragment(R.layout.fragment_account_list) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        twitterSignInButton.setOnClickListener {
            findNavController().navigate(toTwitterSignIn())
        }
    }
}