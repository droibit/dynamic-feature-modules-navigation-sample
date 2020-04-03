package com.github.droibit.android.sample.dynamicfeature.navigation.core

import android.app.Application
import com.github.droibit.android.sample.dynamicfeature.navigation.core.data.SampleRepository
import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
object CoreModule {

    @Provides
    @Named("packageName")
    fun providePackageName(application: Application): String {
        return application.packageName
    }

    interface Provider {

        val sampleRepository: SampleRepository
    }
}