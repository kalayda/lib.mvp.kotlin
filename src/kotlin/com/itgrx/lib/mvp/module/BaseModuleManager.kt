package com.itgrx.lib.mvp.module

/**
 * Created by Алексей Калайда on 26.12.2017.
 */
abstract class BaseModuleManager : ModuleManager {

    open fun onDisposed(module: Module) = Unit

    open fun onShown(module: Module) = Unit

}