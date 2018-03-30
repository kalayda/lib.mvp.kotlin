package com.itgrx.lib.mvp.module.stacked

import io.reactivex.Completable

/**
 * Created by Алексей Калайда on 11.10.2017.
 */
interface NodeContainer {

    fun destroy()
    fun lr(left: NodeContainer?) : Completable
    fun rl(left: NodeContainer, readyToDetach: () -> Unit)
}
