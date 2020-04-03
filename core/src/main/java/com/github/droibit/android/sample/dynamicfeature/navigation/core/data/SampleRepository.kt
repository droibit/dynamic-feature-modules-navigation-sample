package com.github.droibit.android.sample.dynamicfeature.navigation.core.data

import javax.inject.Inject
import javax.inject.Named
import javax.inject.Singleton
import kotlin.coroutines.resume
import kotlin.coroutines.suspendCoroutine

@Singleton
class SampleRepository @Inject constructor(
    @Named("packageName") private val packageName: String
) {

    suspend fun sampleText(): String {
        return suspendCoroutine { cont ->
            cont.resume("Hello, world! on ${packageName})")
        }
    }
}