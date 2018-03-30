package com.itgrx.lib.mvp

import com.itgrx.lib.mvp.module.ModuleContainer

interface MvpView {

    fun attach(container: ModuleContainer): Any?

}