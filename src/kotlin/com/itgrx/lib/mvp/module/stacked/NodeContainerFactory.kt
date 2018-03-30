package com.itgrx.lib.mvp.module.stacked

import com.itgrx.lib.mvp.module.Module

/**
 * Created by Алексей Калайда on 11.10.2017.
 */

interface NodeContainerFactory {

    fun destroy()

    fun get(module: Module): NodeContainer

}
