package com.kotlin.base.presenter.view

/* Callback */
interface BaseView {
    fun showLoading()
    fun hideLoading()
    fun onError()
}