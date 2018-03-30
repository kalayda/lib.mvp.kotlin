package com.itgrx.lib.mvp.module

import io.reactivex.Completable

/**
 * Created by Алексей Калайда on 10.10.2017.
 */

interface ModuleManager {

    fun create()
    fun destroy()
    fun show(module: Module): Completable

}
