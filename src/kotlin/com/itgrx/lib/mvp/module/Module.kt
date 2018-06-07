package com.itgrx.lib.mvp.module

import io.reactivex.Maybe

/**
 * Created by Алексей Калайда on 10.10.2017.
 */

interface Module {

    fun attach(moduleContext : ModuleContext): Maybe<Any>
    fun detach()
    fun dispose(onReadyToDestroy: () -> Unit)

}
