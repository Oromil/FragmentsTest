package com.example.fragmentstest

import kotlinx.android.synthetic.main.fragment2.*

class Fragment2: BaseFragment() {

    override fun getLayoutId() = R.layout.fragment2

    override fun initViews() {
        btnGoNext.setOnClickListener { router.goToFrag3() }
    }

    companion object {
        fun getInstance(router: Router) = Fragment2().apply {
            this.router = router
        }
    }
}