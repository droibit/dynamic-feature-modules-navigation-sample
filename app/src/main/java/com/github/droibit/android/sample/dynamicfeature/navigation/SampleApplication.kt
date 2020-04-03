package com.github.droibit.android.sample.dynamicfeature.navigation

import android.app.Application
import android.content.Context
import com.github.droibit.android.sample.dynamicfeature.navigation.core.CoreComponent
import com.github.droibit.android.sample.dynamicfeature.navigation.core.DaggerCoreComponent
import kotlin.LazyThreadSafetyMode.NONE

class SampleApplication : Application() {

    private val coreComponent: CoreComponent by lazy(NONE) {
        DaggerCoreComponent.factory()
            .create(this)
    }

    override fun onCreate() {
        super.onCreate()
    }

    companion object {
        fun coreComponent(context: Context) =
            (context.applicationContext as SampleApplication).coreComponent
    }
}

fun Context.coreComponent() = SampleApplication.coreComponent(this)