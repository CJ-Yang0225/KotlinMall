package com.kotlin.base.presenter

import com.kotlin.base.presenter.view.BaseView

/* 與 View 耦合 */
open class BasePresenter<T: BaseView> {
    lateinit var mView: T
}