package com.github.droibit.android.sample.dynamicfeature.navigation.timeline

enum class TimelineType(val id: Int) {
    HOME(id = 0),
    MY_LISTS(id = 1);

    companion object {
        fun valueOf(id: Int): TimelineType? = values().first { it.id == id }
    }
}