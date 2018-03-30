package com.itgrx.lib.mvp.module

/**
 * Created by Алексей Калайда on 10.10.2017.
 */

interface ModuleContext {

    fun getModuleContainer(): ModuleContainer
    fun getModuleManager(): ModuleManager?
    fun getExtraManager(name: String): Any?

}