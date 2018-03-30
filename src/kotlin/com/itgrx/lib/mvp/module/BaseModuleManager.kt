package com.itgrx.lib.mvp.module

/**
 * Created by Алексей Калайда on 26.12.2017.
 */
abstract class BaseModuleManager(private val listener: Listener? = null) : ModuleManager {

    interface Listener {
        fun onShown(module: Module)
        fun onDisposed(module: Module)
    }

    open fun onDisposed(module: Module) {
        listener?.onDisposed(module)
    }

    open fun onShown(module: Module) {
        listener?.onShown(module)
    }

}