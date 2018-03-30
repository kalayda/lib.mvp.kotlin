package com.itgrx.lib.mvp.module

import io.reactivex.Single

/**
 * Created by Алексей Калайда on 10.10.2017.
 */

interface Module {

    fun attach(moduleContext : ModuleContext): Any?
    fun detach()
    fun dispose(onReadyToDestroy: () -> Unit)

}
