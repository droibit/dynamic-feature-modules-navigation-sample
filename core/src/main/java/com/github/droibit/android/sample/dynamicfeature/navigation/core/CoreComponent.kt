package com.github.droibit.android.sample.dynamicfeature.navigation.core

import android.app.Application
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [CoreModule::class]
)
interface CoreComponent : CoreModule.Provider {

    @Component.Factory
    interface Factory {

        fun create(@BindsInstance application: Application): CoreComponent
    }
}