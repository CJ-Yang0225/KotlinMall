package com.kotlin.user.presenter

import com.kotlin.base.presenter.BasePresenter
import com.kotlin.user.presenter.view.RegisterView

open class RegisterPresenter : BasePresenter<RegisterView>() {
    fun register(mobile: String, verifyCode: String) {
        // API 業務邏輯

        mView.onRegisterResult(true)  // 回調Activity
    }
}